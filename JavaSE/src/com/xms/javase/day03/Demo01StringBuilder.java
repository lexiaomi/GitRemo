package com.xms.javase.day03;
/**
 * 
 * ����һ���ɱ��ַ����У����Զ�̬�Ķ��ַ��������޸�
 * StringBuilder:�̲߳���ȫ����������Ч�ʸ�
 * StringBuffer:�̰߳�ȫ��ͬ������Ч�ʵ�
 * 
 * �÷��ͷ���һ��
 * ��������ڴ�����߳�ʱ�İ�ȫ���
 * 	----׷�ӣ�ɾ�����滻�����룬��ת
 * ��Ӧ�ķ�������ֵ����String
 * @author Administrator
 *
 */
public class Demo01StringBuilder {
	
	
	public static void method1(){
		//����һ�����Զ�̬��չ�ַ��Ŀɱ��ַ�����
		StringBuilder sb=new StringBuilder();
		/*
		 * append(String str)
		 * ׷��ָ�����ַ���---����ֵΪ���������͵Ķ���
		 * 
		 */
		sb.append("Hello");
		char c=sb.charAt(2);
		System.out.println(c);
		sb.append("World");
		System.out.println(sb);
		/*
		 * 
		 * ɾ����delete(int start,int end):
		 * 	ɾ��ָ��������ַ���[start,end)
		 * ����ֵΪ���������͵����Ͷ���
		 * 
		 */
		// helloworld --->ɾ��ld
		StringBuilder sb2=sb.delete(8,10);
		System.out.println(sb2);
		
		/*
		 * 
		 * �滻  replace(int start,int end,String str):
		 * ��ָ��������ַ����滻��Ԥ�����ַ���
		 * ����ֵΪ���������͵����Ͷ���
		 */
		
		StringBuilder sb3=sb2.replace(0, 5, "java");
		System.out.println(sb3);
	
		/*
		 * 
		 * ���룺insert(int index,String str)
		 * ��ָ��λ�ò���Ԥ�����ַ���
		 * ����ֵΪ���������͵����Ͷ���
		 * 
		 */
		// javaWor--->#--->java#Wor
		/*
		 * ��ָ��λ�ò���Ԥ���ַ���ʱ����Ӧ��ָ��λ���ϵ�ԭ�е��ַ�����֮����ַ�ȫ������һλ
		 */
		StringBuilder sb4=	sb3.insert(4,"#&%" );
		System.out.println(sb4);
		
		/*
		 * ��ת��reverse()
		 * ���ַ�����ת
		 */		
		StringBuilder sb5=sb4.reverse();
		System.out.println(sb5);
		
		//��������
		
		/*
		 * ��Щ������װʱ����ֵΪ���������Ͷ���ĺô���
		 * ��Ϊ�ַ�����ҪƵ�����޸ģ�ʹ�ô�����������ķ�ʽ������
		 * �������ַ����ȽϷ����������ڲ����������޸ĵ����ַ����ķ��ظ����Ͷ�������������ԭ��
		 * �Ŀɱ��ַ����еĶ����϶���޸�
		 */
	}
	
	public static void method2(){
		String str="tesk";
		StringBuffer sbf=new StringBuffer("tesk");
		sbf.reverse();
		System.out.println(sbf);
	}
	public static void test(){
		
	}
	
	public static void main(String[] args) {
		method1();
		method2();
	}
	
}
