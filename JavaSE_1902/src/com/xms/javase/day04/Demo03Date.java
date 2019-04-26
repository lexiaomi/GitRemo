package com.xms.javase.day04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Date�ࣺ�þ���һ���̶�ʱ���ĺ���������ʾһ���ض���ʱ���
 * Date���ڴ���ʱ����������ñ�Calendar���
 * @author Administrator
 *
 */
public class Demo03Date {
	public static void method1(){
		// ��ʾϵͳ�ĵ�ǰʱ��
		Date d=new Date();
		/*
		 * getTime():
		 *  ������ 1970 �� 1 �� 1 �� 00:00:00������ Date �����ʾ�ĺ�������
		 *  ����ֵΪlong����
		 */
		long ti=d.getTime();
		//System.out.println();
		
		/*
		 * simpleDateFormat�࣬��ʱ����и�ʽ�����Խ��и��õ�չʾ
		 * java.text.SimpleDateFormat��
		 * 		������������Ի����йصķ�������ʽ���ͽ����ľ������
		 * 		
		 * 	��ʽ����(����--->�ı�)
		 * 	������(�ı�--->����)
		 * ���췽����
		 * SimpleDateFormat()
		 * SimpleDateFormat(String mode)
		 * final String format(Date date)
		 */
		DateFormat df=new SimpleDateFormat("yyyy/MM/dd/hh/mm/ss");
		/*Date--->String
		 * ��ʱ�����͵����ݣ�ת���ɶ�Ӧ���ַ��� 
		 */
		
		System.out.println(df.format(d));
		
		// String --->Date
		
		String str="2019/3/7/01/12/30";
		Date d1;
		try {
			d1 = df.parse(str);
			System.out.println(d1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		long ti1=System.currentTimeMillis();
		System.out.println(ti1-ti);
	}
	public static void method2(){
		//Date--->String
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
		String str=sdf.format(d);
		System.out.println(str);
		
		
		// String--->Date
		/*
		 * �ַ����ĸ�ʽҪ��mode����ĸ�ʽ��ͬ
		 * ���������쳣
		 */
		String time="2019/03/04  15:12:25";
		Date d1;
		try {
			d1 = sdf.parse(time);
			System.out.println(d1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void date() throws ParseException{
		Scanner sc=new Scanner(System.in);
		System.out.println("������������գ�");
		String birth=sc.next();//������ַ������ܰ����ո�  nextLine()�� �ܰ����ո�
		//String birth="1996-09-12";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date dateBirth=sdf.parse(birth);//ת��Date��
		// ���յ�1970�ĺ�����
		long time = dateBirth.getTime();
		//��ȡϵͳ��ʱ�䵽1970
		Date d=new Date();
		long time2=d.getTime();
		
		//���˵ĺ�����
		double time3=time2-time;
		
		int day=(int)(time3/1000/60/60/24);
		
		System.out.println("���Ѿ����ˣ�"+day/365+"��");
		//System.out.println(day2);
		
	}
	
	/*
	 * �������������ڣ����㻹�м���ɻ�
	 */
	
	public static void date1() throws Throwable{
		Scanner sc=new Scanner(System.in);
		System.out.println("�������������ڣ�");
		String str=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		//�������
		Date time=sdf.parse(str);
		//������ڵ�1970�ĺ�����
		long t1=time.getTime();
		
		//��ȡ���ڵ�����
		Date time1=new Date();
		//���ڵ����ڵ�1970�ĺ�����
		long t2=time1.getTime();
		long t3=t1-t2;
		if(t3>=0){
			System.out.println("���У�"+t3/1000/60/60/24+"����");
		}
		
		//System.out.println(((t1-t2)/1000/60/60/24)+"����");
		
		
		
	}
	public static void main(String[] args) throws Throwable {
		//method1();
		//method2();
		date1();

	}
}
