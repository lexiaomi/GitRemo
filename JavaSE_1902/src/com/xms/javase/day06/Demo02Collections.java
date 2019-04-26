package com.xms.javase.day06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections:��һ������Collection�ӿڼ��ϵĹ�����
 * �����װ�Ź��ڼ����ض��Ĳ�������
 * sort(List<T> list):
 * 	����Ĭ�ϵ�����˳�򣬸������ļ��Ͻ�������--����չʾ
 * 
 * 1.����ӿڣ�comparable 
 * 		����ӿڣ��൱��"�ڲ��Ƚ���"��һ����ʵ�ָýӿڣ�
 * 		��ζ�Ÿ���Ķ���֧�����򣬸���Ķ���ӵ���űȽ��ʸ�
 * ������Ҫ���¶���ȽϹ��򣬼���д compareTo����
 * 		sort(List<T> list)
 * 
 * 2.Comparator
 * 		�Ƚ������൱��"�ⲿ�Ƚ���"����ͬ�޸�Դ�룬ʵ������һ���Ƚ���
 * 		��������Ҫ�Ƚ�ʱ�������϶���ͱȽ���һ�����Ӧ�ķ�������
 * 		---sort(List<T> list,comparator mycom)
 * 
 * @author Administrator
 *
 */
public class Demo02Collections {
	
	public static void method1(){
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(2);
		list1.add(6);
		list1.add(4);
		list1.add(9);
		
		//System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		
		List<String> list2=new ArrayList<String>();
		list2.add("zhangsan");
		list2.add("lisi");
		list2.add("wangwu");
		list2.add("zhaoliu");
		
		Collections.sort(list2);
		System.out.println(list2);
	}
	
	public static void method2(){
		
		List<Student> li=new ArrayList<Student>();
		li.add(new Student("zhangsan\t",19,'��',001));
		li.add(new Student("cf\t",22,'Ů',004));
		li.add(new Student("wangwu\t",16,'��',003));
		li.add(new Student("zhaoliu\t",21,'��',005));
		li.add(new Student("lss\t",19,'Ů',002));
		li.add(new Student("cq\t",16,'Ů',012));
		li.add(new Student("zl\t",5,'Ů',102));
		//System.out.println(li);
		Collections.sort(li);
		System.out.println("----------��������---------------");
		for (Student stu : li) {
			System.out.println(stu);
		}
		System.out.println("----------�����С-(�ⲿ�Ƚ���)-Comparator-------------");
		
		//�����ⲿ�Ƚ�������
		// �ڲ��޸��ڲ��Ƚ���Դ�������£������Լ�����ķ�ʽ�����ⲿ�Ƚ���
		MyComparator my=new MyComparator();
		//sort(List<T> list,comparator mycom)
		/*
		 * list:Ҫ����ļ���
		 * mycom:�Ƚ�������
		 */
		Collections.sort(li,my);
		for (Student stu : li) {
			System.out.println(stu);
		}
		
		System.out.println("-------comparator �����ڲ��෽ʽ--------------");
		
		Comparator<Student> mycom =new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.id-o2.id;
			}
		
		};
		Collections.sort(li,mycom);
		for (Student stu1 : li) {
			System.out.println(stu1);
		}
	}
	
	public static void main(String[] args) {
//		method1();
		method2();
	}
}







class Student implements Comparable<Student>{
	String name;
	int age;
	char sex;
	int id;
	
	public Student(){
		
	}
	
	public Student(String name, int age,char sex, int id) {
		this.name = name;
		this.age = age;
		this.sex=sex;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", id=" + id + "]";
	}

	@Override
	public int compareTo(Student o) {
		/*
		 * 
		 * ʵ��Comparable�ӿ�
		 * ����ȽϹ���---�Զ���
		 * 
		 * �÷��������ǵ�ǰ����������Ķ�����бȽ�
		 * �÷�������ֵΪint���ͣ���ֵ�Ĵ�С�޹�
		 * ֻ����ֵ�������й�
		 * 1.����ǰ�Ķ�����ڸ����Ķ��󣬷���ֵΪ����0����  ---ʲ��
		 * 2.����ǰ�Ķ���С�ڸ����Ķ��󣬷���ֵΪС��0���� ---����
		 * 3.����ǰ�Ķ�������ڸ����Ķ��󣬷���ֵΪ����0���� --- ˳�򲻱�
		 * 
		 */
		//�ȽϹ���
	//	return name.compareTo(o.name);.
	  return name.length()-o.name.length();
//		if(name.length()-o.name.length()!=0){
//			return name.length()-o.name.length();
//		}else{
//			return age-o.age;
//		}
		
		
	}
	
	
}

class MyComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		/*
		 * ʵ��Comparator�ӿ�
		 * ����ȽϹ���---�Զ���
		 * 
		 * �÷��������ǵ�ǰ����������Ķ�����бȽ�
		 * �÷�������ֵΪint���ͣ���ֵ�Ĵ�С�޹�
		 * ֻ����ֵ�������й�
		 * 1.����ǰ�Ķ�����ڸ����Ķ��󣬷���ֵΪ����0����  ---ʲ��
		 * 2.����ǰ�Ķ���С�ڸ����Ķ��󣬷���ֵΪС��0���� ---����
		 * 3.����ǰ�Ķ�������ڸ����Ķ��󣬷���ֵΪ����0���� --- ˳�򲻱�
		 */
		return o1.age-o2.age;
	}
	
}






