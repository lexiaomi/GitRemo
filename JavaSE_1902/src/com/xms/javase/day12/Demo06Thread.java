package com.xms.javase.day12;
/**
 * �ػ��̣߳�
 * 	isDaemon():�ж��Ƿ�Ϊ�ػ��߳�
 * 	
 * 
 * �ػ��̺߳���ͨ�߳��ڱ�����û�����𣬿���ͨ��Thread���е�setDaemon(boolean b)�������ó��ػ��߳�
 * 	
 * ----void setDaemon(boolean b):
 * 		���Խ���ͨ�߳����ó��ػ��߳�
 * �ػ��߳�(��̨�߳�)�ص㣺��������ֻʣ���ػ��߳�ʱ�����е��ػ��߳̽��ᱻǿ����ֹ
 * 	gc()���͵Ľ������ػ��߳��ϵķ���
 * 		
 * @author Administrator
 *
 */
public class Demo06Thread {
	public static void main(String[] args) {
		//rose
		Thread rose=new Thread(){
			@Override
			public void run() {
				for (int i = 0; i <5; i++) {
					System.out.println("rose:let me go!!!!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("rose:������������");
				System.out.println("��Ч����ͨ~~~~~");
			}
		};
		
		//jack
		
		Thread jack =new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					System.out.println("you jump,i jump");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		};
		
		jack.setDaemon(true);
		/*
		 * ��jack���ó��ػ��̣߳������ڸ��߳�����ǰ�����ػ��߳�
		 * ����û��Ч��
		 */
		rose.start();
		jack.start();
		
		System.out.println(rose.isDaemon());
		System.out.println(jack.isDaemon()); 
		
		
		
	}
}
