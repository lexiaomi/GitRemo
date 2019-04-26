package com.xms.javase.day09;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile:����ָ��Ĳ���
 * ���ܹ���ָ������ķ���
 * @author Administrator
 *
 */
public class Demo03RandomAccessFile {
	public static void main(String[] args) throws Throwable {
		RandomAccessFile raf=new RandomAccessFile("demo.txt", "rw");
		/*
		 * getFilePionter()
		 * ��ȡָ��ָ��ĵ�ǰλ��
		 * ����ֵΪ��������
		 * 
		 */
		
		raf.write(20);
		raf.write(2);
		raf.write(10);
		raf.write(6);
		raf.write(3);
		raf.write(4);
		raf.writeInt(20);
		long numb1=raf.getFilePointer();
		System.out.println("ָ�뵱ǰλ�ã�"+numb1);
		System.out.println("-----------------------------------------------------");
		/*
		 * 
		 * seek(long a):
		 * ����ָ��ĵ�ǰλ�ã�
		 * 	���õ����ļ���ͷ������λ�õ�ƫ����
		 * �ڸ�λ�÷�����һ�ζ�ȡ����д�����
		 * --void
		 * �������
		 * 
		 */
		raf.seek(1);
		int i1=raf.read();
		System.out.println(i1);
		System.out.println("-----------------------------------------------------");
		/*
		 * skipByte(int i)
		 * 
		 */
		
		
		raf.skipBytes(3);
		int ii1=raf.read();
		System.out.println(ii1);
		
		raf.close();
		System.out.println("����");
	}
}
