package com.xms.javase.day02;

import java.util.Scanner;

/**
 * String�� ���õķ���
 * 		�ַ��������ԣ�
 * 			1.length() ---��ȡ�ַ�������ĳ��ȣ��ж��ٸ��ַ�����Ϊ����
 * 				�﷨�� �ַ�������.length()
 * 				����ֵΪ�������͵��ַ�������
 * 			2.�ַ������±��0��ʼ����-1����
 * 
 * java�����ò�����һ��ǰ�������󲻰���[2,6);
 * @author Administrator
 *
 */
public class Demo02String {
	
	public static void main(String[] args) {
		//method1();
		System.out.println("*************************");
		method2();
		method3();
		method4();
		System.out.println("*************************");
		String str="�Ϻ�����ˮ���Ժ���";
		method5(str);
		//method6();
		method7();
		
		
	}
	
	public static void method1(){
		String str="good good study,day day up";
		System.out.println(str.length());
		/*
		 * indexOf(String str);
		 * ����ָ���ַ������ڵ�λ��(�±�)
		 * ����ֵΪ int����
		 * 
		 * 1.����ƥ�䣬����ֵ����������ƥ�䵽���ַ�������Ӧ���±�
		 * 2.���û��ƥ�䵽ָ���ַ������򷵻�ֵΪ-1
		 */
		System.out.println("---------------------");
		int num=str.indexOf("s");
		System.out.println(num);
		int num1=str.indexOf("study");
		System.out.println(num1);
	
		
		/*
		 * indexOf(String str,int index);
		 * ���±�Ϊindex��λ�ÿ�ʼ�����ַ���
		 */
		int num4=str.indexOf("good");
		System.out.println(num4);
		//�������ַ����еڶ���good���ڵ��±�
		
		System.out.println(str.indexOf("good",2 ));
		// �ַ����ķ�������Ƕ��ʹ��
		int num5=str.indexOf("good",str.indexOf("good")+1);
		System.out.println(num5);
		
		
		/*
		 * LastIndexOf(String str):
		 * ����ָ���ַ������һ�γ��ֵ�λ��
		 */
		System.out.println("-------------------------");
		int num6=str.lastIndexOf("p");
		System.out.println(num6);
	}
	
	public static void method2(){
		/*
		 * subString(int start,int end):
		 * 1.��ȡָ��������ַ���[satrt,end)
		 * 2.���ؽ�ȡ���ַ���
		 *	���ڽ�ȡ����
		 * www.baidu.com--->baidu 
		 */
		String str="0123456789";
		System.out.println(str.substring(3,7));
		
		String str1="www.baidu.com";
		String str2=str1.substring(str1.indexOf(".")+1,str1.lastIndexOf("."));
		System.out.println(str2);
		/*
		 * subString(int index);
		 * 
		 * ��ȡindex֮���ַ���(����index)
		 * ����ֵΪ��ȡ�����ַ������͵�����
		 * 
		 */
		String str3=str.substring(6);
		System.out.println(str3);
	}

	public static void method3(){
		/*
		 * trim��
		 * 	1.ȥ���ַ������˵Ŀհ�
		 * 	2.����ȥ���ַ����м�Ŀհ�
		 * 	3.����ֵΪȥ�����˿հ׺���ַ���
		 * 
		 */
		
		String str1=" ����  ���    ";
		
		System.out.println(str1.trim());
	}
	
	public static void method4(){
		/*
		 * charAt(int index)
		 * �鿴ָ��λ���ϵ��ַ�
		 * 2.����ֵΪָ��λ�õ��ַ�
		 */
		
		String str="hello";
		System.out.println(str.charAt(1));
		char c1=str.charAt(str.indexOf("e"));
		System.out.println(c1);
		
		//�ж�һ���ַ����Ƿ��ǻ���
		
	}
	public static void method5(String str){
		//�ж�һ���ַ����Ƿ��ǻ���
		//String str="�Ϻ�����ˮ���Ժ���";
		//int index=0;
		
//		for(int i=0;i<str.length()/2;i++){
//			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
//				//continue;
//				System.out.println("���ǻ���");
//				break;
//			}else{
//				index++;
//			}
//			
//			if(index==str.length()/2){
//				System.out.println("�ǻ���");
//			}
//		}
		System.out.println("----------------------");
		int len=str.length();
		
		for(int i=0;i<len/2;i++){
			if(str.charAt(i)!=str.charAt(len-1-i)){
				System.out.println("���ǻ���");
				return;
			}
		}
		System.out.println("�ǻ���");
		
		System.out.println("------------3-----------");
//		boolean flag=true;
//		for(int i=0;i<len/2;i++){
//			if(str.charAt(i)!=str.charAt(len-1-i)){
//				flag=false;
//				break;
//			}
//		}
//		if(flag){
//			System.out.println("�ǻ���");
//		}else{
//			System.out.println("���ǻ���");
//		}
		
	}
	public static void method6(){
		/*
		 * startsWith(String str):
		 * ensWidth(String str):
		 * 1.�ж�ĳ�ַ����Ƿ�ָ���ַ�����ͷ���߽�β
		 * 2.����ֵΪboolean
		 * 	�������ָ���ַ�����ͷ����β���򷵻�ֵΪtrue ���򷵻�ֵΪfalse
		 * http:����������Э��
		 * ftp:�ļ�����Э��
		 */
		
		// �ϴ���.txt��β���ļ�
		
		Scanner sc =new Scanner(System.in);
		System.out.println("���ϴ�һ.txt�ļ���β���ĵ�");
		String str=sc.next();
		if(str.endsWith(".txt")){
			System.out.println("��ʽ��ȷ���ϴ��ɹ�");
		}else{
			System.out.println("�ϴ�ʧ�ܣ���ʽ����ȷ");
		}
		
		
		
	}
	public static void method7(){
		/*
		 * toUpperCase����ĸ�ַ���ת���ɴ�д
		 * toLowerCase����ĸ�ַ���ת����Сд
		 * ����ֵΪ�ı����ַ���
		 */
		
		String str1="abc";
		String str2="ABC";
		
		String str3=str1.toUpperCase();
		String str4=str2.toLowerCase();
		System.out.println(str3+str4);
		
		/*
		 * equalsIgnoreCase(String anotherString):
		 * �����ִ�Сд�Ƚ��ַ���
		 * ����ֵΪboolean����
		 * 	��Ӧ��������ĸ�����ִ�Сд��ͬ���򷵻�Ϊtrue����Ϊfalse
		 * 
		 */
		if(str1.equalsIgnoreCase(str2)){
			System.out.println("���");
		}
	}
	
	
	
	
}
