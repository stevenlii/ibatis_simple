/**   
* @Title: UtilLog.java
 * @Package com.upyoo.agent.util
 * @Description: TODO
 * @author StevenLii  
* @date 2015年1月25日 下午10:54:55
 * @version V1.0   
*/
package com.upyoo.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * @ClassName: UtilLog
 * @Description: TODO
 * @author lizhiqiang
 * @date 2015年1月25日 下午10:54:55
 * 
 */
public class Logj {
	private static Log logger=LogFactory.getLog(Logj.class);

	public static void info(Log logger,String message,Object... args){
		logger.info(String.format("%s,%s,%s",String.format(message,args)));
	}
	public static void info(String message,Object... args){
		logger.info(String.format("%s,%s,%s",String.format(message,args)));
	}
	public static void info(Log logger,String message){
		logger.info(String.format("%s,%s,%s",String.format(message)));
	}
	public static void info(String message){
		logger.info(String.format("%s,%s,%s",String.format(message)));
	}
	
	
	public static void warn(Log logger,String message,Object... args){
		logger.warn(String.format("%s,%s,%s",String.format(message,args)));
	}
	
	
	public static void error(Log logger, String message, Throwable t, Object... args){
		
		if(t == null){
			logger.error(String.format("%s,%s,%s",String.format(message,args)));
		}
		else{
//			logger.error(String.format("%s,%s,%s, %s",String.format(message,args)), t);
		}
	}
}
