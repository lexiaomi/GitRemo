package com.xms.javase.day07;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ���У�Queue;
 * 	��һ����������Խṹ���������˶����Ա�ķ��ʣ�
 * 	��һ�˽���һ�˳�
 * 	�ṹ�ص㣺�Ƚ��ȳ�
 * 
 * @author Administrator
 *
 */
public class Demo02Queue {
	public static void method1(){
		/*
		 * ѡ��linkedList��Ϊʵ���࣬��Ҫ����ΪQueue����Ҫ����Ӻ�ɾ���Ĳ�����LinkedList���ⷽ������ܽ�Ϊ��Խ
		 */
		Queue<String> qu=new LinkedList<String>();
		//��Ӳ�������Ԫ����ӵ���β
		/*
		 * offer():
		 * ��Ӳ�������Ԫ����Ӷ�β
		 * ����ֵΪboolean����
		 */
		boolean of1 = qu.offer("qwer1");
		boolean of2 = qu.offer("qwer2");
		boolean of3 = qu.offer("qwer3");
		
		System.out.println(qu);
		
		//���Ӳ���
		/*
		 * poll():
		 * ȡ�����ף�ȡ���󣬶����о�û��Ԫ����
		 * ����ֵ��Ϊȡ����Ӧ���͵�Ԫ��
		 * ע�⣺����˳��ȡ������Ԫ�ز���ȡ��֮���Ԫ��
		 * 
		 */
		
		String s1 = qu.poll();
		System.out.println(s1);
		System.out.println(qu);

		/*
		 * peek():
		 * �÷���ֻ��ȡ�����׵����ã��������Ӳ���
		 * 
		 */
		String p1= qu.peek();
		System.out.println(p1);
		System.out.println(qu);
		
		/*
		 * ���еı�����һ���Ե�
		 */
		System.out.println("--------------");
		while(qu.size()>0){
			String p2=qu.poll();
			System.out.println(p2);
		}
		
		System.out.println(qu);

	}
	
	public static void method2(){
		
	}
	public static void main(String[] args) {
		method1();
	}
}
