package com.xms.javase.day02.p;
/**
 * 1.���ַ���"jdk"���"DK"����ڿ���̨
 * @author Administrator
 *
 */
public class TestString {
	
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test(){
		String str = "jdk";
		String str1 = str.toUpperCase().substring(1);
		System.out.println(str1);
	}
}
