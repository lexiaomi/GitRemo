package com.xms.javase.day07;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * ջ����ʵҲ��˫�˶���
 * 	������¼һ���׷�ݵ�����
 * 	
 * 	ԭ���Ƚ����
 * 
 * 
 */
public class Demo03Deque {
	
	public static void method1(){
		//����˫�˶���
		Deque<Integer> de=new LinkedList<Integer>();
		//��ջ
		//ѹջ
		de.push(1);
		de.push(2);
		de.push(3);
		de.push(4);
		de.push(5);
		System.out.println(de);
		//��ջ
		/*
		 * pop():
		 * ȡ��ջ��Ԫ�أ�ͬʱ��Ԫ�ش�ջ���Ƴ�
		 * ����ֵΪ��Ӧ���͵�ջ��Ԫ��
		 * 
		 */
		Integer p1 = de.pop();
		System.out.println(p1);
		System.out.println(de);
		
		/*
		 * peek();
		 * ȡ��Ԫ�أ�������ջ����
		 */
		Integer p2=de.peek();
		System.out.println(p2);
		System.out.println(de);
		
		//ջ�ı���---һ���Ե�
		Iterator<Integer> it = de.iterator();
		while(it.hasNext()){
			Integer ne = de.pop();
			System.out.println(ne);
		}
		System.out.println(de);
		
	}
	
	public static void main(String[] args) {
		
		method1();
		method1();		
	}
}
