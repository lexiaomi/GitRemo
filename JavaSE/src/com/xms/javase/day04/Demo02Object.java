package com.xms.javase.day04;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Object�� ���������������͵Ķ�������
 * 	�����͵����ÿ���ָ���κ����͵Ķ���
 * @author Administrator
 *	
 *
 *	----toString():����һ����(����)����Ϣ
 *		���ڵ��Թ��ߵ�
 *	equals():�Ƚϸ������͵Ķ��󣬲�ͬ���͵Ķ���Ƚ���û��ʵ�����壬�����ǿ���ʵ�ֲ���
 *			�Ƚ����������Ƿ����ƣ����Ը���ҵ����������дequals()����
 *			
 *			�������������ĳЩ����ֵ������ͬ�ģ��������Ϊ������������ȡ�
 */
public class Demo02Object {
	public static void main(String[] args) {
		 Student stu=new Student("zs",18,'Ů');
		 Student stu1=new Student("zs",18,'Ů');
		 //@459189e1--���
		 System.out.println(stu);
		 System.out.println(stu.equals(stu1));
		 
		 ArrayList<Student> al=new ArrayList<Student>();
		 System.out.println(stu.equals(al));
//		 al.add(new Student("lisi",12,'��'));
//		 al.add(new Student("liwu",22,'��'));
//		 al.add(new Student("liliu",32,'��'));
//		 
//		 Iterator<Student> it=al.iterator();
//		 while(it.hasNext()){
//			 System.out.println(it.next());
//		 }
		 
	}
}

// ѧ����
class Student{

	String name;
	int age;
	char sex;
	public Student(){
		
	}
	
	public Student(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String toString(){
		return "����:"+name+",����"+age+",�Ա�"+sex;
	}
	
	
	public boolean equals(Object obj){
		if(obj==null)
			return false;
		if(this==obj)
			return true;

		if(obj instanceof Student){
			Student stu=(Student) obj;
			if(name.equals(stu.name)&&age==stu.age&&sex==stu.sex){
				return true;
			}
		}
		return false;
	}
	
	
	
}
