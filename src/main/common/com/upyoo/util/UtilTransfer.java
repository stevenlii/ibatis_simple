package com.upyoo.util;

import java.text.DecimalFormat;

public class UtilTransfer {
	
	/**
	 * t=bytes/1024/1024/1024/1024
	 * bytes > T
	 * @param b
	 * @return
	 */
	public static Double b2t(Double b) {
		 return b2g(b)/1024;
	}
	/**
	 * g = bytes/1024/1024/1024
	 * @param b
	 * @return
	 */
	public static Double b2g(Double b) {
		 return kb2g(b)/1024;
	}
	
	/**
	 *g=kb/1024/1024
	 * @param b
	 * @return
	 */
	public static Double kb2g(Double b) {
		 return m2g(b)/1024;
	}
	/**
	 * g=M/1024
	 * @param b
	 * @return
	 */
	public static Double m2g(Double b) {
		if (b == null) {
			return (double) 0;
		}
		 return b/1024;
	}
	
	public static Double doubleformat(Double d) {
		 DecimalFormat df = new DecimalFormat("#.00");
		  
		 String td=df.format(d);
		 d=Double.valueOf(td);
		 return d;
	}
	//bytes> g
	public static Double quickB2G(Double b) {
		
		 return doubleformat(b2g(b));
	}
	//KB>G
	public static Double quickKB2G(Double b) {
		
		 return doubleformat(kb2g(b));
	}
	// M>G
	public static Double quickM2G(Double b) {
		
		 return doubleformat(m2g(b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double d= null;
		System.out.println(doubleformat(b2g(d)));
	}

}
