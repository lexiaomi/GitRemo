package com.xms.javase.day13.p;
/**
 * 1.С�죬С����С�ڸ�����ҵ���������
	��Ҫ��������Ϊ���ߺڰ壬��ˮ��ɨ��
	����λͬѧ���Ը���
		С�����ߺڰ�
		С�죺��ˮ wait
		С�ڣ�ɨ��С��.jion
		˳�����ߺڰ壬����ˮ�����ɨ��
		ʹ���̵߳�֪ʶ��������ǵĹ�������
 */
public class TestThread2 {
	public static void main(String[] args) {
		TestThread2 tt=new TestThread2();
		XiaoMing xm=new XiaoMing(tt);
		XiaoHei xh=new XiaoHei(tt);
		XiaoHong xho=new XiaoHong(tt);
		
		xm.start();
		xho.start();
		try {
			xho.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		xh.start();
		
	}
}

class XiaoMing extends Thread{
	final private TestThread2  te;
	
	
	public XiaoMing(TestThread2  te) {
		this.te=te;
	}
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		System.out.println("С���ڲ��ڰ�");
		
		synchronized (te) {
			te.notify();
		}
		
	}
}

class XiaoHong extends Thread{
	
	
	final private TestThread2  te;
	
	public XiaoHong(TestThread2  te){
		this.te=te;
	}
	@Override
	public  void run() {
		try {
			synchronized (te) {
				te.wait();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		System.out.println("С������ˮ");
	}
}

class XiaoHei extends Thread{
	final private TestThread2  te;
	public XiaoHei(TestThread2  te){
		this.te=te;
	}
	
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		
		System.out.println("С����ɨ��");
	
	}
}
