package com.xms.javase.day13;
/**
 * �̵߳ķ���
 * @author Administrator
 *
 */
public class Demo01Thread {
	/*
	 * 
	 * void join():�����߳�ͬ�������Ⱥ�˳��
	 * �÷������ڵȴ���ǰ�߳̽���
	 * ���׳��쳣
	 * 
	 * ����ͼƬ�����ظ���
	 * �Ƚ�ͼƬ�����꣬Ȼ�������ظ���
	 * ���������߳�
	 * 
	 * �����߳�----load
	 * չʾ�߳�----show
	 * 
	 * �����Ҫ�����߳�ִ��������������չʾ�̣߳�����Ҫ��չʾ�߳�ǰд��load.join()
	 * ���Դﵽ���������߳������غ�չʾ
	 * 
	 * 
	 */
	
	public static void  method1(){
		/*
		 * method1()�����ж�����һ���ڲ���
		 * ���ڲ����������ø÷����������ľֲ���������ñ�����Ҫʹ��final����
		 * 
		 */
		
		final Thread load=new Thread(){
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("��ʼ����ͼƬ��������");
				for (int i =0; i <=100; i++) {
					System.out.println("������"+i+"%");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("ͼƬ������ϣ�������");
			}
			
		};
		Thread show =new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					/*
					 * �����ǵȴ������߳̽�������ִ��չʾ�߳�
					 * 
					 */
					load.join();
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
	
	public static void main(String[] args) {
		method1();
	}
}
