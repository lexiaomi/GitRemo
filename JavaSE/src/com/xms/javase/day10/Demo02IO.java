package com.xms.javase.day10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * �����ֽ����������
 * 	---�߼���
 * BufferInputStream:�����ֽ�������
 * 	--read()
 * BufferOutputStream:�����ֽ������
 * ---write()
 * 
 * �ڲ�����ά����һ����������(�Դ�������)
 * 
 * ����ֻ��Ҫ�رո߼������ɣ��ͼ��������Ÿ߼����Ĺرն��ر�
 * �Դ����������Լ�����һ����������ĵ�����
 * ����ͬ���ֽڳ����£�is/os��������Ҫ��bis��bos�Դ��Ļ����������ݵ�д����д��Ҫ��һЩ����Ϊ����һ�������ġ����ڡ�
 * @author Administrator
 *
 */
public class Demo02IO {
	public static void method1() throws Throwable{
		//�ͼ���
		FileOutputStream fos=new FileOutputStream("44.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		/*
		 * �Դ����������������ֻ�н��������������Ż��Զ�������һ����д�������û�������򲻻Ὣδ���Ļ���������д��
		 * 1.����flush��ǿ�ƽ�δ�������ݻ�����д��
		 * 	�ή�Ͷ�дЧ�ʣ���ʱ��Ϊ�˱�֤���ݵļ�ʱ�Ժ���Ч����Ȼ����ø÷���
		 * 2.�ر�����
		 * 
		 * 
		 * 
		 */
		/*
		 * 
		 */
		bos.write(10);
		bos.write(1);
		bos.write(30);
		
		bos.close();
		
		System.out.println("--------------------------------------");
		InputStream is=new FileInputStream("44.txt");
		
		BufferedInputStream bis=new BufferedInputStream(is);
		int d=-1;
		while((d=bis.read())!=-1){
			System.out.println(d);
			
		}
		
		
		
//		bos.flush();
		bis.close();
		
		
		
	}
	public static void method2() throws Throwable{
		FileInputStream fis=new FileInputStream("test.txt");
		FileOutputStream fos=new FileOutputStream("dest.txt");
		
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		//�Ӹ���������
		byte[] bytes=new byte[1024];
		long start =System.currentTimeMillis();
		
		int src = bis.read(bytes);
		while(src!=-1){
			bos.write(bytes,0,src);
			src=bis.read(bytes);
			
		}
		long ends=System.currentTimeMillis();
		
		bos.close();
		bis.close();
		System.out.println("������ϣ�����ʱ��"+(ends-start)+"����");
		
		
	}
	
	public static void method3(){
		
	}
	public static void main(String[] args) throws Throwable {
//		method1();
		method2();
	}
}
