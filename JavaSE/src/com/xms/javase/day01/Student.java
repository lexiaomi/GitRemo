package com.xms.javase.day01;
/**
 * ����һ��ѧ���࣬�̳���Person��
 * @author ������
 * @see java.lang.String
 *
 */
public class Student extends Person {
	
	long id;
	public Student(){
		
	}
	public Student(String name,int age,long id){
		super(name,age);
	}
	/**
	 * ����id��ֵ��
	 * ���ص��� ѧ��id��
	 * @param id
	 * @return
	 */
	public long retu(long id){
		return id;
		
	}
}
