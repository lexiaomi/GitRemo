package com.xms.javase.day09;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile:��������ļ����ݵ���
 * File���ܲ����ļ������ݣ����������ļ�����
 * ��Ҫ����һ���µ��� RandonAcsessFile
 * ---�����Ķ���֧����������ļ������ļ����ж�д����
 * ---����ķ����ǻ���ָ��Ĳ����������ڵ�ǰָ��ָ���λ�÷�����д����
 * ---"rw":�ɶ�����д
 * ---"r":ֻ��
 * 
 * @author lll
 * 
 * 
 * 
 */
public class Demo01RandomAccessFile {
	
	
	public static void method1() throws Throwable{
		//������������ļ���ʵ��---(����)
		/*
		 * 
		 * RandomAccessFile(file, mode)
		 * 		file: File����
		 * 		mode: ��дģʽ
		 * ����ģʽRandomAccesssFile����������Ҫ�ȴ���File����
		 * 
		 * 
		 * RandomAccessFile(name, mode)
		 * 	name:��Ӧ���ļ�·��
		 * mode:��дģʽ
		 * ����֮�䴴������ֱ��д�ļ�
		 * 
		 * �����ִ���RandomAccessFileʵ���Ĺ��췽��
		 * 		�ļ��Ĳ���ģʽ�� rw, r
		 * 
		 * ��ȡ��д��������������ڴ������۵ģ�
		 * 		����(�����ڴ�)--------->�ļ�(�����ڴ�):д��
		 * 		����(�����ڴ�)<----------�ļ�(�����ڴ�):��ȡ
		 * 
		 * ������
		 * 	write(int i):д�룬д����һ��int���͵ĵͰ�λ���ݣ�ָ���Զ�����
		 * 	read():��ȡ��һ�ζ�ȡһ���ֽڣ�Ȼ����뵽int���͵ĵͰ�λ��
		 * 		����ֵΪ��ȡ���ֽ���������ֵΪ-1��ʾ���ݶ�ȡ���
		 *  	һ�ζ�ȡһ���ֽڶ�ȡ���ָ�����һλ
		 * 
		 * 
		 * RandomAccessFile�ࣺ
		 * 	�ײ��װ�������������������
		 * 	1.���д����ֽ�������Դ�ļ����ֽ�������ȫ�����и���
		 *  2.���д����ֽ���С��Դ�ļ����ֽ������������д��ĵ��ֽڽ�Դ�ļ��е��ֽ�����ͷ��ʼ���е�������
		 */
		RandomAccessFile raf=new RandomAccessFile("22.txt", "rw");
		
		raf.write(3);
		raf.write(6);
		raf.write(0);
		raf.write(255);
		raf.write(-1);
//		raf.write(4);
//		raf.write(255);
		raf.close();
	}
	public static void method2() throws Throwable{
		RandomAccessFile raf=new RandomAccessFile("22.txt", "r");
		int a=raf.read();
		int b=raf.read();
		int  c=raf.read();
		int  d=raf.read();
		raf.close();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);//����-1����ʾû�����ݿɶ�
		System.out.println(d);//����-1����ʾû�����ݿɶ�
		System.out.println("��ȡ���");
	}
	
	public static void main(String[] args) throws Throwable {
//		method1();
		method2();
	}
}
