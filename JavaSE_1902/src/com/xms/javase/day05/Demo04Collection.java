package com.xms.javase.day05;

import java.util.ArrayList;
import java.util.List;

/**
 * foreach:��ǿforѭ������
 * 			Java5.0���ֵ�������
 * 
 * ��ѭ����ͨ���ڴ�ͳforѭ��
 * 	ֻ���ڱ������Ϻ�����
 * 	�﷨��for(Ԫ������  Ԫ���������ϻ���������){
 * 			�߼���
 * 		}
 * 
 * @author Administrator
 *
 */
public class Demo04Collection {
	public static void method1(){
		int[] arr=new int[]{1,2,3,4,5,6,7};
		//��ͳforѭ��
		for(int i=0;i<arr.length;i++){
			int a=arr[i];
			System.out.println(a);
		}
		
		System.out.println("--------------------");
		//��ǿ��forѭ��
		for(int a:arr){
			System.out.println(a);
		}
	}
	
	public static void method2(){
		List li=new ArrayList();
		li.add("java");
		li.add("jsp");
		li.add("mysql");
		li.add("css");
		li.add(12);
		for (Object obj : li) {
			System.out.println(obj);
			/*
			 * ��ǿ��forѭ���������﷨��ֻ���ڱ���ʱ����.class�ļ�ʱ������ѭ��ת���ɵ������������ڱ�����ʱ��
			 * 	����ʹ�ü����еķ���
			 * ---���ʾ��ǵ�����
			 * 
			 * �ڱ����Ĺ��̲�����ʹ�ü��ϵķ���
			 * ɾ�������е�Ԫ��
			 */
			
		//	li.remove(12); java.lang.IndexOutOfBoundsException:
		}
		
		
	}
	public static void main(String[] args) {
//		method1();
		method2();
	}
}
