package com.xms.javase.day01;

public class Test3 {
	public static void main(String[] args) {
		
		
		String s1="abc";
		String s2="a"+"b"+"c";
		String s3="abc"+"";
		String s4=s1+"";
		String s5=new String("abc");// ����new�����ĺͳ������е��кι�ϵ
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);//˵���ڴ��е�ֵַ��һ��
		System.out.println(s1==s5);
		// ������(constant pool)ָ�����ڱ����ڱ�ȷ��
		
	}
}
