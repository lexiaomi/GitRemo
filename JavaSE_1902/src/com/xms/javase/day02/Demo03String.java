package com.xms.javase.day02;

public class Demo03String {
	public static void method1(){
		/*
		 * 1.��������ת���ַ�������
		 * 		1.String.valueOf(��������):
		 * 		��������ֵΪString����
		 * 2.�����ַ���ת�ɻ������͵���ֵ
		 * 	�﷨���������͵İ�װ��.parse��������(String str)
		 *  ����ֵΪ��Ӧ�Ļ���������ֵ
		 * 
		 */
		
		int i=23;
		String str=String.valueOf(i);
		System.out.println(str);
		// �����ַ���ת��������
		String str1="12345";
		int num=Integer.parseInt(str1);
		System.out.println(num+1);
		
		
	}
	
	
	
	public static void main(String[] args) {
		method1();
	}
}
