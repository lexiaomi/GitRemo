package com.xms.javase.day12;

import java.lang.Thread.State;

public class Demo05Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t1=new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				for (int i = 0; i < 50; i++) {
					System.out.println("���");
				}
			}
		};
		t1.start();
		/*
		 * currentThread()
		 * 	�鿴��ǰ���̣߳�����ֵΪThread����
		 * 	Thread[main,5,main]  
		 * 		   �߳���  �߳����ȼ�  ��ǰ���߳���
		 */
		Thread t=Thread.currentThread();
		System.out.println(t);
		
		/*
		 * 
		 * 
		 * getId() :��ȡ��ǰ�̵߳ı�ʶ��
		 * ����ֵΪlong���ͣ���ȡ��idΪ
		 * ϵͳ������䣬���ظ�
		 */
		
		
		long id = t.getId();
		System.out.println(id);
		
		/*
		 * getName():
		 *	���ص�ǰ�̵߳����ƣ�����ֵΪString����
		 */
		String name = t.getName();
		System.out.println(name);
		
		/*
		 * getPriority():���ص�ǰ�̵߳����ȼ�
		 * 
		 * 
		 *�̵߳����ȼ�(1-10)���ȼ�Խ�ߡ�cpu���ȷ���ʱ��Ƭ�ĸ���Խ��,1Ϊ��ͣ�10Ϊ���
		 *�̵߳��л������̵߳��ȿ��ƣ��޷�ͨ�����������棬��������̵߳����ȼ�����󻯵ĸ����̻߳�ȡʱ��Ƭ�ĸ���
		 *
		 *�ı��̵߳����ȼ��� setPriority(int n)
		 *--n(1-10)
		 *
		 *������������
		 *	��ߵȼ�: Thread.MAX_PRIORITY 10
		 *	��͵ȼ�: Thread.MIN_PRIORITY 1
		 *	�����ȼ�: Thread.NORM_PRIORITY 5
		 */
		int priority = t.getPriority();//��ȡ�̵߳����ȼ�
		System.out.println(priority);
		
		t.setPriority(10);//�����߳����ȼ�
		int pri2 = t.getPriority();
		System.out.println(pri2);
		
		/*
		 * getState():
		 * ��ȡ�߳�״̬������ֵΪ.Thread.State���ͣ��߳�״̬��
		 * 
		 */
		State state = t.getState();
		System.out.println(state);
		
		/*
		 * isAlive():
		 * �ж��߳��Ƿ��ڻ״̬
		 * ����ֵboolean���� true���״̬   false:ֹͣ
		 */
		boolean alive = t.isAlive();
		System.out.println(alive);
		
		boolean daem = t1.isDaemon();
		System.out.println(daem);
		
	}

}

