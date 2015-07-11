/**   
* @Title: UtilObj.java
 * @Package com.upyoo.agent.util
 * @Description: TODO
 * @author StevenLii  
* @date 2015年1月25日 下午11:05:48
 * @version V1.0   
*/
package com.upyoo.util;

/**
 * @ClassName: UtilObj
 * @Description: TODO
 * 
 */
public class UtilObj {
	public static String trim(String str){
		if(str == null){
			return "";
		}else{
			return str.trim();
		}
	}
	
	public static String trim(Object obj){
		if(obj == null){
			return "";
		}else{
			return obj.toString();
		}
	}
    public static String unifyUrl(String srvURL){
    	if(srvURL.endsWith("/")){
			srvURL = srvURL.substring(0, srvURL.length()-1); 
		}
    	return srvURL;
     }
	public static boolean isEmpty(String str){
		if(str == null){
			return true;
		}else{
			if(str.trim().length() <= 0){
				return true;
			}
		}
		return false;
	}
	
	public static boolean isNotEmpty(String str){
		return !isEmpty(str);
	}
}
