package com.xms.javase.day02.p;
/**
 * 3.���ַ���"test"���"tset"����ڿ���̨
 * @author Administrator
 *
 */
public class TestString3 {

	public static void main(String[] args) {
		test();
	}
	public static void test(){
		String str="test";
		String s="";
		for(int i=str.length()-1;i>=0;i--){
			s+=str.charAt(i);
			System.out.println(s);
		}
	}
}
