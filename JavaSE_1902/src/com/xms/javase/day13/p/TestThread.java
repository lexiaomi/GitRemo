package com.xms.javase.day13.p;
/**
 * 2.��������100�ų�Ʊ��ֱ������Ʊ�����꣬��ʾ��Ʊ�Ѿ�����
 * @author Administrator
 *
 */
public class TestThread {
	
	public static void main(String[] args) {
		TrainTicket tt=new TrainTicket();
		Thread t1=new Thread(tt,"СС");
		Thread t2=new Thread(tt,"С��");
		Thread t3=new Thread(tt,"С��");
		t1.start();
		t2.start();
		t3.start();
	}
	
	
}

class TrainTicket implements Runnable{
	private static int ticket=100;
	
	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			synchronized (this) {
				if(ticket>0){
					
					try {
						Thread.sleep(1000);
						System.out.println(Thread.currentThread().getName()+"���˻�Ʊ,ʣ��"+ticket--+"��");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
		System.out.println("��Ʊ�Ѿ�����");
		
		
	}
	
}


