package com.xms.javase.day03;
import java.util.Arrays;
import java.util.regex.Matcher;;;
/**
 * ������ʽ����������Java���������
 * ���Ϊ����
 * һ�������ַ����ĸ�ʽ��֤
 * 	---matches(String regex): (ȫ��ƥ��)
 * 		���ַ�����������ʽ(regex)���бȽ�
 * 		�����ʽ����regex���򷵻�ֵΪtrue������Ϊ����ֵΪfalse
 * 
 * 	
 * @author Administrator
 *
 */

public class Demo02Zz {
	
	
	
	public static void method1(){
		//String regex="[^abc]";// abc��������һ���ַ�
		String regex1="[a-z&&[^a-f]]";
		String regex2="\\d";
		String str="10";
		System.out.println(str.matches(regex2));
		
	}
	
	public static void method2(){
		//1��ͷ���ֻ�����
		String regex="[1]\\d{10}";
		String num="18812345178";
		boolean bo=num.matches(regex);
		System.out.println(bo);
		//���֤����
		
		String regex1="^[1-9]\\d{5}[1-9]\\d{3}((0[1-9])|(1[0-2]))(([0][1-9]|[1-2]\\d)|3[0-1])\\d{4}$";
		String num1="340827199901015421";
		System.out.println(num1.matches(regex1));
		
		//����
		String regex2="\\w+@\\w{2,5}(\\.com|\\.cn)+";
		String num3="1877368192@163.com";
		System.out.println(num3.matches(regex2));
	}		
	public static void method3(){
		/*
		 * 
		 * split(String regex):
		 * 1.����ָ����������ʽ�ָ��ַ���
		 * 2.����ֵΪ�ָ����ַ�������
		 * 
		 */
		
		String str="java#php#python#vb#c++#.net";
		String regex="#";
		String[] arr=str.split(regex);
		System.out.println(Arrays.toString(arr));
		
		String str1="java234php23python78vb56c++03.net";
		String regex1="\\d+"; //\\d{1,5}
		String[] arr1=str1.split(regex1);
		System.out.println(Arrays.toString(arr1));
	}
	
	
	public static void method4(){
		/*
		 * replaceAll(String regex,String str)
		 * ��������ʽregex,���ַ�������regex��ʽ��ʾ���ַ����滻��str
		 * 
		 */
		
		String str="sasdfsdf534fgwe564564er";
		//�����ַ�����������滻��#
		String regex="[a-z]+";
		String s=str.replaceAll(regex,"");
		System.out.println(s);
		
	}
	
	
	public static void method5(){
		
		String regex="\\w{8,10}";
		String str="abcd1234_a";
		System.out.println(str.matches(regex));
	}
	public static void main(String[] args) {
		
//		method1();
//		method3();
		method4();
		method5();
		//method2();
	}
}
