package com.xms.javase.day08;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;

/**
 * 
 * File:
 * 	  �ļ��������ļ��ӵĳ��������ʽ
 * 	1.����ֱ�Ӷ��ļ����ݲ���
 * 	2.��Ҫ����һ���ļ�/�ļ��У���Ҫһ�������ļ�/�еĶ���
 * 	ֻ�ܻ�ȡ�ļ����ļ��е��ܱ���Ϣ�����ܲ�������
 * @author Administrator
 *
 */
public class Demo02File {
	public static void method1() {
		/*
		 * java ��ƽ̨��һ�α��봦�����У������Ĵ�
		 * �ļ��ָ���
		 * Windows:\
		 * Linux:/
		 * 
		 * Ϊ�˽����ƽ̨�ļ��ָ���������ķ��߼��Դ���
		 * ����һ��������
		 * separator:������������ڸ���ƽ̨�ϣ�����ƽ̨�����ԣ��Զ���Ӧ��Ӧ���ļ��ָ��
		 * ����File��---�����ļ��ָ�����ƽ̨��һЩ
		 * �﷨��File.separator 
		 * 
		 *  /
		File f1=new File("E:"+File.separator+"1.txt");
		File f2=new File("E:"+File.separator+"1");//��ʾ�ļ���
		
		
		
		/*
		 * ·����
		 * 	����·��(ȫ·��)�����̷���ʼѰ�ҵ�·��
		 *  ���·������һ����������յĶ����ǵ�ǰ����Ŀ
		 *  �������Ŀ��Ѱ���ļ������ļ���
		 *  
		 *  ./:��ʾ���ǵ��ڵ�Ŀ¼(��ǰ��Ŀ��)
		 *  ../:��ʾ���Ϸ���һ��(����Ŀ¼)
		 */
		//���·��
		File f3=new File("./2.txt");
		File f4=new File("../../2.txt");
		String path = f3.getPath();
		System.out.println();
		
	}
	
	public static void method2(){
		//ʹ��File��ķ�������ȡ�ļ�����Ϣ
		File f1=new File("../1.txt");//��ȡ�ļ�
		File f2=new File("../test");//��ȡ�ļ���
		
		/*
		 * getName():
		 * 1.��ȡ�ļ��������ļ��е�����
		 * ����ֵΪ�ַ���
		 */
		
		String fileName=f2.getName();
		System.out.println(fileName);
		
		/*
		 * exits():
		 * 1.�ж��ļ�����Ŀ¼�Ƿ����
		 * ����ֵ�ǲ�������
		 * 
		 */
		
		boolean bo1 = f1.exists();
		System.out.println(bo1);
		
		System.out.println("------------------------------2");
		/*
		 * length():
		 * ��ʾ�ļ���ռ���ֽ���
		 * 2.����ֵΪ�������͵��ֽ���(long)
		 * ���ļ�������û�г��ȵģ������ļ����а������ı��ж��ٵ��ֽڣ�
		 */
		File f3=new File("./test/1.txt");
		long l1=f3.length();
		System.out.println("�ļ����ֽڴ�С:"+l1);
		
		long l2=f2.length();
		System.out.println("�ļ��е��ֽڴ�С��"+l2);
		System.out.println("------------------------------3");
		
		/*
		 * 
		 * canRead():�ɶ�
		 * canWrite(): ��д
		 * canExecute:��ִ��
		 * true:��ʾ�ɶ�/��д
		 * false:��ʾ���ɶ�/����д, ����ִ��
		 * �ļ����ɶ�����һ������д
		 * ��д�Ϳɶ�
		 */
		
		boolean bo2 = f1.canWrite();
		boolean bo3=f3.canRead();
		boolean bo4=f3.canExecute();
		System.out.println(bo2);
		System.out.println(bo3);
		System.out.println(bo4);
		
		System.out.println("------------------------------4");
		/*
		 * lastModified():
		 * 1.����޸ĵ�ʱ��
		 * 2.����ֵ����Ϊ��������(long ,1970/1/1�����ڵĺ�����)
		 * 
		 */
		long l3 = f3.lastModified();
		System.out.println("ʱ�䣺"+l3);
		
		System.out.println("------------------------------5");
		//�������ļ�����
		/*isFile()
		 * 1.��ʾ��ǰ��File�����Ƿ����ļ�
		 * 2.boolean���͵ķ���ֵ 
		 * 
		 */
		boolean bo5=f3.isFile();
		System.out.println(bo5);
		/*
		 * isDirectory()��
		 * �жϵ�ǰ�����Ƿ�Ϊ�ļ���(Ŀ¼)
		 * ����ֵΪboolean���� 
		 * 
		 */
		System.out.println("------------------------------6");
		boolean bo6 = f2.isDirectory();
		boolean bo7=f3.isDirectory();
		System.out.println(bo6);
		System.out.println(bo7);
		
	}
	
	public static void method3(){
		/*
		 * creatNewFile():
		 * ����һ���ļ�
		 * ����ֵΪboolean����
		 * true��ʾ�����ɹ�
		 * delete():ɾ��һ���ļ�����һ���ļ���
		 * ����ֵboolean����
		 * 
		 * �����ļ�/�ļ���,ɾ���ļ�/�ļ��в�����
		 * 1.���ж��Ƿ����
		 * 2.�ٲ�������������ɾ��
		 */
		
		File file=new File("test.txt");
		if(!file.exists()){
		try {
			boolean bo1=file.createNewFile();
			
			System.out.println("�����ļ�"+bo1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}else{
			boolean bo2=file.delete();
			System.out.println("ɾ���ļ���"+bo2);
		}
		
		System.out.println("------------------------------1---------");
		
		/*
		 * 
		 * mkdir():����һ��Ŀ¼
		 * mkdirs(): ����һ���༶Ŀ¼
		 * delete():ɾ��Ŀ¼ʱ��ֻ��ɾ���յ�Ŀ¼
		 * 	��ɾ���༶Ŀ¼ʱ��������ɾ����ײ��Ŀ¼
		 */
//		File file1=new File("test1");
//		if(!file1.exists()){
//			boolean bo2=file1.mkdir();
//			System.out.println("�����ļ���"+bo2);
//		}else{
//			boolean bo3=file1.delete();
//			System.out.println("ɾ���ļ���"+bo3);
//		}
		
		System.out.println("-----------------------------2");
		//����һ���༶Ŀ¼
		File file2=new File("test2/a/b/c");
		if(!file.exists()){
			boolean bo5=file2.mkdirs();
			System.out.println("�����༶Ŀ¼��"+bo5);
		}else{
			System.out.println("ɾ���༶Ŀ¼��"+file2.delete());
		}
		/*
		 * ɾ���༶Ŀ¼����Ҫ����ײ��ʼɾ����ֱ���������ļ���ɾ���ɿյ��ļ��У����ܱ�����ɾ���ļ���
		 * ---�ݹ�
		 * 
		 */
		/*
		 * getParentFile():
		 * ��ȡ��ǰ�ļ�/�ļ��е��ϼ�·��
		 * 1.����ֵ��File����
		 * getParent():
		 *  ��ȡ��ǰ�ļ�/�ļ��е��ϼ�·��
		 * 1.����ֵ��String���ͣ�
		 */
		
		System.out.println("----------------3--------------------------");
		System.out.println("----------------3--------------------------");
		File ff=file2.getParentFile();
		String ffs=file2.getParent();
		System.out.println(ff);
		System.out.println(ffs);
		
		System.out.println("----------------3--------------------------");
		/*
		 * �鿴һ��Ŀ¼�������ļ�/�ļ���
		 * listFiles():
		 * �÷����Ƿ��ص�ǰFile����Ŀ¼�����е��ļ�/�ļ���
		 * ����ֵΪFile���͵�����(File[])
		 * 
		 * 
		 * listFiles(FileFilter ,ft):
		 * ���صķ������÷���֧���ļ��������������ļ��������ж���ķ�ʽ������ָ��Ҫ����ļ�
		 * ���ص�����ָ������ɸѡ��File����
		 */
		
		File f3=new File(".");
		if(f3.exists()){
			File[] lf= f3.listFiles();
			
			for (File file3 : lf) {
				if(file3.getName().endsWith(".txt")){
					System.out.println(file3);
				}
			}
		}
		
		
		//ɸѡָ���ļ���ʹ�ù�����
		/*
		 * 1������һ���ļ����������࣬ʵ��FileFiter�ӿ�
		 * 2.д�������ڲ���
		 * 
		 * 
		 */
		System.out.println("----------------3--------------------------");
		MyFileFilter mff=new MyFileFilter();
		if(f3.isDirectory()){
			File[] ff1=f3.listFiles(mff);
			for (File fi : ff1) {
				System.out.println(fi);
			}
		}
		
		FileFilter fff=new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				
				return false;
			}
		};
		
	}
	
	/*
	 * ����һ���༶Ŀ¼�µ��ļ�
	 * 1.�ȵõ����ļ����ڵĸ���Ŀ¼�����Ŀ¼�����򴴽��ļ�����������ڣ��ȴ����༶Ŀ¼���ٴ����༶Ŀ¼�µġ��ļ�
	 */
	
	
	public static void method4(String path) throws IOException{
		//�жϸ���Ŀ¼�Ƿ����
		File f=new File(path);
		File parent= f.getParentFile();
		if(!parent.exists()){
			//�����༶Ŀ¼
			parent.mkdirs();
			System.out.println("�ɹ�");
		}
		if(!f.exists()){
			f.createNewFile();
			System.out.println("�ɹ�");
		}
		
	}
	
	/*
	 * ɾ���༶Ŀ¼
	 * �ݹ�----��
	 * 1.���ǵ��������������ʱ��ֹͣ
	 * 2.�����ڲ������ظ�
	 * 3.�����ڳ����ظ�����(�Լ������Լ�)
	 */
	public static int sum(int num){
		
		if(num<=1){
			return 1;
		}else{
			return num*sum(num-1);
		}
	}
	//�ݹ�ɾ��Ŀ¼
	public static void delete(File path){
		if(path.isDirectory()){
			File[] f=path.listFiles();
			for (File file : f) {
				delete(file);
			}
		}
		path.delete();
		System.out.println("ɾ���ɹ�");
			
		
		
	}

	public static void main(String[] args) throws IOException {
//		method1();
//		method2();
//		method3();
		//method4("demo\\a\\b\\1.txt");
		System.out.println(sum(100));
		delete(new File("demo"));
	}
}
