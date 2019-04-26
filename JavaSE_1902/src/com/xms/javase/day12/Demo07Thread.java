package com.xms.javase.day12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * �̳߳��õķ���
 * @author Administrator
 *
 */
public class Demo07Thread {
	public static void method1(){
		/*
		 * sleep(long time)
		 * ����ָ����������עҪĿ���ṩ��Ӧʱ��
		 * ��̬�������������߳̽�������״̬
		 * 
		 */
		Thread t=new Thread(){
			public void run() {
				
				for (int i = 0; i < 10; i++) {
					if(i==6){
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							System.out.println("����"+i);
						}
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("����"+i);
				}
			};
		};
		
		t.start();
	}
	/*
	 * ʹ�ø÷�����һ��ʱ�������
	 * 17:08:55
	 */
	public static void method2(){
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
		while(true){
			Date d=new Date();
			String str = sdf.format(d);
			System.out.println(str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void method3(){
		Calendar c1=Calendar.getInstance();
		Calendar c2=Calendar.getInstance();
		Calendar c3=Calendar.getInstance();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
	public static void main(String[] args) {
//		method1();
//		method2();
		method3();
	}
}
