package com.xms.javase.day12.p;

public class Thread1 {
	public static void main(String[] args) {
//		HuoCheP hp=new HuoCheP("����1");
		HuoCheP hp=new HuoCheP();
		Thread t1=new Thread(hp,"����1");
		Thread t2=new Thread(hp,"����2");
		t1.start();
		t2.start();
//		HuoCheP hp2=new HuoCheP("����2");
//		hp2.start();
	}
}

class HuoCheP implements Runnable  {
	private  int tickNum=10;
	
//	public HuoCheP(String name){
//		super(name);
//	}
	
	@Override
	public void run() {
		for (int i = 1; i <=100; i++) {
			if(tickNum>0){
				System.out.println("����"+Thread.currentThread().getName()+"���˻�Ʊ��ʣ���"+tickNum--+"�ų�Ʊ");
			}
		}
	}
	
	
	
}