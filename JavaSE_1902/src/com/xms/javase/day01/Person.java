package com.xms.javase.day01;
/**
 * ����Ǹ��� --Person��
 * @author Administrator
 * @version 1.2
 * 
 *
 */
public class Person {
	String name;
	int age;

	/**
	 * �޲ι��췽��
	 */
	public Person(){
		
	}
	/**
	 * �вι��췽���� ��ʼ��
	 * @param name 
	 * @param age
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * ����һ���Եķ�����û�з���ֵ
	 * 
	 */
	public void eat(){
		System.out.println("��");
	}
	/**
	 * name��get���������ص���һ��name��ֵ
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * name��set������������String���͵ģ��ύname��ֵ
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * age��get���������ص���һ��age��ֵ
	 * @return
	 */
	
	public int getAge() {
		return age;
	}
	/**
	 * age��set������������int���͵ģ��ύage��ֵ
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}
