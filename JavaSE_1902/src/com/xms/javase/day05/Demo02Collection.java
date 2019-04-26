package com.xms.javase.day05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ���ϣ�
 * 	�µ����ݽṹ�����Ա��治ͬ���͵�Ԫ�أ����Ҷ�̬��չ
 * ���ϵ�������
 * 	���鶨�壬����ĳ��ȹ̶������ɸ��ģ�����ӵ�Ԫ�س�����
 * 	���鶨��ĳ��ȣ�����Ҫ���¶������飬ֻ�ܱ�����ͬ���͵�Ԫ�أ������������鷳�����뼯��
 * 
 * Java�ڲ��������ṩ�˼����࣬�����ʵ�����Դ�������󣬳����ǿ��Զ�̬�ı�
 * 	����Ԫ�ص����ӻ��߼��ٶ��ı�ռ��С
 * 
 * ���Ϻ����������
 * 	1.����ȿ��Դ�����������ݣ�Ҳ���Դ�������������
 * 			�������ʹ���� ֵ���������ʹ���ǵ�ֵַ
 *  2.����ֻ�ܴ洢�������͵����ݣ��洢���ǵ�ֵַ���ڴ洢�����������͵�����ʱ��
 *  	�Ὣ�����Զ�װ����������ʹ��뼯��
 *  3.����ĳ����ǹ̶��ģ������Զ�����
 *  	���ϵĳ���(����)�ǲ����ģ���������Ԫ�ص��������ı��С
 *  
 *  ʹ�ó�����
 *  	1.���Ԫ�صĸ����ǹ̶������--ʹ������
 *  	2.���Ԫ�صĸ����ǲ�ȷ����---ʹ�ü���
 *  
 *  
 *  ���ϵļ̳���ϵ��
 *  	���ӿڣ�Collection----(Collections�����ڼ��ϵĹ�����)
 *  	�ӽӿڣ�List --���򼯺ϣ������ظ�
 *  			�±����Ԫ�أ���ȡ��˳��
 *  		ʵ���ࣺArrayList: ����ʽ(����ʵ��)
 *  			 LinkedList:����ʽ(����ʽ)
 *  			 Vector: ����ʽ(����ʵ��)
 *  	
 *  	�ӽӿڣ� Set --���򼯺�(��������)�������ظ���
 *  			   Ԫ��ֵ���ȡ�ǲ�һ���ģ�Ԫ��ֵ�����ظ�
 *  		ʵ���ࣺ---HashSet:��ϣ�㷨
 *  				---TreeSet���������㷨
 *  		
 *  ���ϵĻ���������
 *  	���ӣ�
 *  		boolean add(E e):���һ��Ԫ�ص�������
 *  	ɾ����
 *  		boolean remove(Object obj):ɾ��ָ��Ԫ��
 *  		void clear(): �������������Ԫ��
 *  	��ѯ(��ȡ)��
 *  		int size():��ȡ���ϵĴ�С
 *  		E get():���ش��б���ָ��λ���ϵ�Ԫ�ء�
 *  	�޸ģ�
 *  		
 *  	�жϣ�
 *  		bollean isEmpty(): �жϼ����Ƿ�Ϊ��
 *  		boolean contains(Object obj):�жϼ������Ƿ����ָ��Ԫ��
 *  	
 *  	
 *  	
 *  	
 *  	
 *  
 *  		
 * @author Administrator
 *
 */
public class Demo02Collection {
	
	public static void method1(){
		
		Student s1=new Student("zs",18,1);
		Student s2=new Student("ls",18,3);
		Student s3=new Student("ww",18,2);
		
		Student[] stu=new Student[]{s1,s2,s3};
		
		
		
	}
	
	public static void method2(){
		
		//��������ʵ��
		Collection<Object> c=new ArrayList<Object>();
			
		List c1=new ArrayList();
		Collection c2=new ArrayList();
		//���Ԫ��
		Student s=new Student("sd",12,1);
		c.add("a");
		c.add("a");
		c.add(1);
		c.add(s);
		c.add("dcs");
		System.out.println(c);
		//��ȡ���ϴ�С size()
		int len=c.size();
		System.out.println(len);
		System.out.println("------------------------------");
		//remove(Object obj)
		/**
		 * �Ƴ���һ��equals()�Ƚ�Ϊtrued��Ԫ��
		 * true����ʾ�Ƴ�
		 * false:��ʾû��
		 * 
		 */
		c.remove("a");
		System.out.println(c);
		/*�ж�һ�������Ƿ����ָ��Ԫ��
		 * contains(Object obj)
		 *ʹ��equals()�Ƚ�Ϊtrue,���ʾΪͬһ��Ԫ��
		 * true:��ʾ����
		 * false:��ʾ������
		 *  
		 */
		boolean bo3=c.contains("a");
		System.out.println(bo3);
		boolean bo4=c.contains("c");
		System.out.println(bo4);
		boolean bo5=c.contains(new Student("sd",12,1));
		System.out.println(bo5);
		
		//������������е�Ԫ��
		c.clear();
		System.out.println(c.size());
		c.add(null);//�жϼ����ǲ��ǿ�
		System.out.println(c.size());
		//�жϼ����ǲ��ǿ�
		/*
		 *true������Ϊ��
		 *false:���ϲ�Ϊ��
		 * 
		 */
		boolean bo6=c.isEmpty();
		System.out.println(bo6);
	}
	
	public static void method3(){
		/*
		 * ���ϵ���������
		 * boolean addAll(Collection c):���һ������
		 * boolean removeAll(Collection c):ɾ��һ������
		 * boolean containsAll(Collection c)���жϵ�ǰ�����Ƿ����ָ������
		 */
		
		List<Object> c1=new ArrayList<Object>();
		c1.add(1);
		c1.add(2);
		List<Object> c2=new ArrayList<Object>();
		c2.add(3);
		c2.add(4);
		List<Object> c3=new ArrayList<Object>();
		c3.add(5);
		c3.add(6);
		
		//�������ļ�����ӵ���ǰ������
		// c1��ӵ�c2��
		c2.addAll(c1);
		//c2.addAll(c3);
		System.out.println(c2);
		System.out.println(c1);
		System.out.println(c3);
		//�жϵ�ǰ�����Ƿ����ָ������
		//ȫ������
		boolean bo1=c2.containsAll(c1);
		System.out.println(bo1);
		//ɾ��������ָ������
		boolean bo2=c2.removeAll(c1);
		boolean bo3=c2.removeAll(c3);
		System.out.println(bo2);
		System.out.println("-------3");
		System.out.println(bo3);
	}
	
	public static void main(String[] args) {
		//method1();
		//method2();
		method3();
		
	}
	
}


class Student{
	
	String name;
	int age;
	int id;
	
	public Student() {
		
	}

	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", id=" + id + ", name=" + name + "]";
	}
	
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		}
		if(this==obj){
			return true;
		}
		if(obj instanceof Student){
			Student stu=(Student) obj;
			return name.equals(stu.name)&&id==stu.id&&age==stu.age;
		}
		
		return false;
		
	}
	
	
}