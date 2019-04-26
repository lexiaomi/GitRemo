package com.xms.javase.day06.p;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * li��list������remove(int index) �Ƴ�������Ԫ��ֵΪa��Ԫ��
 * @author Administrator
 *
 */
public class Demo01 {
	
	
	public static void method1(){
		List<String> li=new ArrayList<String>();
		//li.add("a");
		li.add("b");
		li.add("c");
		li.add("a");
		li.add("a");
		li.add("d");
		li.add("e");
		li.add("f");
		System.out.println(li.indexOf("a"));
		for(int i=li.size()-1;i>=0;i--){
			if(li.get(i).equals("a")){
				li.remove(i);
			}
		}
		System.out.println(li);
	}
	
	
	public static void method2(){
		List<String> li=new ArrayList<String>();
		li.add("a");
		li.add("b");
		li.add("c");
		li.add("a");
		li.add("a");
		li.add("d");
		li.add("e");
		li.add("f");
		
		/**
		 * ������ר��ΪList�������������ʵ�ַ���
		 * 
		 */
		ListIterator<String> lit=li.listIterator();
		while(lit.hasNext()){
			//System.out.println(lit.next());
			
			if(lit.next().equals("a")){
				lit.set("A");
				lit.remove();
				lit.add("F");
			}
		}
		System.out.println(li);
		
		//�Ӻ���ǰ����
		
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
			System.out.println(lit.previousIndex());
		}
	}
	
	
	public static void method3(){
		/*
		 * sublist(int from, int dext):��ȡ�����е��Ӽ�
		 * �����Ƕ�Ӧ���Ͻ�ȡ�ε��±�
		 * --����ֵΪ��ȡ�Ķ�Ӧ���͵ļ���
		 */
		
		
		List<Integer> li=new LinkedList<Integer>();
		for(int i=1;i<=20;i++){
			li.add(i);
		}
		System.out.println(li);
		System.out.println("SubList------------------------");
		List<Integer> li1=li.subList(0, 11);
		System.out.println(li1);
		
		System.out.println("SubList------------------------");
		for(int i=0;i<li1.size();i++){
			int a=li1.get(i)*10;
//			System.out.println(a*10);
			li1.set(i, a);
		}
		//��ȡ��Ҳ����ͬ�ĵ�ֵַ���ı��Ӽ��е�Ԫ�أ��൱�ڸı��Ӧ��ַ�е�Ԫ�أ���ָ��õ�ַ��ԭ����Ҳ�ᷢ���ı�
		
		System.out.println(li1);
		System.out.println(li);
		
	}
	
	public static void method4(){
		/*
		 * ���ϸ�����֮���ת��
		 * 1.toArray()���Զ�ת��Object���͵�����---�Ƚ��鷳��������
		 * 2.toArray(new ��������[���鳤��])
		 * 	1.���������ĳ��ȣ�����ԭ����Ԫ�صĸ���������Ĳ��ֲ���null;
		 * 	2.�����������鳤��С��ԭ���ϵĳ��ȣ�
		 * 		ϵͳĬ�ϻ�Ĭ�϶���һ����СΪ����Ԫ�صĸ��������鳤�ȣ�����ʹ����Ϊ���������ĳ���
		 * 	3.һ�㶨������鳤�ȶ���Ϊԭ���ϵĴ�С
		 * 
		 */
		
		List<Integer> li=new LinkedList<Integer>();
		for(int i=1;i<=20;i++){
			li.add(i);
		}
		Integer[] intarr=li.toArray(new Integer[li.size()]);
		System.out.println(Arrays.toString(intarr));
		
	
//		int[] arr=new int[li.size()];
//		for(int i=0;i<arr.length;i++){
//			arr[i]=li.get(i);
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		/*
		 * ����ת���ϣ�---һ��ת��list����
		 * Arrays.asList();
		 * asList(����[],arr):
		 * ��ָ��������ת��List
		 * ����ֵΪ��Ӧ���͵ļ���
		 */
		
		String[] arr1=new String[]{"a","b","c","d","e"};
		/*
		 * ������ת�ɵļ��ϣ�����ֱ���޸ļ����е�Ԫ��
		 * ����ᱨ�쳣���Ƿ�����java.lang.UnsupportedOperationException
		 * 
		 * 
		 * ����޸ļ����е�Ԫ�أ���Ҫ���´���һ�����ϣ����ü�����ӵ��¼����в���
		 * 
		 * ���ϵĸ���
		 */
		
		
		List<String> li2=Arrays.asList(arr1);
		
		System.out.println(li2); 
	  	
		System.out.println("------------------------------");
		/*
		 * ���ϵĸ���
		 * 1.ʹ��addAll(����)��
		 * 2.ʹ�ü��ϵ��в����Ĺ��췽��
		 */
		List<String> li3=new ArrayList<String>();
		li3.addAll(li2);
		System.out.println(li3);
		System.out.println("------------------------------");
		//ʹ�ù��췽��
		List<String> li4=new ArrayList<String>(li2);
		li4.add("g");
		System.out.println(li4);
		
		
	}
	
	public static void main(String[] args) {
	//	method1();
	//	method2();
	//	method3();
		method4();
		
	}
}
