package com.xms.javase.day10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * �ֽ���
 * �����ֽ���
 * ������
 * 
 * 
 * �ַ���(ת����  ���ֽ�--->�ַ�)���߼���
 * ���������ࣺ
 * 		Reader:�ַ�������(����)
 * 		Writer:�ַ������(����)
 * 
 * ʵ���ࣺ
 * 		OutputStreamReader:�ַ������
 * 			OutputStreamReader(OutputStream os)
 * 			OutputStreamWriter(out,  String charsetName)
 * 		InputStreamReader:�ַ�������
 * 		InputStreamReader((InputStream in)
 * 		InputStreamReader((InputStream in,  String charsetName)
 * 		
 * �����ַ����ֽ���
 * 	Reader��Writer�����ַ���
 * 	�ַ�����������������ַ�Ϊ��λ��д����
 * 	�ַ���ֻ�����ڶ�ȡ�ַ�����
 * 		---���ڶ�д�ı������ܶ�ȡͼƬ����Ƶ....
 * 		---�ֽ������Զ�ȡ��Ƶ��ͼƬ����Ƶ......
 * @author Administrator
 *
 */
public class Demo04Object  {
	public static void method1() throws Throwable{
		FileOutputStream fos=new FileOutputStream("55.txt");
		//�߼���---�ַ���
		OutputStreamWriter osr=new OutputStreamWriter(fos,"utf-8");
		/*
		 * write(String str)
		 * write(char[] c)
		 * write(int i)
		 */
		FileReader fr=new FileReader("22.txt");
		osr.write("�й�");
		osr.write(20);
		System.out.println("�������");
		osr.close();
		
	}
	public static void main(String[] args) throws Throwable {
		method1();
	}
}
