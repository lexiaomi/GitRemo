package com.xms.javase.day08;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Demo01LinkedMap {
	
	public static void method1(){
		/*
		 * �������е�key
		 * Set<K> keySet():
		 * �÷������Ի�ȡMap���������е�Key,�������Ǵ���һ��Set������
		 */
		
		
		Map<String,Integer> map=new HashMap<String, Integer>();
		map.put("����", 100);
		map.put("��ѧ", 90);
		map.put("Ӣ��", 80);
		map.put("����", 70);
		map.put("��ѧ", 60);
		
		Set<String> set=map.keySet();
		Iterator<String> it = set.iterator();
		for (String str : set) {
			System.out.println(str+":"+map.get(str));
		}
		
	}
	public static void method2(){
		Map<String,Integer> map=new HashMap<String, Integer>();
		map.put("����", 100);
		map.put("��ѧ", 90);
		map.put("Ӣ��", 80);
		map.put("����", 70);
		map.put("��ѧ", 60);
		
//		Collection<Integer> value=map.values();
		/*
		 * 
		 * �������е�K-v
		 * entrySet()
		 * �÷����Ὣÿһ��K-V����һ��Entry(K-V)ʵ����
		 * ������Щʵ�����뵽Set������
		 */
		Set<Entry<String,Integer>> value=map.entrySet();
		for (Entry<String ,Integer> va : value) {
			//System.out.println(va);
			/*
			 * getKey():��ȡEntryʵ����Kֵ
			 * getValue():��ȡEntryʵ����V��ֵ
			 */
			String key=va.getKey();
			Integer in=va.getValue();
			System.out.println(key+":"+in);
			
		}
	}
	
	public static void method3(){
		/*
		 * �������е�Value
		 * values()
		 * �÷������ص���value����Ӧ���͵�Collection����
		 * �����ı���Value���岻��
		 * 
		 */
		
		Map<String,Integer> map=new HashMap<String, Integer>();
		map.put("����", 100);
		map.put("��ѧ", 90);
		map.put("Ӣ��", 80);
		map.put("����", 70);
		map.put("��ѧ", 60);
		
		Collection<Integer> value = map.values();
		for (Integer va : value) {
			System.out.println(va);
		}
	}
	
	public static void main(String[] args) {
//		method1();
//		method2();
		method3();
	}
	
	
	
	
}
