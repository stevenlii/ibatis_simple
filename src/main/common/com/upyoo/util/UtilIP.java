package com.upyoo.util;  
  
public class UtilIP {  
  
    public static String trimspace(String IP){//去掉IP字符串前后所有的空格  
        while(IP.startsWith(" ")){  
               IP= IP.substring(1,IP.length()).trim();  
            }  
        while(IP.endsWith(" ")){  
               IP= IP.substring(0,IP.length()-1).trim();  
            }  
        return IP;  
    }  
      
    public static boolean isIp(String IP){//判断是否是一个IP  
        boolean b = false;  
        IP = trimspace(IP);  
        if(IP.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")){  
            String s[] = IP.split("\\.");  
            if(Integer.parseInt(s[0])<255)  
                if(Integer.parseInt(s[1])<255)  
                    if(Integer.parseInt(s[2])<255)  
                        if(Integer.parseInt(s[3])<255)  
                            b = true;  
        }  
        return b;  
    }  
  
    public static void main(String[] args) {  
        String s ="111.110.133.244";  
        UtilIP test = new UtilIP();  
        System.out.println(test.isIp(s)?"是一个IP":"不是一个IP");  
    }  
  
}  