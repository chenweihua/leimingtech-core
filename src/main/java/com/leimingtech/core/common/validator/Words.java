package com.leimingtech.core.common.validator;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * 敏感词验证
 * @author kviuff
 *
 */
@Documented
@Constraint(validatedBy = {WordsValidators.class})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
public @interface Words {
	
	String message() default "{com.leimingtech.core.common.validator.Words.message}";
	
	Class<?>[] groups() default{};
	
	Class<? extends Payload>[] payload() default {};
	
	String field() default "";
}
