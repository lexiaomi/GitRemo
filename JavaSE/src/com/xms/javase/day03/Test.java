package com.xms.javase.day03;

public class Test {
	public static void method1(){
		long a=845734563945L;
		String str=String.valueOf(a);
		System.out.println(str);
		
		String a1="234251416544";
		long num1=Long.parseLong(a1);
		System.out.println(num1);
	}
	
	public static void method2(){
		StringBuffer sbr=new StringBuffer();// ���Ǵ���һ���յ��ַ�����
		System.out.println(sbr.append("qwerzxcdf"));//�����ַ���
		System.out.println(sbr.delete(2, 4));//�����ķ�Χ��������Ҳ�����
		System.out.println(sbr.replace(0, 4, "love"));// ��һ����Χ���滻
		System.out.println(sbr.insert(4, "shiqi"));// ĳ���±�ֵ�ĺ������ָ�����͵��ַ���
		System.out.println(sbr.reverse());//���������ַ�����
	}
	public static void main(String[] args) {
		//method1()
		method2();
		
		
	}
	
}
