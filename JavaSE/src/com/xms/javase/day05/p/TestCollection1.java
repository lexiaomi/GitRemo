package com.xms.javase.day05.p;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestCollection1 {

	/**
	 * ����10��1-100������������ŵ�һ�������У��������д��ڵ���10�����ַŵ�һ��list�����У�����ӡ������̨��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[100];
		Random rd=new Random();
		for(int i=0;i<arr.length;i++){
			arr[i]=rd.nextInt(101);
		}
		List<Integer> li=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=10){
				int temp=arr[i];
				li.add(temp);
			}
		}
		System.out.println(li);
		System.out.println(li.size());
	}

}
