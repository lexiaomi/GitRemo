package com.xms.javase.day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳أ�
 * 		ExecutorsService��Java�ṩ�Ĺ����̳߳صĽӿ�
 * 	
 * 	��һ�������������������̣߳������������ʱ���٣����ϵͳ��ɹ��ȵ���Դ���ģ�
 * 	�Ӷ�����ϵͳ������Ϊ������Ӧ��ʹ���̳߳ؽ���������
 * 	�̳߳ص����ã�
 * 		1.�����̵߳�����
 * 		2.�����߳�
 * 			
 * �����̳߳صķ�ʽ��
 * 		Executors.newCachedThreadPool(int threadFactory)
 * 		�����ɸ�����Ҫ�������̵߳��̳߳أ���������ǰ������߳̿����ǣ�����������
 * 		Executors.newFixedThreadPool(int nThreads)----�Ƚϳ���
 * 		����һ�������õĹ̶��̵߳��̳߳أ����޽���еķ�ʽ��������Щ�߳�
 * 		newScheduledThreadPool(int corePoolSize)
 * 		����һ���̳߳أ����ɰ����ڸ����ӳٺ����л��߶���ִ��
 * 
 * 		newSingleThreadExecutor() 
 * 		����һ��ʹ�õ��� �̵߳� �̳߳أ����޽���з�ʽ�����и��̡߳�
 * 		
 * 
 * @author Administrator
 *
 */
public class Demo01Thread {
	public static void main(String[] args) {
		
		//�����̳߳صĶ���
		ExecutorService pool=Executors.newFixedThreadPool(2);
		//�������񣬴��������ڲ���
		Runnable run1=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i <=5; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		};
		Runnable run2=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i <=5; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		};
		
		//���������뵽�̳߳���
		/*
		 * 
		 * excute(Runnable run)
		 * �÷�����ָ���������뵽��ǰ���̳߳�
		 * ����ͳһ�Ĺ���(������أ������߳�)
		 */
		
		pool.execute(run1); 
		pool.execute(run2); 
		
	}
}
