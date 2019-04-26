package com.xms.javase.day09;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ʹ��RandomAccessFile�����ļ�����
 * 1.һ��һ���ֽڸ���
 * 2.ʹ���ֽ�����(�������ֽ����飬)
 * @author Administrator
 *
 */
public class Demo02RandomAccessFile {
	
	public static void method1() throws Throwable{
		/*
		 * һ���ֽ�һ���ֽڵĸ���
		 * 
		 * 3.ѭ����ȡ��ѭ��д��
		 * Դ�ļ��ж����ݣ�д��Ŀ���ļ���
		 * 4.�ر�����
		 */
		
		RandomAccessFile src=new RandomAccessFile("E:/1.txt","r");
		RandomAccessFile dest=new RandomAccessFile("E:/2.txt","rw");
		byte[] byt=new byte[10*10];
		long start=System.currentTimeMillis();
	    int len=src.read(byt);
	   // int index=-1;
	    while(len!=-1){
	    	dest.write(byt);
	    	len=src.read();
	    }
	    
//		int index=-1;
//		while((index=src.read())!=-1){
//			dest.write(index);
//		}
		dest.close();
		src.close();
	    long ends=System.currentTimeMillis();
	    
	    System.out.println("��ȡʱ�䣺"+(ends-start));
	}
	
	/*
	 * ʹ�û����ֽ����鸴���ļ����ǽ��Ͷ�д����Ϊ����߶�дЧ��
	 * 
	 * �ȴ���һ���ֽ����飬��Ϊ������
	 * byte[] b=new byte[10];
	 * 
	 * �����ֽ������ʵ�ʣ���Ӳ���е��ļ���ȡ���ֽ�������
	 * 
	 * �����ֽ����鳤�ȶ�����پ�һ���Զ�ȡ�����ڼ����
	 */
	
	public static void method2() throws Throwable{
		RandomAccessFile src=new RandomAccessFile("E:/1.txt", "r");
		RandomAccessFile dest=new RandomAccessFile("E:/3.txt","rw");
		
		byte[] byt=new byte[10];
		
		int len=-1;
		long start=System.currentTimeMillis();
		while((len=src.read(byt))!=-1){
//			dest.write(byt);
			//write(b, off, len)
			/*
			 * b:��ʾҪд����ֽ�����
			 * off:���ֽ��������һ��λ�ÿ�ʼ
			 * len:д���ֽڵ�����ĳ���
			 */
			dest.write(byt, 0, len);
		}
		dest.close();
		src.close();
		long ends=System.currentTimeMillis();
	    
	    System.out.println("��ȡʱ�䣺"+(ends-start));
	}
	 
	
	public static void method3(){
		
	}
	
	public static void main(String[] args) throws Throwable  {
	
//			method2();
			method1();
			
		
		
	}
}
