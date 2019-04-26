package com.xms.javase.day11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * �����ַ���
 * 	PrintWriter:�����ַ������
 * 		new PrintWriter(File file):ֱ�����ļ���д������---Ĭ���ַ�������
 * 		new PrintWriter(String path):ֱ��ָ��·��д��---Ĭ���ַ����뼯(����ָ���ַ���)
 * 		new PrintWriter(OutputStream file): 
 * 		new PrintWriter(OutputStreamWriter file):��ָ���ַ��������Զ�����
 * 		new PrintWriter(OutputStreamWriter file,boolean out)::��ָ���ַ��������Զ���ˢ��
 * 			---print:�÷�������д���κ����͵�����(��һ��)
 * 			---println:�÷�������д���κ����͵�����(���Զ�����)
 * 	BufferedReader:�����ַ�������
 * @author Administrator
 *
 */
public class Demo03WR {
	public static void method1() throws Throwable{
		
		FileOutputStream fos=new FileOutputStream("pw.txt",true);
		OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
		//�����ַ������
		PrintWriter pw = new PrintWriter(fos,true);
		/*
		 * println()---���з�(�����ֽ�)
		 * �����Զ���ˢ�£��ỻ�У���δ���Ļ�����д��
		 * ����д��
		 * --�ή�Ͷ�дЧ�ʣ�
		 * 
		 * print():���������ˢ�£���Ȼ�Ὣ����д�뵽�������еȴ�������������Ȼ��һ��д��
		 * 
		 */
		pw.println("���Ǻð�1");
		pw.println("���Ǻð�2");
		pw.println("���Ǻð�3");
		pw.println("���Ǻð�4");
		pw.print("���Ǻð�1");
		pw.print("���Ǻð�2");
		pw.print("���Ǻð�3");
		pw.print("���Ǻð�4");
		
		
		pw.close();
	}
	
	public static void method2() throws Throwable{
		/*
		 * �����ַ�������
		 * 
		 */
		FileInputStream fis=new FileInputStream("pw.txt");
		InputStreamReader isr=new InputStreamReader(fis,"gbk");
		BufferedReader br=new BufferedReader(isr);
		String rl = br.readLine();
		while(rl!=null){
			System.out.println(rl);
			rl = br.readLine();
		}
		br.close();
	}
	public static void main(String[] args) throws Throwable {
//		method1();
		method2();
	}
}
