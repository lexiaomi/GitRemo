package com.xms.javase.day02.p;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 4.�������һ������Ϊ4�ַ�����֤�룬���а�����д��ĸ��Сд��ĸ������
 * 1.�ڿ���̨�����Ӧ����֤�룬�����ɵ���֤����������֤��ת��
 *  ��д�Ƚ�
 * 2.�ڿ���̨�����Ӧ����֤�룬�����ɵ���֤����������֤��ת��
 *		Сд�Ƚ�
 * 3.�ڿ���̨�����Ӧ����֤�룬�����ִ�Сд�Ƚ�
 * 
 * @author Administrator
 *
 */
public class TestString4 {
	
	public static void main(String[] args) {
//		while(true){
			test();
//		}
		

	}
	public static void test(){
		String str1="abcdefghijklmnopqrstuvwxyz";
		String str2=str1.toUpperCase();
		String str3="0123456789";
		
		String str4=str1+str2+str3;
		Random rd=new Random();
		int n1=rd.nextInt(str1.length());
		int n2=rd.nextInt(str2.length());
		int n3=rd.nextInt(str3.length());
		int n4=rd.nextInt(str4.length());
		
		char[] arr1=new char[]{str1.charAt(n1),str2.charAt(n2),str3.charAt(n3),str4.charAt(n4)};
		
		//int j=0;
		for(int i=0;i<arr1.length;i++){
			int n5=rd.nextInt(arr1.length-i)+i;
			System.out.print(arr1[n5]); 
			char temp=arr1[n5];
			     arr1[n5]=arr1[i];
			     arr1[i]=temp;
		}
		System.out.println();      
		
	
		System.out.println(Arrays.toString(arr1));
		//String a="fdSh";
		
		//boolean a1=a.equals(arr1);
		//System.out.println(a1);
//		for(int j=0;j<arr1.length;j++){
//			char ch=arr1[j];
//			System.out.println(ch);
//		}
		

		// System.out.println(s1);
		// System.out.println(s1.toUpperCase());
		String s1=new String(arr1);// ֱ��char�������ɵ� �ַ���
		Scanner sc =new Scanner(System.in);
		System.out.println("��������֤��:");
		String s3=sc.next();// �����
		
		
		System.out.println("���д�д�Ƚϰ�1  ����Сд�Ƚ� ��2 �����ֱȽϰ�3");
		int num=sc.nextInt();
		if(num==1){
			
			String s2=s1.toUpperCase(); //ת���ɴ�д����ĸ�ַ���
			String s4=s3.toUpperCase();// ������ַ�����д��
			System.out.println(s4);
			if(s2.equals(s4)){
				System.out.println("��д�Ƚ�������ȷ");
			}else{
				System.out.println("��д�Ƚϲ���ȷ");
			}
			
		}else if(num==2){
			//תСд
			String s5=s1.toLowerCase();
			String s7=s3.toLowerCase();
			if(s5.equals(s7)){
				System.out.println("Сд�Ƚ���ȷ");
			}else{
				System.out.println("Сд�Ƚϲ���ȷ");
			}
		}else{
			if(s1.equalsIgnoreCase(s3)){
				System.out.println("�Ƚ���ȷ");
			}else{
				System.out.println("��" +
						"�ϴ���");
			}
		}
		
		
		
		
	}
}
