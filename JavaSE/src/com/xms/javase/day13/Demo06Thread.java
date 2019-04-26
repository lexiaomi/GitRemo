package com.xms.javase.day13;
/**
 * ���߳�֮���Эͬ����
 * 	����ͼƬ�����ظ���չʾͼƬ
 * 
 * load----�����߳�(����ͼƬ�����ظ���)
 * show---չʾ�߳�(չʾͼƬ)
 * 
 * ������ͼƬ��ͼƬ����������չʾͼƬ�������ظ���
 * (����ͼƬ)��(���ظ���չʾͼƬ)��ͬ��
 * ���غ͸���չʾͼƬ���첽
 * 
 * 
 * wait():ʹ��ǰ�߳̽���ȴ�����״̬����Ҫʹ���̻߳��ѵķ����������ͷţ�
 * �ͷź�����Runnable״̬�����û���߳������ͷŵķ��������һ��������ȥ
 * 
 * notify():���ѵ�ǰ�ȴ��߳��е�ĳһ���߳�(���)��
 * 
 * notifyAll():���ѵ�ǰ�ȴ������е������̣߳�
 * wait��sleep������:
 * 1.�����������ǽ�������״̬�ķ���
 * 2.sleep:ʹ��ǰ�߳̽�������״ָ̬�����룬�ȵ�ָ�������Ȼ���Զ��ͷţ�����Runnable״̬�ȴ�����ʱ��Ƭ
 * wait:ʹ��ǰ�߳̽�������״̬�������״̬��һֱ������ȥ��ֱ����Ӧ�ķ������份�ѣ��Ż��ͷţ���ʱ�Ż����Runnable״̬���ȴ�����ʱ��Ƭ
 * @author Administrator
 *
 */
public class Demo06Thread {
	public static void method1(){

		final Object obj=new Object();
		boolean flag=false;
		final Thread load=new Thread(){
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("��ʼ����ͼƬ��������");
			for (int i =0; i <=100; i++) {
				System.out.println("ͼƬ������"+i+"%");
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("ͼƬ������ϣ�������");
			
			/*
			 * ��ԓλ�Ì�չʾ���̆��ӣ�
			 * 
			 */
			/*
			 * ��Java�����ֲ��й涨����ʹ������������ʱ����Ҫ������Ӧ��synchronized ����֤�ȴ��ͻ��ѵİ�ȫ
			 */
			synchronized (obj) {
				obj.notify();
			}
			System.out.println("���ظ���");
			for (int i = 0; i <=100; i++) {
				try {
					System.out.println("����������"+i+"%");
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("�����������");
		}
		
	};
	Thread show =new Thread(){
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				/*
				 * �����ǵȴ������߳̽�������ִ��չʾ�߳�
				 * �ڸ�λ��Ӧ�õȴ������߳��е�ͼƬ������� 
				 * Ȼ��������
				 * 
				 */
				synchronized (obj) {
					obj.wait();
				}
//				load.join();
				System.out.println("��ʼչʾͼƬ");
				
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("չʾ���");
		}
	};
	
	load.start();
	show.start();

	}
	
	/*
	 * ���������߳�
	 * һ����ӡ(A-Z)
	 * һ����ӡ����
	 */
	
	public static void method2(){
		final Object obj=new Object();
		//��ӡ(A-Z)���߳�
		Thread t1=new Thread(){
			@Override
			public void run() {
				
				for(int i=65;i<=90;i++){
				
					System.out.print((char)i);
					if(i%2==0){
//							Thread.sleep(1000);
						try {
							synchronized (obj) {
								obj.wait();
							}
							
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					
				}
				
			}
		};
		//��ӡ���ֵ��߳�
		Thread t2=new Thread(){
			@Override
			public void run() {
				for(int i=1;i<14;i++){
					
					System.out.print(i);
					
					try {
						Thread.sleep(1000);
						synchronized (obj) {
							obj.wait();
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t2.setDaemon(true);
		t1.start();
		t2.start();
		
	}
	
	public static void main(String[] args) {
		method1();
//		method2();
	}
}
