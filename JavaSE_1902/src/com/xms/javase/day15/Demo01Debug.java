package com.xms.javase.day15;
/**
 * ��ʽ��ʽ��
 * 	��׮--������
 * 	�ϵ����(Debug)--�Ƴ�
 * 	������ܣ�
 * 	  1.debug��ʽ����ʾ��ǰ���ڵ��ԵĴ���	
 * 	  2.Variables����������ʾ��ǰ������ֵ
 * 	  3.����༭�����������ڹۿ���ִ�д���
 * 	  4.����ṹ������ʾ���Դ���ķ���������
 * 	  5.Console����̨����
 *  
 *  F5:����ִ��,(����뺯�����߷�����)
 * 	F6:����ִ��(�ṹ����ĵ���ִ�У������뺯�����߷�����)
 * 	F7:�ɺ���/�����ڲ�����---��������
 *  F8:һֱִ�е���һ���ϵ�(����ִ��)
 * @author Administrator
 *
 */
public class Demo01Debug {
	public static void main(String[] args) {
		Student stu=new Student("zs",18,'��');
		for(int i=0;i<10;i++){
			System.out.println("-----------"+i+"-------");
			stu.add();
			int num=stu.add(1,2);
			System.out.println(num);
			if(i==5){
				stu=null;
				int num1=stu.add(1,2);
				System.out.println(num1);
				
				break;
			}
			System.out.println(stu.name);
			System.out.println(stu.age);
			System.out.println(stu.sex);
			
		}
		
	}
}


//ѧ����

class Student{
	String name;
	int age;
	char sex;
	
	//���췽��
	public Student(){
		
	}
	public Student(String name,int age,char sex){
		super();
		this.name=name;
		this.age=age;
		this.sex=sex;
		
	}
	
	public void add(){
		System.out.println("addd");
	}
	
	public int add(int a,int b){
		System.out.println("add(int a,int b)");
		return a+b;
	}
	
	
	
}