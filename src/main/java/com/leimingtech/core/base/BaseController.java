package com.leimingtech.core.base;

import java.beans.PropertyEditorSupport;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import javax.validation.Validator;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.common.collect.Maps;
import com.leimingtech.core.common.DateUtils;
import com.leimingtech.core.common.StringUtils;
import com.leimingtech.core.common.mapper.JsonMapper;
import com.leimingtech.core.common.validator.BeanValidators;

/**
 * 控制器支持类
 * @author kviuff
 * @version 2015-10-29
 */
@Slf4j
public abstract class BaseController {
	/**
	 * 验证Bean实例对象
	 */
	@Autowired
	protected Validator validator;
	
	protected String json;
	
	

	/**
	 * 服务端参数有效性验证,返回model
	 * @param object 验证的实体对象
	 * @param groups 验证组
	 * @return 验证成功：返回true；严重失败：将错误信息添加到 message 中
	 */
	protected boolean beanValidatorForModel(Model model, Object object, Class<?>... groups) {
		try{
			BeanValidators.validateWithException(validator, object, groups);
		}catch(ConstraintViolationException ex){
			List<String> list = BeanValidators.extractPropertyAndMessageAsList(ex, ": ");
			list.add(0, "数据验证失败：");
			addMessage(model, list.toArray(new String[]{}));
			return false;
		}
		return true;
	}
	
	
	/**
	 * 服务端参数有效性验证,返回json
	 * @param object 验证的实体对象
	 * @param groups 验证组
	 * @return 验证成功：返回true；严重失败：将错误信息添加到 message 中
	 */
	protected boolean beanValidatorForJson(Object object, Class<?>... groups) {
		try{
			BeanValidators.validateWithException(validator, object, groups);
		}catch(ConstraintViolationException ex){
			List<String> list = BeanValidators.extractPropertyAndMessageAsList(ex, ": ");
			list.add(0, "数据验证失败：");
			addJsonMessage(list.toArray(new String[]{}));
			return false;
		}
		return true;
	}
	
	/**
	 * 服务端参数有效性验证,返回map
	 * @param object 验证的实体对象
	 * @param groups 验证组
	 * @return 验证成功：返回true；严重失败：将错误信息添加到 message 中
	 */
	protected boolean beanValidatorForMap(Map<String, String> map, Object object, Class<?>... groups) {
		try{
			BeanValidators.validateWithException(validator, object, groups);
		}catch(ConstraintViolationException ex){
			List<String> list = BeanValidators.extractPropertyAndMessageAsList(ex, ": ");
			list.add(0, "数据验证失败：");
			addMapMessage(map, list.toArray(new String[]{}));
			return false;
		}
		return true;
	}
	
	/**
	 * 服务端参数有效性验证
	 * @param object 验证的实体对象
	 * @param groups 验证组
	 * @return 验证成功：返回true；严重失败：将错误信息添加到 flash message 中
	 */
	protected boolean beanValidator(RedirectAttributes redirectAttributes, Object object, Class<?>... groups) {
		try{
			BeanValidators.validateWithException(validator, object, groups);
		}catch(ConstraintViolationException ex){
			List<String> list = BeanValidators.extractPropertyAndMessageAsList(ex, ": ");
			list.add(0, "数据验证失败：");
			addMessage(redirectAttributes, list.toArray(new String[]{}));
			return false;
		}
		return true;
	}
	
	/**
	 * 服务端参数有效性验证
	 * @param object 验证的实体对象
	 * @param groups 验证组，不传入此参数时，同@Valid注解验证
	 * @return 验证成功：继续执行；验证失败：抛出异常跳转400页面。
	 */
	protected void beanValidator(Object object, Class<?>... groups) {
		BeanValidators.validateWithException(validator, object, groups);
	}
	
	/**
	 * 添加Model消息
	 * @param message
	 */
	protected void addMessage(Model model, String... messages) {
		StringBuilder sb = new StringBuilder();
		for (String message : messages){
			sb.append(message).append(messages.length>1?"<br/>":"");
		}
		model.addAttribute("msg", sb.toString());
	}
	
	/**
	 * 添加Json消息
	 * @param message
	 */
	protected void addJsonMessage(String... messages) {
		StringBuilder sb = new StringBuilder();
		for (String message : messages){
			sb.append(message).append(messages.length>1?"<br/>":"");
		}
		//this.json = "{\"result\":\"0\",\"message\":\""+sb.toString()+"\"}";
		showErrorJson(sb.toString());
	}
	
	/**
	 * 添加map消息
	 * @param message
	 */
	protected void addMapMessage(Map<String, String> map, String... messages) {
		StringBuilder sb = new StringBuilder();
		for (String message : messages){
			sb.append(message).append(messages.length>1?"<br/>":"");
		}
		map.put("result", "0");
		map.put("message", sb.toString());
	}
	
	/**
	 * 添加Flash消息
	 * @param message
	 */
	protected void addMessage(RedirectAttributes redirectAttributes, String... messages) {
		StringBuilder sb = new StringBuilder();
		for (String message : messages){
			sb.append(message).append(messages.length>1?"<br/>":"");
		}
		redirectAttributes.addFlashAttribute("message", sb.toString());
	}
	
	/**
	 * 客户端返回JSON字符串
	 * @param response
	 * @param object
	 * @return
	 */
	protected String renderString(HttpServletResponse response, Object object) {
		return renderString(response, JsonMapper.toJsonString(object), "application/json");
	}
	
	/**
	 * 客户端返回字符串
	 * @param response
	 * @param string
	 * @return
	 */
	protected String renderString(HttpServletResponse response, String string, String type) {
		try {
			response.reset();
	        response.setContentType(type);
	        response.setCharacterEncoding("utf-8");
			response.getWriter().print(string);
			return null;
		} catch (IOException e) {
			return null;
		}
	}
	
	/**
	 * 返回成功的json串
	 * @param message
	 */
	protected void showSuccessJson(String message){
		if(StringUtils.isEmpty(message))
			this.json="{\"result\":\"1\"}";
		else
			this.json="{\"result\":\"1\",\"message\":\""+message+"\"}";
	}
	
	/**
	 * 返回失败的json串
	 * @param message
	 */
	protected void showErrorJson(String message){
		if(StringUtils.isEmpty(message))
			this.json="{\"result\":\"0\"}";
		else
			this.json="{\"result\":\"0\",\"message\":\""+message+"\"}";
	}
	
	/**
	 * 参数绑定异常
	 */
	@ExceptionHandler({BindException.class, ConstraintViolationException.class, ValidationException.class})
    public ModelAndView bindException(Exception ex,HttpServletRequest request) {  
		
		// 编译错误信息
		StringBuilder sb = new StringBuilder("错误信息：\n");
		if (ex != null) {
			if (ex instanceof BindException) {
				for (ObjectError e : ((BindException)ex).getGlobalErrors()){
					sb.append("☆" + e.getDefaultMessage() + "(" + e.getObjectName() + ")\n");
				}
				for (FieldError e : ((BindException)ex).getFieldErrors()){
					sb.append("☆" + e.getDefaultMessage() + "(" + e.getField() + ")\n");
				}
				log.error(ex.getMessage());
			}else if (ex instanceof ConstraintViolationException) {
				for (ConstraintViolation<?> v : ((ConstraintViolationException)ex).getConstraintViolations()) {
					sb.append("☆" + v.getMessage() + "(" + v.getPropertyPath() + ")\n");
				}
			} else {
				//sb.append(Exceptions.getStackTraceAsString(ex));
				sb.append("☆" + ex.getMessage());
			}
		} else {
			sb.append("未知错误.\n\n");
		}
		
		Map<String,Object> m=Maps.newHashMap();
		m.put("msg", StringUtils.toHtml(sb.toString()));
        return new ModelAndView("commons/error_400", m);
    }
	
	/**
	 * 授权登录异常
	 */
	@ExceptionHandler({AuthenticationException.class})
    public String authenticationException() {  
        return "commons/error_403";
    }
	
	/**
	 * 初始化数据绑定
	 * 1. 将所有传递进来的String进行HTML编码，防止XSS攻击
	 * 2. 将字段中Date类型转换为String类型
	 */
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		// String类型转换，将所有传递进来的String进行HTML编码，防止XSS攻击
		binder.registerCustomEditor(String.class, new PropertyEditorSupport() {
			@Override
			public void setAsText(String text) {
				setValue(text == null ? null : StringEscapeUtils.escapeHtml4(text.trim()));
			}
			@Override
			public String getAsText() {
				Object value = getValue();
				return value != null ? value.toString() : "";
			}
		});
		// Date 类型转换
		binder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
			@Override
			public void setAsText(String text) {
				setValue(DateUtils.parseDate(text));
			}
//			@Override
//			public String getAsText() {
//				Object value = getValue();
//				return value != null ? DateUtils.formatDateTime((Date)value) : "";
//			}
		});
		// Date 类型转换
		binder.registerCustomEditor(Timestamp.class, new PropertyEditorSupport() {
			@Override
			public void setAsText(String text) {
				setValue(Timestamp.valueOf(text));
			}
		});
	}

}
