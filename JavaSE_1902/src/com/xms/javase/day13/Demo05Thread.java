
package com.xms.javase.day13;
/**
 * ���̷߳��ʹ�����Դ���ֵİ�ȫ����
 * 	���ٽ�ֵ�����İ�ȫ���⣺
 * 		1.���̹߳���ʵ������
 * 		2.���̹߳���̬����
 * �����ʽ���첽�������ͬ������
 * 
 * 	
 * 
 * @author Administrator
 *
 */
public class Demo05Thread {
	static Object obj=new Object();
	static int beans=100;
	public static void main(String[] args) {
		Thread t1=new Thread(){
			@Override
			public void run() {
				while(true){
					System.out.println("t1����"+getBeans());
				}
			}
		};
		Thread t2=new Thread(){
			@Override
			public void run() {
				while(true){                             
					System.out.println("t2����"+getBeans());
				}
			}
		};
		t1.start();
		t2.start();
		
	}
	
	public  static int getBeans(){
		synchronized (obj) {
			if(beans==0){
				throw new RuntimeException("û�ж���");                                                                                     
			}
			/*
			 * ���õ�ǰ�̵߳�ʱ��Ƭ��ʹ��ǰ�߳����½���Runnable״̬
			 * �ȴ�����ʱ��Ƭ����߶��̲߳����ĳ�����
			 * 
			 */
			Thread.yield();
			
			return beans--;
		}
		
		
	}
}
