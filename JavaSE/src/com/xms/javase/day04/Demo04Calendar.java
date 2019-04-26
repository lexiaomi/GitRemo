package com.xms.javase.day04;
/**
 *  Calendar:������
 *  	��ΪDate��ʱ������Ĳ��������㣬��������Calendar
 *  
 *  ������һ�������࣬�����װ��ʱ�������һ�����ķ���
 *  �·ݣ�0-11
 *  �ܣ���---�� 1 2 3 4 5 6 7
 *  
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Demo04Calendar {

	public static void method1(){
		//�������������
		Calendar cal=Calendar.getInstance();
		/*
		 * get(int fied):
		 * 	��ȡ�������Ӧʱ�������ֵ
		 * ����ֵΪ��Ӧ��ָ����ʱ�����(int)
		 */
		int year=cal.get(Calendar.DAY_OF_MONTH);
		int day=cal.get(Calendar.DATE);//����
		int day2=cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year);
	}		
	public static void method2(){
		Scanner sc=new Scanner(System.in);
		//System.out.println("���������ڣ�");
		//String str=sc.next();
		//Date date=new Date();
		//���ַ�����ʱ��ת��Date
		//String str="1996-09-12";
		SimpleDateFormat sdf=new SimpleDateFormat();
		
			//Date valueof=sdf.parse(str);
			Calendar cal=Calendar.getInstance();
			//cal.setTime(valueof);
			
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
			//��������
			int count=0;
			//��ȡ�����������
			int maxDay=cal.getActualMaximum(Calendar.DATE);
			//��ȡ���ڵ�����
			int nowDay=cal.get(Calendar.DATE);
			
			for(int i=1;i<=maxDay;i++){
				System.out.print(i+"\t");
				count++;
				if(count%7==0){
					System.out.println();
				}
			}
		
		
		
		
		
	}
	
	
	public static void method3(){
	
		System.out.println("���������ڣ�");
		Scanner sc=new Scanner(System.in);
		
		String str1=sc.next();
		Date valueOf=java.sql.Date.valueOf(str1);
		Calendar cal=Calendar.getInstance();
		cal.setTime(valueOf);
		//System.out.println(cal);
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		//��������
		int count=0;
		//��ȡ�����������
		int maxDay=cal.getActualMaximum(Calendar.DATE);
		//��ȡ���ڵ�����
		int nowDay=cal.get(Calendar.DATE);
		
		//����ǰ���ڱ�ɵ�һ��
		cal.set(Calendar.DATE,1);
		//��ȡ��һ����һ���еĵڼ���
		int num=cal.get(Calendar.DAY_OF_WEEK);
		//\t����
		for(int i=1;i<=num-1;i++){
			System.out.print("\t");
		}
		count+=(num-1);
		for(int i=1;i<=maxDay;i++){
			if(i!=nowDay){
				System.out.print(i+"\t");
			}else{
				System.out.print(i+"*\t");
			}
			count++;
			if(count%7==0){
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		//method1();
		//method2();
		method3();
		
	}
}
