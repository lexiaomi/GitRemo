package com.xms.javase.day05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
 * ���ͣ�jdk1.5֮����ֵ�
 * ���ã����Ƽ���������ŵ�Ԫ������
 * 		������ڶԼ��������ݵĲ���
 * 		���м��϶�֧�ַ���
 * 		������Ҳ֧�ַ���
 * 		
 * 
 * @author Administrator
 *
 */
public class Demo05Collection {
	@Test
	public  void method1(){
		//���뷺��
		//����ǰ��Ҫһ��
		List<String> li=new ArrayList<String>();
		li.add("java");
		li.add("jsp");
		li.add("servlet");
		li.add("mysql");
		Iterator<String> it=li.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			//String str=it.next();
			
		}
	}
//	public static void main(String[] args) {
//		method1();	
//	}
}
