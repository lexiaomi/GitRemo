package com.xms.javase.day02;

/**
 * String���ͣ�
 * @author Administrator
 *
 */
public class Demo01String {
	
	public static void main(String[] args) {
		method1();
		method2();
		System.out.println(4&7);
		method3();
		System.out.println("----------------------------");
		method4();
	}
	
	public static void method1(){
		//�����ַ�������----�������Ĵ�����ʽ
		/*
		 * �ַ������Ǽɻ�Ƶ���޸�(��Ϊ�޸�һ�ξͻ����ڴ��д�������)�������ַ����Ķ�����ҪƵ���޸�----�ɱ��ַ�����(�޸��ַ���)
		 */
		String str1="adc";
		System.out.println(str1);
		str1=str1+"!";
		System.out.println(str1);
		
	}
	
	public static void method2(){
		/*
		 * ==��equals������
		 * ==��
		 * 		�������͵ıȽϣ�ֱ�ӱȽ�ֵ
		 * 		�������ͣ��Ƚϵ�ֵַ
		 * equals():
		 * 		һ�������������͵ıȽ� ��
		 * 			1.��������û����дequals(),�Ƚϵ��ǵ�ֵַ
		 * 			2.����������д��equals(),��ʱ����д�÷���ʱ��Ҫ����ʵ��ҵ�񣬿��ǱȽ�����
		 * 		String�����Ѿ���д��equals():ֻҪ�����������������ͬ���򷵻�ֵΪtrue����Ϊfalse�����ִ�Сд��
		 */
		
		/*
		 * 
		 * �ַ�����ʹ����������������ʱ�����ڶ��ڴ�����һ�������أ����洢�ַ�������ʹ����������������ʱ�����Ȼ��ڳ�������Ѱ���Ƿ�����ö���"һ��"���ַ���������������
		 * 	���������е��ַ�������ĵ�ֱֵַ�Ӹ�ֵ����Ҫ�����ö�������ñ��������û������ڳ����������´������󣬰ѵ�ֵַ��ֵ�����ñ���
		 */
		
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		System.out.println("-------==--------------");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println("---------------equals-------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
	
	}
	/*
	 * new�ؼ��ֺ��������Ĵ�������
	 * 	ʹ��new�ؼ��ִ�����������ǿ���Բ���
	 * 	�����ڴ��п��ٿռ�洢����
	 * 		new�ؼ��ִ�����������£�
	 * 			1.��������û�С���ͬ�����ݵĶ��󣬻��ڳ����غͳ���������д�������
	 * 			2.�������С���ͬ���ݡ��Ķ���������ݲ����ڳ����������´����µ����ݣ�
	 * 				�����ڳ���������Ķ��ڴ��п��ٿռ䣬�洢����
	 * 
	 * 
	 */
	public static void method3(){
		// new�ؼ��ִ�������
		String s= new String("abc");//һ�δ�����������һ���ڶ��У�һ����������
		String s1="1234";//�������ķ�ʽ��������
		
		/*
		 * �༭�������ԣ���һ�����ʽ�������߶���������ʱ����ô�༭�����ȼ��㣬���ṹ���ɱ��ʽ��λ�ã��������㿪��
		 * 		
		 */
		String s2="123"+"4";// ����һ������
		String s3="123"; //һ������
		String s4=s3+"4";  // ��������
		/*
		 * �ַ���ƴ�ӣ� �ײ���ʹ�ÿɱ��ַ����У��ɱ��ַ����к��ַ����ǲ�ͬһ�����ͣ����Ҿ����ɱ��ַ����д�������ݺ���������������������ͬһ���ڴ�����
		 * 
		 * 
		 */
		System.out.println(s1==s2);
		System.out.println(s1==s4);
	}
	
	public static void method4(){
		String s1=""; //һ�����󣬿յģ�û������
		String s2=" "; // һ������ �пո�������
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2); // f
		System.out.println(s1.equals(s2));//f
		String s3=null; // û�д�������Ҳ��û�е�ֵַ���ڶ���û�����ݣ�ָ����Ƕ��пյ�
		System.out.println(s1.equals(s3));// f
	//	System.out.println(s3.equals(s2)); // ��ָ���쳣��s3��û�ж����޷���������
		/*
		 *  java.lang.NullPointerException
		 *  ��ָ���쳣�� ��ʹ�ö����������ʱ�����쳣
		 *  ԭ�� ����û������(û�ж������)
		 */
		// null Ҳ������
		String s4 = "null";
		System.out.println(s4.equals(s3));
	} 
}
