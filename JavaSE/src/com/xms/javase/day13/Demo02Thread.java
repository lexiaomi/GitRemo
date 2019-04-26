package com.xms.javase.day13;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * ���̲߳��������İ�ȫ����
 * 
 * 		����߳�"ͬʱ"���ʲ���ͬһ����Դ(�ٽ���Դ)�����İ�ȫ����
 * ���������
 * 		���첽�������ͬ������(���Ⱥ�˳��)
 * �����ʩ������
 * 		����һ���ؼ��֣�synchronized---���첽���ͬ��
 * 		 static������
 * 			1.���Խ������ڷ�����  �׶ˣ�Ӱ�����ִ��Ч��
 * 			2.����ͬ��������ϣ���֤������ͬ�������(�Ͷ��������޹�)
 * 		��static����
 * 			1.���Խ������ڷ����ϣ��׶ˣ�Ӱ�����ִ��Ч��
 * 			2.������Ҫͬ���Ĵ�����ϣ���֤������ͬһ������
 * 				������this---ָ����ǰ���õķ���
 * �������ٽ���Դ��
 * 		1.���̹߳���ʵ��������
 * 		2.���̹߳���̬��Դ������
 * 
 * @author Administrator
 *
 */
public class Demo02Thread {
	String name;//ʵ������
	static int age;//��̬����
	
	static Object obj=new Object();
	static Lock lock=new ReentrantLock();
	
	/*
	 * ���·�
	 * 
	 * �˿�----�߳�
	 * �̳�----������Դ
	 * 
	 * 
	 */
	public static void main(String[] args){
		
		Thread t1=new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//���·�
				buy("A");
			}
		};
		Thread t2=new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//���·�
				buy("B");
			}
		};
		
		
		t1.start();
		t2.start();
		
		try {
			t2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//�̳�---������Դ
	
	public  static void buy(String name){
		
		try {
			System.out.println(name+"�����̳�");
			Thread.sleep(2000);
			
			System.out.println(name+"��ѡ�·�");
			
//			synchronized (obj) {
//				System.out.println(name+"�������¼�");
//				
//				System.out.println(name+"�������·�");
//				Thread.sleep(3000);
//				System.out.println(name+"�����·����߳����¼�");
//			}
			lock.lock();
			System.out.println(name+"�������¼�");
			System.out.println(name+"�������·�");
			Thread.sleep(3000);
			System.out.println(name+"�����·����߳����¼�");
			 
			lock.unlock();
			System.out.println(name+"����");
			Thread.sleep(1000);
			System.out.println(name+"�߳��̳�");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
