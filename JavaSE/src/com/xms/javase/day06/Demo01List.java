package com.xms.javase.day06;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * List����:������ظ��ļ���
 * �ǿ���ͨ��Ԫ���±�������Ԫ��(0��ʼ)
 * 	ʵ���ࣺ
 * 		ArrayList: ����ṹ������(��ѯ)Ч�ʸߣ�
 *		LinkedList: ����ṹ ������ɾ����Ч�ʸߣ�
 *			---��Щ�ص��ڴ����������ϴ��ʱ�򣬲����Ϊ����
 *			
 * @author Administrator
 */

public class Demo01List {
	
	
	public static void method1(){
		//����List����
		List<String> li=new ArrayList<String>();
		li.add("a");
		li.add("b");
		li.add("c");
		li.add("d");
		li.add("e");
		//System.out.println(li);
		/*
		 * get(int index)
		 * �÷���ͨ��Ԫ���±�����ȡԪ��
		 * ���±��λ�ú�Ԫ����ӵ�˳��һ�£�
		 * ����ֵΪ���Ϸ��͵�Ԫ��ֵ
		 */
		String s1=li.get(0);
		System.out.println(s1);
		/*
		 * ��ͳforѭ����������
		 * 
		 */
		System.out.println("---------------------");
		for(int i=0;i<li.size();i++){
			String ss=li.get(i);
			System.out.println(ss);
		}
		
		/*
		 * set(int index,<T> t):�޸Ļ�ֵ
		 * ʹ��tԪ�أ��滻��Ӧλ����(index)��Ԫ�ط���ֵΪ���滻��Ԫ��
		 */
		System.out.println("---------------------");
		String value=li.set(0, "A");
		System.out.println(value);
		System.out.println(li);
		
		/*
		 * add(index,<T> t):
		 * Ԫ�ز���ķ���
		 * ��������Ԫ��t,���뵽index��λ���ϣ�index��ԭ�е��Լ������Ԫ�أ�����һ������ƶ�
		 */
		System.out.println("---------------------");
		li.add(1, "B");
		System.out.println(li);
		
		/*
		 * remove(int index)
		 * �Ƴ�ָ��λ���ϵ�Ԫ�أ�����ֵΪ���Ƴ���Ԫ��
		 * 
		 */
		System.out.println("---------------------");
		String ss2=li.remove(2);
		System.out.println(ss2);
		System.out.println(li);
		
		
	}
	
	public static void test(){
		List<String> li=new ArrayList<String>();
		
		li.add("java");
		li.add("mysql");
		li.add("jsp");
		li.add("html");
		li.add("css");
		li.add("servlet");
	}
	
	public static void main(String[] args) {
		method1();
	}
}
