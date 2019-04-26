package com.xms.javase.day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

/**
 * �ֽ���д���ַ���
 * @author Administrator
 *
 */
public class Demo01RandomAccesssFile {
	public static void method1(){
		RandomAccessFile raf=null;
		try {
			raf=new RandomAccessFile(new File("String.txt"),"rw");
			/*
			 * ���룺�ļ��ı����ʽ�ͽ����ʽ(�ַ�������)��ͬ���������
			 * ���й������Ĵ�������
			 * 
			 * ���ַ���ת������
			 * д���ַ���
			 * String��getBytes()������
			 * ����ǰ�ַ���������ϵͳĬ�ϵ��ַ������룬ת�ɶ�Ӧ���ֽ�����
			 * ����ֵΪ�ֽ�����
			 * 
			 * Unicode: һ���ַ�һ���ֽ�---ֻ������Ӣ��
			 * GBK:���������ֽڱ�ʾһ���ַ�(���ĺ���)
			 * 		Ӣ��һ���ֽ�һ���ַ�
			 * UTF-8:�����
			 * 	Ӣ��һ���ֽ�һ���ַ�
			 * 	���������ֽڱ�ʾһ���ַ�(����)
			 * 	(�����ֽڱ�ʾһ�����֣��ĸ��ֽڱ�ʾ����)
			 * 
			 */
			//����ϵͳĬ�ϵ��ַ�������----GBK
			byte[] bytes = "�й���".getBytes();
			//raf.write(bytes);
			
			/*
			 * 
			 * String���п��Խ��ַ��ܰ���ָ�����ַ��������ʽ��д���ļ�
			 * getBytes(String charset)
			 */
			
			//����utf-8���룬���ַ���д���ļ���
			byte[] bytes2 = "�й���".getBytes("utf-8");
			raf.write(bytes2);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				raf.close();
				System.out.println("д��ɹ�");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void method2(){
		//������
		//�ֽ���
		InputStreamReader isr=null;
		try {
			FileInputStream fis=new FileInputStream("55.txt");
			//�ַ�ת����
			//��������ı����ʽҪ һ�£����������
			isr=new InputStreamReader(fis,"utf-8");
			/*
			 * read():
			 * һ�ζ�ȡһ���ַ�
			 * ����ֵΪ��Ӧ�ַ�������
			 * 
			 */
			int index=-1;
			while((index=isr.read())!=-1){
				System.out.println((char)index);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				isr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void method3() throws Throwable{
		//�����룬�����
		
		FileInputStream fis=new FileInputStream("test.txt");
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		FileOutputStream fos=new FileOutputStream("isr.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"gbk");

		char[] ch=new char[10];
		int read = isr.read(ch);
		while(read!=-1){
			osw.write(ch);
			read = isr.read(ch);
		}
		osw.close();
		isr.close();
		System.out.println("�������");
	}
	
	public static void main(String[] args) throws Throwable {
//		method1();
//		method2();
		method3();
	}
}
