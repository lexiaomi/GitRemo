package com.xms.javase.day01;

public class Test1 {
	
	
	public static void menthod1(){
		//���ֽ�����ת�����ַ���
		byte[] arr1=new byte[]{97,98,99,100};
		String str=new String(arr1);
		System.out.println(str);
		System.out.println("-------------------");
		//��ָ�����ֽ�����һ����ת���ַ���
		String str1=new String(arr1,1,3);
		System.out.println(str1);
		System.out.println("---------------------");
		//���ַ����飬ת�����ַ���
		char[] arr2=new char[]{'1','2','3','4'};
		String str2=new String(arr2);
		System.out.println(str2);
		System.out.println("-----------------------");
		//��ָ���ַ������һ���֣�ת�����ַ���
		String str3=new String(arr2,1,3);
		System.out.println(str3);
		System.out.println("---------------------");
		//��������ת�����ַ���
		String str4="123456";
		String str5=new String(str4);
		System.out.println(str5);
	}
	
	public static void main(String[] args) {
		menthod1();
	}
}
