package com.xms.javase.day12;
/**
 * Thread:
 * 	�̣߳�
 * 	���̣�����ϵͳ�����е�һ������
 * 	�����ǰ�����ĳЩ��ͬ��Դ���ڴ����򣬲������ý��̰������Ĺ�����ΪһЩ���ܵ�Ԫ
 * 	
 * 	�����а�����һ�����߶����ִ�е�Ԫ�����̣߳��߳�ֻ�ܹ���һ�����̣�����ֻ�ܷ��ʸý�����ӵ�е���Դ
 * 
 * 1.һ������������һ������
 * 2.�̵߳Ļ��ֳ߶�ҪС�ڽ��̣�ʹ�ö��̵߳Ĳ����Ըߣ����������ִ�й�����ӵ�ж������ڴ浥Ԫ��������̹߳���
 * 	      ���̵߳�Ԫ���Ӷ��������ˣ����������Ч�ʺ���Դ������
 * 3.���̵߳���������һ��Ӧ�ó����У��ж��ִ�в��ֿ���ͬʱִ�У����ǲ���ϵͳ��û�н�����߳̿���������Ӧ����ʵ��
 * 	      ���Ⱥ͹����Լ�������Դ
 * 
 * �߳�ʹ�ó�����
 * 	   1.�߳�ͨ����һ��Ӧ�ó����У�����Ҫͬʱ��ɶ������������
 * 			��ô���ǿ��Խ�ÿ��������Ϊһ���̣߳�ʹ������һͬ����
 * 	   2.Ҳ����ʹ�õ�һ�߳���ɵ��ǿ��Դﵽ��������
 * 
 * 
 * ����ԭ��
 * 		����߳�"ͬʱ"����ֻ�����Ǹй��ϵ�һ�ֱ��֣���ʵ���ǲ���ִ��
 * 		   �̵߳���(os)��ʱ��Ƭ�����ܾ��Ȼ��ֳɺܶ�ʱ��Ƭ����������ÿһ���̣߳�
 * 		���ʱ��Ƭ���̱߳�CPUִ�У������߳�ȫ���ȴ�������΢����������ͣͣ������϶��������У�
 * 			��������������������ǲ��Ǿ��������ϵ�"ͬʱ����"
 * 
 * 
 * ��δ����̣߳�
 * 	1.�̳�Thread
 * 	2.ʵ��Runnable�ӿ�  ----����ӿ�(�Ƚϳ���)
 *  3.�����̳߳�
 * 
 * ͬ�������Ⱥ�˳���ִ�з���
 * 
 * �첽������ִ�и��Ե����ݣ����񣩣��������ţ�����һ����У�
 * 
 * @author Administrator
 *
 */
public class Demo04Thread {
	public static void main(String[] args) {
		//ͬ��ִ�У����Ⱥ�˳��
//		
//		Thread1 t1=new Thread1();
//		Thread2 t2=new Thread2();
		/*
		 * �����߳�
		 * ���ǵ���run���������ǵ����߳��е�start()����
		 * ������˭��start��˭��ִ�У�������Ҫ���䵽��Ӧ��ʱ��Ƭ�����䵽ʱ��Ƭ���̲߳���ʽ��ʼִ������
		 */
		
		//t1.start();
		//t2.start();
		
		Runnable1 run1=new Runnable1();
		Runnable run2=new Runnable2();
		//�����̣߳����̴߳����������
		Thread tt1=new Thread(run1);
		Thread tt2=new Thread(run2);
		tt1.start();
		tt2.start();
	}
}

//�̳�Thread��

class Thread1 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("�����"+Thread.currentThread().getPriority()+i);
		}
		
	}
	
}
class Thread2 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("�Һܺã����أ�����"+Thread.currentThread().getName()+"----"+i);
		}
		
	}
	
}


//ʵ��Runnable�ӿ�----������

class Runnable1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			System.out.println("�����"+Thread.currentThread().getPriority()+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


class Runnable2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			System.out.println("�Һܺã����أ�����"+Thread.currentThread().getPriority()+"----"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
