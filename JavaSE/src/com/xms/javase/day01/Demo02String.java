package com.xms.javase.day01;

import java.util.Iterator;

/**
 * String :�ַ�������(������������)
 * 	1.�ַ���������"abc",���Կ�����һ���ַ�������
 * 	2.�ַ����ǳ�����һ�����岻�ɸ��ģ�
 * 		�ַ����ı��ʾ��ǣ��ַ����飻
 * 	�����������ͣ��ڴ��������ʱ��һ��ʹ��new�ؼ��ִ�������
 * 	�����ַ�����ʹ��Ƶ�ʽϸߣ�Java���ַ����Ĵ�������һ������Э��
 * 	�ȿ���ʹ��new�ؼ��ִ�������Ҳ����ʹ���������ķ�ʽ��������
 * 
 * �ַ������õĹ��췽����
 * 	1.public String():�޲ι��췽�� 
 * 		String str=new String()�ȼ���String str="";
 *  2. public String(byte[] byte):
 * 		���ֽ�����ת��Ϊ�ַ���
 *  3.public String(byte[] bytes, int index ,int length):
 *   	index:�����±�
 *   	length:����
 *   	
 *   	��ָ�����ֽ������һ����ת���ַ���
 *   
 *   4.public String(char[] c) :��char����װ�����ַ���
 *   5.public String(char[] c, int index, int length) 
 *   	index:�����±�
 *   	length:����
 *   
 *   	��ָ�����ַ������һ����ת�����ַ���	
 *   
 *   6.public String(String str):
 *   	���ַ�������ת�����ַ���
 *   	
 *   
 * @author Administrator
 *
 */
public class Demo02String {
	
	public static void method1(){
		//��������---������
		String str1=new String("abc");
		//��������--- ������(����)
		String str2="abc";
		System.out.println(str1);
		System.out.println(str2);
		
	
	}
	
	
	public void method2(){
		//�����޲ι��췽���������ַ�������---new
		String str = new String();
		//ʹ��������
		String str1="";
	}
	
	public static void method3(){
		byte[] arr1 = new byte[]{97,98,99,100,101};
		String str1 = new String(arr1);
		System.out.println(str1);
		System.out.println("-----------1------------------------------------");
		String str2 = new String(arr1,1,4);
		System.out.println(str2);
		
		System.out.println("----------------2---------------------------");
		char[] arr2 = new char[]{'a','b','c','d','e'};
		String str3 = new String(arr2);
		System.out.println(str3);
		System.out.println("---------------------------3-----------------");
		String str4=new String(arr2,0,3);
		System.out.println(str4);
		
		System.out.println("----------------------------4-------------------");
		String strr="123456";//�����ַ���
		String str5=new String(strr); // �ַ���
		System.out.println(str5);
	}
	
	
	
	public static void main(String[] args) {
		String str = "abcdef";
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i));
		}
		
		//method1();
		method3();
		
	}
}
