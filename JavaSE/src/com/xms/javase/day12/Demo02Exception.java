package com.xms.javase.day12;
/**
 * �׳���
 * 	throws:
 * 		���ڷ����ĵ������ϡ���ʾ�����߸÷������ܻ����ĳЩ�쳣
 * 		1.��try-catch
 * 		2.�׳�throws
 * @author Administrator
 *
 */
public class Demo02Exception {
	public static void main(String[] args) {
		Student s=new Student();
		try {
			s.setAge(230);
			System.out.println(s.getAge());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("���Ͻ���Ƿ�ҵ���ʲô��");
	}
}

class Student{
	
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age){
		if(age<0||age>200){
			throw new RuntimeException("������0-200֮��");
		}
		
		this.age = age;
	}
	
	
	
}
