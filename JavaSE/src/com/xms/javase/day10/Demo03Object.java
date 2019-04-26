package com.xms.javase.day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ��������
 * 	���Ա���һ������
 * 	1.������ת���ֽڣ�
 * 	2.���ñ��浽Ӳ����
 * 	
 * 1.��һ���ض������ݽṹ��ת����һ���ֽڵĹ��̽������л�
 * 2.���������д�뵽Ӳ���������ñ���Ĺ���--�־û�
 * 3.��һ���ֽ�ת���ض������ݽṹ�Ĺ���---�����л�
 * 
 *
 * ���л� �������л������ã�
 * 	1.���ݴ��䣺
 * 	2.���ݱ��棺
 * 
 * ObjectInputStream():����������
 * 	---readObject()
 * ObjectOutputStream()�����������
 * 	---writeObject()
 * 
 * 
 * Serializable:�ӿ�
 * �����Ҫ��һ����Ķ���������л�����ô��������Ҫʵ�ֿ����л��Ľӿڼ�Serializable
 * һ��ĳ����ʵ���˸ýӿڣ����ʾ�����Ķ���߱������л����ʸ�
 * 
 * private static final long serialVersionUID = 1L;
 * ���������л�֮�󣬶Ը�������Ի��߷����Ƚ������޸ģ�����ֲ�ͬ���쳣��Ϊ�˷�ֹ�쳣����������һ��
 * serialVersionUID,��ֹ�ڷ����л�ʱ�����쳣
 * IDE�Զ�����
 * 
 * transient:
 * 	���γ�Ա�����������л����Ժ��Ը����Ե�ֵ(�����л�ʱ�����Ե�ֵ�����棬�����Դ���)
 * 	�ڷ����л�ʱ�и����ԵĴ��ڣ�û��֮ǰ��������ݣ�ֻ��Ĭ��ֵ
 * 
 * @author Administrator
 *
 */
public class Demo03Object {
	//���л�
	public static void method1() throws Throwable{
		
		//�ͼ���
		
		FileOutputStream fos=new FileOutputStream("Student.txt");
		//�߼���---������
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Student stu=new Student("����",20,120);
		/*
		 * void write(Object o)
		 * �÷�����ObjectOutputStream ���еķ���
		 * �÷����������Ķ���ת��һ���ֽں�д��Ŀ���ļ���
		 * ---void
		 */
		
		oos.writeObject(stu);
		
		
		oos.close();
		System.out.println("���л����");
		
		
	}
	//�����л�
	public static void method2() throws Throwable{
		//�ͼ���
		FileInputStream fis=new FileInputStream("Student.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		/*
		 * 
		 * readObject():
		 * ��ȡһ�����󣬷���ֵΪObject����
		 * ��Ҫ����ǿ��ת�����ܵ��ö�Ӧ���͵ĳ�Ա�����ͳ�Ա����
		 * 
		 * 
		 */
		
		Object obj = ois.readObject();
		if(obj instanceof Student){
			Student s=(Student) obj;
			System.out.println(s.name);
			System.out.println(s.age);
			System.out.println(s.id);
			s.study();
			
		}
		
		ois.close();
		System.out.println("�����л����");
		
	}
	
	public static void main(String[] args) throws Throwable {
		method1();
		method2();
	}
	
	
}


//ѧ����

class Student implements Serializable{
	/**
	 * IDE�Զ����ɵİ汾��
	 */
	private static final long serialVersionUID = 1L;
	String name;
	transient int age;
	int id;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age,int id) {
		this.name = name;
		this.age = age;
		this.id=id;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	public void study(){
		System.out.println("ѧ��ѧϰ");
	}
	
	
}