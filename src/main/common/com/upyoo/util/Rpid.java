package com.upyoo.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * ****************** 类说明 ********************* 
 * class : 			Generate
 * description : 	目前用于生成RPID
 * @see :
 * @version : 1.0 
 * ***********************************************
 */
public class Rpid {

	/**
	 * @Title: getRpid
	 * @Description: 生成rpid
	 * @return
	 * @throws
	 */
	public static String generate() {
//		String rpid = getPrefix() + getTime() + getRandData(5);
		Random random = new Random();
		String rpid = getRandData(5+random.nextInt(10)) + getTime() + getRandData(5+random.nextInt(10));
		return rpid;
	}


	/**
	 * @Title: prefix
	 * @Description: 前缀为U
	 * @return
	 * @throws
	 */
	private static String getPrefix() {
		String prefix = "U";
		return prefix;
	}

	/**
	 * @Title: Time
	 * @Description: 时间生成10 位
	 * @return
	 * @throws
	 */
	private static String getTime() {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MMddHHmmss");
		String time = sdf.format(now);
		return time;
	}

	// 随机生成，num = 5
	private static char[] randNum(int num) {
		char[] s = new char[num];
		int i = 0;
		int n = 0;
		while (i < num) {
			char c = NUM_DIGITAL[(int) (Math.random() * NUM_DIGITAL.length)];
			for (int j = 0; j < s.length; j++) {// 去重
				if (s[j] == c) {
					n = 1;
					break;
				}
			}
			if (n == 1) {
				n = 0;
				continue;
			} else {
				n = 0;
				s[i] = c;
				i++;
			}
		}
		return s;
	}

	private static String getRandData(int num) {
		char[] s = randNum(num).clone();
		return String.valueOf(s);
	}
	
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		int count = 0;
		int index = 1;
		while(true){
			String rpid = generate();
			System.err.println(rpid);
			if(list.contains(rpid)){
				System.out.println("重复啦...." + list.size());
				break;
			}
			count++;
			
			if((count * index) % 10000 == 0 && count >= 10000){
				System.out.println("已经做了" + count + "个，还没有重复。");
				index++;
			}
		}
	}
	

	/**
	 * 所有的大写、小写字母加数字(共62位)
	 */
	private static final char[] NUM_DIGITAL = { 'A', 'B', 'C', 'D', 'E', 'F',
			'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
			'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f',
			'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
			't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9' };
}
