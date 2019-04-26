package com.xms.javase.day07;

import java.io.ObjectInputStream.GetField;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * Map�ӿڣ�
 * 		Map����������
 * 		�����ݽṹ��������һ���������еı��
 * 		ÿ�����ݶ�����������Ϣ��Key-Value
 * 		Key:Ψһ���ظ���(equals()�����Ƚ�)
 * 		Value:�����ظ���ֵ
 * 		
 * 		Map�ӿں�Collections�ӿ������������Ľӿ�
 * 		Map<K,V>   K,V��Ӧ�������͵ķ���
 * 		ʵ���ࣺHashMap
 * 		ʵ�ַ�ʽ��
 * 			Map<k,v> map=new HashMap<k,V>();
 * 
 * 
 * @author Administrator
 *
 */
public class Demo03Map {
	
	public static void method(){
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1,"java");
		map.put(2, "jsp");
		map.put(3, "js");
		map.put(4, "jquery");
		map.put(2, "mysql");
		System.out.println(map);
		Set<Integer> keySet = map.keySet();
		for (Integer in : keySet) {
			System.out.println(in);
		}
		Collection<String> values = map.values();
		for (String str: values) {
			System.out.println(str);
		}
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
	}
	
	
	public static void method1(){
		//����Map���ϣ�K:Ψһ�ģ�V:���ظ�
		Map<String,Integer> map=new HashMap<String ,Integer>();
		/*
		 * �������
		 * put(K,v):
		 * ����ֵ����ΪValueֵ������
		 * 1.����ӵ�Ԫ��K-V�ڼ����в����ڣ�Ϊ���Ԫ�ع���---����ֵΪnull����ΪV����
		 * 
		 * 2.����ӵ�Ԫ��K-V�ڼ����д���ʱ��������Kֵ��equals�����Ƚ��Ƿ�Ϊtrue��
		 * 		���滻�Ƚ�Ϊtrue�Ķ�Ӧ��value��ֵ(��ͬ��set����----�޸ĵĹ���)
		 * --����ֵΪ����ӦK�滻����Value
		 */
		Integer put = map.put("����", 120);
		map.put("��ѧ", 90);
		map.put("Ӣ��", 80);
		map.put("����", 70);
		map.put("����", 60);
		Integer put2 = map.put("Ӣ��", 90);
		System.out.println(put);
		System.out.println(map);
		System.out.println("------------------------------------");
		System.out.println(put2);
		System.out.println(map);
		
		/*
		 * get(K):
		 * 	--equals() �Ƚ�Ϊtrue����Ϊ��ͬ��K
		 * �÷������ݸ�����key����ȡ��Ӧ��Valueֵ
		 * ����ֵΪ��Ӧ���͵�Vֵ
		 * 
		 * ���������Kֵ�ڼ����в����ڣ��򷵻�ֵΪnull
		 */
		Integer in= map.get("����");
		System.out.println(in);
		Integer in1 = map.get("Java");
		System.out.println(in1);
		
		/*
		 * remove(K):	--equals() �Ƚ�Ϊtrue����Ϊ��ͬ��K
		 * �÷������ݸ�����K��ɾ��K-V���һ������
		 * ����ֵΪ��ɾ��K����Ӧ��Vֵ�����û���ҵ���Ӧ��Kֵ���򷵻�ֵΪnull
		 * 
		 */
		System.out.println("----------------------------------");
		//ɾ�������д��ڵ�K---Ӣ��
		Integer re1 = map.remove("Ӣ��");
		System.out.println(re1);
		System.out.println(map);
		//ɾ�������в����ڵ�
		Integer re2 = map.remove("����");
		System.out.println(re2);
		System.out.println(map);
		
		//containsKey(k)
		/*
		 * ��������true
		 * ��֮false
		 */
		
		boolean ck = map.containsKey("����");
		System.out.println(ck);
		
		
	}
	/*
	 * ��һ��ѧ����ѧ��
	 * name,age,sex
	 * 
	 */
	
	public static void method2(){
		Map<Student,Integer> map=new HashMap<Student,Integer>();
		map.put(new Student("ls", 15, '��'), 108);
		map.put(new Student("zs", 20, 'Ů'), 191);
		map.put(new Student("ww", 18, '��'), 101);
		map.put(new Student("qq", 19, '��'), 109);
		map.put(new Student("ww", 18, '��'), 101);
		map.put(new Student("zl", 11, 'Ů'), 104);
		
		/*
		 * ��дequals()����Ӧ����дhashCode()����
		 * ��д�������£�
		 * 	1.����������equals�Ƚ�Ϊtrue����ôhashCode()����ֵ������ͬ
		 * 		����дequals()����Ҳ��Ҫ��дhashCode()
		 *  2.��֮���Ǳ��룬�����������Ҫ���⣬���������������equals�Ƚ�Ϊfalse������hashCode()����ֵ
		 *  һ����������Ӱ��HashMap��������ʧ
		 *  ����дequals������û����дhashCode()
		 * 
		 */
		boolean ck = map.containsKey(new Student("ls", 15, '��'));
		System.out.println(ck);
		
		Set<Entry<Student, Integer>> set = map.entrySet();
		for (Entry<Student, Integer> en : set) {
			System.out.println(en);
		}
	}
	
	
	
	
	
	public static void method3(){
		Map<String,Student> map=new HashMap<String ,Student>();
		map.put("�೤", new Student("mjl",28,001));
		map.put("����ίԱ", new Student("sdf",22,005));
		map.put("ѧϰίԱ", new Student("vfg",23,003));
		map.put("��֧�����", new Student("lll",20,006));
		Set<Entry<String, Student>> entrySet = map.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println(entry);
		}
	}
	
	
	
	public static void method4(){
		Map<Point, Integer> map=new HashMap<Point, Integer>();
		Point p1 = new Point(1,1);
		int point=p1.hashCode();///hashCodeֵ
		System.out.println("�޸�ǰ��"+point);
		System.out.println("�޸�ǰ��"+point);
		map.put(p1, 1);
		System.out.println(map.get(p1));
		//�޸�Kde1����
		
		/*
		 * ע�⣺
		 * 	hashCode():
		 * 	�ڵ�ǰ��������û�з����ı������£�Ӧ����η���ֵ����ͬ�ģ�������ݷ����ı�
		 * 	��Ӧ������Ϊ��ͬ��ֵ
		 */
		p1.x=2;
		int point1=p1.hashCode();
		System.out.println("�޸ĺ�"+point1);
		System.out.println("�޸ĺ�"+point1);
		
		
	}
	
	
	public static void method5(){
		//�������ӣ�0.75�� ƽ���ȡЧ�ʺͿռ�������(ʵ��)
		/*
		 * û�г�ʼ��ɢ�����СĬ��ֵ��16
		 * ���Ը������ݶ������ı䣬��������ʼ�ձ�����0.75;
		 * 
		 * 
		 * �Զ���ɢ����Ĵ�С
		 * 	�������Ƚϴ󣬿�������
		 * 
		 */
		
	}
	public static void main(String[] args) {
//		method();
//		method1();
		//method2();
		//method3();
		method4();
		
		
		
	}
}
//Point
class Point{
	int x;
	int y;
	
	public Point(){
		
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
}
