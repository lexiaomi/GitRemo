package com.xms.javase.day12.p;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Thread2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Test t=new Test();
		FutureTask<Integer> ft= new FutureTask<Integer>(t);
		Thread t2=new Thread(ft);
		t2.start();
		//��ȡ����ֵ
		System.out.println(ft.isDone());
		Integer integer = ft.get();
		System.out.println(integer);
		//��ȡ����ֵ���߳̽���
		System.out.println(ft.isDone());
	}
}

class Test implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return new Random().nextInt(10);
	}
	
}
