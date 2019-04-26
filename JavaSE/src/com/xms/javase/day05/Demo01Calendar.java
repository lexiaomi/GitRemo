package com.xms.javase.day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Calendar:������
 *  	��ΪDate��ʱ������Ĳ��������㣬��������Calendar
 *  
 *  ������һ�������࣬�����װ��ʱ�������һ�����ķ���
 *  �·ݣ�0-11
 *  �ܣ���---�� 1 2 3 4 5 6 7
 * 
 * @author Administrator
 *
 */
public class Demo01Calendar {
	
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
		/*
		 * set(int field,int value)
		 * field:ָ����ʱ�����
		 * value��Ҫ���õ�ֵ
		 * ��ָ����ʱ���������ָ����ֵ
		 * --void
		 */
		
		//�������������
		Calendar cal=Calendar.getInstance();
		
		//�޸���
		cal.set(Calendar.YEAR, 2020);
		System.out.println(cal.get(Calendar.YEAR));
		//�޸���--ʹ��Ӣ��
		cal.set(Calendar.MONTH, Calendar.OCTOBER);
		System.out.println(cal.get(Calendar.MONTH));
		
	}
	
	public static void method3(){
		/*
		 * ���ڿ���̨���ʮ���Ľ����Ǽ���
		 */
		
		
		Calendar cal=Calendar.getInstance();
		//��ȡ����������µĵڼ���
		int day1=cal.get(Calendar.DATE);
		int day2=day1+10;
		cal.set(Calendar.DATE, day2);
		int day3=cal.get(Calendar.DATE);
		System.out.println(day3);
		
		/*add()
		 * ֱ���ڶ�Ӧ��ʱ������Ͻ�����ֵ�ı�(+��-)
		 * ���Ǽ�
		 * �����Ǽ�
		 * ʹ�ø÷������ÿ����·ݵ�����
		 * ����������Զ�����
		 */
		cal.add(Calendar.DATE, -10);
		System.out.println(cal.get(Calendar.DATE));
		
	}
	
	public static void method4(){
		/*
		 * setTime(Date date)
		 * 	---��ָ����������������ó����������
		 * 	---void
		 * getTime()
		 * 	---ʹCalendarʱ�����ó�Dateʱ��
		 * 
		 */
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.MONTH, 3);
		cal.add(Calendar.DATE, 10);
		cal.set(Calendar.DAY_OF_WEEK, 4);
		Date date=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd E");
		String str=sdf.format(date);
		System.out.println(str);
		
		
		
	}
	
	public static void method5() throws ParseException{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("���������ڣ�");
		String s1=sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d1=sdf.parse(s1);	
		Calendar cal=Calendar.getInstance();
		//�޸ĵ�ǰʱ��Ϊ�����ʱ��
		cal.setTime(d1);
		cal.add(Calendar.MONTH,2);
		cal.add(Calendar.DATE, 5);
		cal.set(Calendar.DAY_OF_WEEK, 4);
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd E");
		Date date=cal.getTime();
		String str=sdf1.format(date);
		System.out.println(str);
	}
	public static void main(String[] args) throws ParseException {
		//method2();
		//method3();
		//method4();
		//WEDNESDAY
		method5();
	}
}
