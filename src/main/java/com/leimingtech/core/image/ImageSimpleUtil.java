//package com.leimingtech.core.image;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//
//import org.apache.commons.io.IOUtils;
//
//import com.alibaba.simpleimage.ImageFormat;
//import com.alibaba.simpleimage.ImageRender;
//import com.alibaba.simpleimage.SimpleImageException;
//import com.alibaba.simpleimage.render.ReadRender;
//import com.alibaba.simpleimage.render.ScaleParameter;
//import com.alibaba.simpleimage.render.ScaleRender;
//import com.alibaba.simpleimage.render.WriteRender;
//
//public class ImageSimpleUtil {
//	
//	/**
//	 * 生成图片的宽度
//	 */
//	private static int generation_width;
//	/**
//	 * 生成图片的高度
//	 */
//	private static int generation_height;
//	
//	/**
//	 * 原图的宽度
//	 */
//	private static int originalWidth;
//	
//	/**
//	 * 原图的高度
//	 */
//	private static int originalHeight;
//	
//	/**
//	 * 文件输入流
//	 */
//	private static FileInputStream fileInput;
//	
//	/**
//	 * 文件输出流
//	 */
//	private static FileOutputStream fileOuput;
//	
//	/**
//	 * 生成缩略图
//	 * @param fromFile  原图
//	 * @param targetFile  生成图
//	 * @param width  宽度
//	 * @param height 高度
//	 */
//	public static void scaleImage(String fromFile, String targetFile, int width, int height){
//		getFieInputStream(fromFile);     // 输入流
//    	getFileOuputStream(targetFile);  // 输出流
//        ScaleParameter scaleParam = new ScaleParameter(width, height);  //将图像缩略到w*h以内，不足w*h则不做任何处理  
//        try {  
//            ImageRender rr = new ReadRender(fileInput);  
//            ImageRender sr = new ScaleRender(rr, scaleParam);  
//            renderImage(sr);                       //触发图像处理  
//        } catch(Exception e) {  
//            e.printStackTrace();  
//        } 
//	}
//	
//	/**
//	 * 生成缩略图
//	 * @param fromFile  原图
//	 * @param targetFile  生成图
//	 * @param width  宽度
//	 */
//	public static void scaleImageWithWidth(String fromFile, String targetFile, int width){
//        try {
//        	getFieInputStream(fromFile);     // 输入流
//        	getFileOuputStream(targetFile);  // 输出流
//        	resizeToWidth(fromFile, width);  // 获取生成图片高度宽度
//        	ScaleParameter scaleParam = new ScaleParameter(generation_width, generation_height);  //将图像缩略到w*h以内，不足w*h则不做任何处理 
//        	ImageRender rr = new ReadRender(fileInput);
//        	ImageRender sr = new ScaleRender(rr, scaleParam); 
//        	renderImage(sr);                 // 触发图像处理  
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	/**
//	 * 生成缩略图
//	 * @param fromFile  原图
//	 * @param targetFile  生成图
//	 * @param height  高度
//	 */
//	public static void scaleImageWithHeight(String fromFile, String targetFile, int height){
//		try {
//        	getFieInputStream(fromFile);       // 输入流
//        	getFileOuputStream(targetFile);    // 输出流
//        	resizeToHeight(fromFile, height);  // 获取生成图片高度宽度
//        	ScaleParameter scaleParam = new ScaleParameter(generation_width, generation_height);  //将图像缩略到w*h以内，不足w*h则不做任何处理 
//        	ImageRender rr = new ReadRender(fileInput);
//        	ImageRender sr = new ScaleRender(rr, scaleParam); 
//        	renderImage(sr);                   // 触发图像处理  
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	/**
//	 * 生成图片
//	 * @param sr
//	 */
//	private static void renderImage(ImageRender sr){
//		WriteRender wr = null; 
//		try {
//			wr = new WriteRender(sr, fileOuput);  
//	        wr.render();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			IOUtils.closeQuietly(fileInput);         //图片文件输入输出流必须记得关闭  
//            IOUtils.closeQuietly(fileOuput);  
//            if (wr != null) {  
//                try {  
//                    wr.dispose();                   //释放simpleImage的内部资源  
//                } catch (SimpleImageException ignore) {  
//                    // skip ...   
//                }  
//            }
//		}
//	}
//	
//	/**
//	 * 计算生成图片的宽度和高度
//	 * @param fromFile 原图
//	 * @param width    生成的图片的宽度
//	 */
//	private static void resizeToWidth(String fromFile, int width){
//		if(originalWidth < width){
//			generation_width = originalWidth;
//			generation_height = originalHeight;
//		}else{
//			int rate = originalWidth/width;
//			generation_height = originalHeight * rate;
//			generation_width = width;
//		}
//	}
//	
//	/**
//	 * 计算生成图片的宽度和高度
//	 * @param fromFile  原图
//	 * @param height    生成图片的高度
//	 */
//	private static void resizeToHeight(String fromFile, int height){
//		int rate = height/originalHeight;
//		generation_width = originalWidth * rate;
//		generation_height = height;
//	}
//	
//	/**
//	 * 获取图片输入流以及原图的长宽
//	 * @param fromFile
//	 */
//	private static void getFieInputStream(String fromFile){
//		try {
//			File in = new File(fromFile);          //原图片
//			fileInput = new FileInputStream(in);
//			ImageRender rr = new ReadRender(fileInput);
//	    	originalWidth = rr.render().getWidth();
//	    	originalHeight = rr.render().getHeight();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	/**
//	 * 获取图片输出流
//	 * @param targetFile
//	 */
//	private static void getFileOuputStream(String targetFile){
//        try {  
//        	File out = new File(targetFile);       //目的图片  
//        	fileOuput = new FileOutputStream(out);  
//        } catch(Exception e) {  
//            e.printStackTrace();  
//        } 
//	}
//	
//	
//	public static void main(String[] args) {   
//		//scaleImage("", "", 100, 100);
//		//scaleImage("/Users/kviuff/Downloads/7675.png", "/Users/kviuff/Downloads/7675.png", 300, 300);
//		
//		File in = new File("/Users/kviuff/Downloads/67898765.PNG");      //原图片  
//        File out = new File("/Users/kviuff/Downloads/678987651111.PNG");       //目的图片  
//        ScaleParameter scaleParam = new ScaleParameter(1024, 1024);  //将图像缩略到1024x1024以内，不足1024x1024则不做任何处理  
//          
//        FileInputStream inStream = null;  
//        FileOutputStream outStream = null;  
//        WriteRender wr = null;  
//        try {  
//            inStream = new FileInputStream("/Users/kviuff/Downloads/67898765.PNG");  
//            outStream = new FileOutputStream("/Users/kviuff/Downloads/678987651111.PNG");  
//            ImageRender rr = new ReadRender(inStream);  
//            ImageRender sr = new ScaleRender(rr, scaleParam);  
//            wr = new WriteRender(sr, outStream, ImageFormat.JPEG);  
//          
//            wr.render();                            //触发图像处理  
//        } catch(Exception e) {  
//            e.printStackTrace();  
//        } finally {  
//            IOUtils.closeQuietly(inStream);         //图片文件输入输出流必须记得关闭  
//            IOUtils.closeQuietly(outStream);  
//            if (wr != null) {  
//                try {  
//                    wr.dispose();                   //释放simpleImage的内部资源  
//                } catch (SimpleImageException ignore) {  
//                    // skip ...   
//                }  
//            }  
//        } 
//    }  
//
//}
