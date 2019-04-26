package com.xms.javase.day05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ���ϵı�����
 * 	1.����������
 * 	2.��ǿforѭ��
 * @author Administrator
 *
 */
public class Demo03Collection {
	public static void method1(){
		/*
		 * ��������������Iterator�ӿ�
		 * Javaϣ������ʹ��ͳһ�ķ�ʽ����������
		 * �����˱������ϵĽӿ�Iterator�ӿ�
		 * ͬʱ����������α�������---������
		 * ʹ�õ������������ϵĲ���
		 * 	1.�Ȼ�ȡ������
		 *  2.�ʣ��Ƿ���Ԫ��--hashNext():ѯ���Ƿ�����һ��Ԫ�أ�true:�У�false:û��
		 *  				
		 *  					���ָ��ķ�����Ԫ�أ��򷵻�ֵΪtrue
		 *  					���ָ��ķ���û��Ԫ�أ��򷵻�ֵΪfalse
		 *  3.ȡ������о�ȡ
		 *  	---next():�÷������ڻ�ȡԪ��ֵ������ֵ����ΪObject����
		 *  		next()�ǻ���ָ��Ĳ�����ÿ�ε��ø÷�����ָ�������һλ��ָ��ǰԪ��ֵ
		 *  			ȡ���ǵ�ǰָ��ָ���Ԫ��ֵ
		 *  		
		 *  4.ɾ�������п���
		 */
		
		List<Object> li=new ArrayList<Object>();
		li.add("java");
		li.add("mysql");
		li.add("css");
		li.add("html");
		li.add("js");
		li.add(new Student1("zs",18));
		//��ȡ����������
		Iterator<Object> it=li.iterator();//���ص��ǵ���������
		while(it.hasNext()){
			
			Object obj=it.next();
			if(obj instanceof String){
				/*
				 * �ڵ�������������ʱ��������ͨ�����ϵ���ط�����ɾ��������Ԫ��
				 * ���������쳣 java.util.ConcurrentModificationException
				 * ֻ��ͨ���������ķ���ɾ��Ԫ��
				 * 
				 */
				//li.remove("js");
				if(obj.equals("js")){
					it.remove();
				}
				
			}
			System.out.println(li);
			System.out.println(obj);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		method1();
	}
}

class Student1{
	
	String name;
	int age;
	
	public Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student1 [age=" + age + ", name=" + name + "]";
	}
	
	
	
	
	
	
	
}
