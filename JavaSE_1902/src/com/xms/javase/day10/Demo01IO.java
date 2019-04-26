package com.xms.javase.day10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * IO�������������(����������ڴ�)
 * 	����(����)----->����  ����
 * 	����<-----(�ļ�)����  ���
 * 	InputStream: �����࣬�����ֽ��������ĸ���
 * 		--	read()
 * 	OutputStream: �����࣬�����ֽ�������ĸ���
 * 		-- write()
 * 
 * 
 * �ڵ�����(�ͼ���) ���Դӡ���һ���ض��ĵط���ȡ/д������
 * ��������(�߼���) ��һ���Ѿ����ڵĵͼ������з�װ���ǽ����ڵͼ����Ļ���֮�ϣ����ᵥ�����ڣ�����Ƕ��ʹ��
 * 
 * 
 * ʵ������
 * 	---�ļ����������
 * 	---�ͼ���
 * 		FileInputStream
 * 			--read()  read(byte[], buf);
 * 		FileOutputStream
 * 			-write(int i) write(buf[],0,len)
 * @author Administrator
 *
 */
public class Demo01IO {
	public static void method1() throws Throwable{
		//�����
		/*
		 * new FileOutputStream("22.txt")
		 * name:�ļ��е�·����
		 * ����һ��ָ���ļ����������ݣ���д�����ݻὫԴ�ļ��е��������������Ȼ����д��
		 * ��һ���RandomAccessFile��ͬ
		 * 
		 * 
		 * FileOutputStream(file, append)
		 * 
		 * name:·����
		 * append: �Ƿ�׷������
		 * 	true:��ʾ��ԭ�����ݺ���������ݣ�
		 *  false:��ʾ������ݼ����������
		 */
		
		FileOutputStream fos=new FileOutputStream("22.txt");
		//new FileOutputStream(file, append)
		String str="lsdasaj";
		fos.write(str.getBytes());
		fos.write("�й���".getBytes());
		
		fos.close();
		System.out.println("������");
		
		//������
		InputStream is=new FileInputStream("22.txt");
		byte[] by=new byte[13];
		int i=is.read(by);
		String s=new String(by,0,by.length);
		System.out.println(s);
		
	}
	
	public static void method2() throws Throwable{
		InputStream is=new FileInputStream("22.txt");
		
		OutputStream os=new FileOutputStream("33.txt");
		BufferedInputStream bis= new BufferedInputStream(is);
		BufferedOutputStream bos=new BufferedOutputStream(os);
		
		byte[] bytes=new byte[10];
		
		int len = bis.read(bytes);
		while(len!=-1){
			bos.write(bytes,0,len);
			len=bis.read(bytes);
		}
		bos.close();
		bis.close();
		os.close();
		is.close();

		System.out.println("���");
		
		
		
		 
		
	}
	public static void main(String[] args) throws Throwable {
//		method1();
		method2();
	}
}
