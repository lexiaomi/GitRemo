package com.xms.javase.day13;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo03Thread {
	String name;//ʵ������
	static int age;//��̬����
	
	//static Object obj=new Object();
//	static Lock lock=new ReentrantLock();
	
	/*
	 * ���·�
	 * 
	 * �˿�----�߳�
	 * �̳�----������Դ
	 * 
	 * 
	 */
	public static void main(String[] args){
		final Demo03Thread demo=new Demo03Thread();
		
		
		Thread t1=new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//���·�
				demo.buy("A");
			}
		};
		Thread t2=new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//���·�
				demo.buy("B");
			}
		};
		
		
		t1.start();
		t2.start();
		
	}
	
	//�̳�---������Դ
	
	public  void buy(String name){
		
		try {
			System.out.println(name+"�����̳�");
			Thread.sleep(2000);
			
			System.out.println(name+"��ѡ�·�");
			
			synchronized (this) {
				System.out.println(name+"�������¼�");
				System.out.println(name+"�������·�");
				Thread.sleep(3000);
				System.out.println(name+"�����·����߳����¼�");
			}
			 
			System.out.println(name+"����");
			Thread.sleep(1000);
			System.out.println(name+"�߳��̳�");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
