package com.xms.javase.day04;
/**
 * 	��װ�ࣺ  ��Ի�����������
 * 		Java�����������ı�����ԣ����������ݲ��涼�Ƕ���
 * 		�������ݲ��Ƕ��󣬲�������ڲ���
 * 		���������������͵�ԭ����Ϊ�����������Ҫ��������������߱Ƚ�����
 * 
 * 	��������----->��������(����)---->װ��
 * 	��������----->�������� (��ֵ)---->����
 * 
 * �Զ�װ�䣺�ѻ������������Զ�װ���������������
 * �Զ����䣺���������������Զ�����ɻ�����������
 * @author Administrator
 *
 */
public class Demo01 {
	
	public static void main(String[] args) {
//		int i=1234234;
//		Integer it=i; //�Զ�װ��
//		System.out.println(it);
//		System.out.println(i+it);
//		int i1=it; // �Զ�����
//		System.out.println(i1);
		
		
		int a=23;
		int b=12;
		
		/*
		 * װ��
		 */
		//��������---��������(���췽��)
		Integer it=new Integer(a);
		System.out.println(it);
		
		/*
		 * valueOf(�������ͱ���):
		 * ����������װ��ɶ�Ӧ��������������
		 */
		
		Integer ii=Integer.valueOf(12);
		System.out.println(ii*2);
		
		/*
		 * ����
		 * ��������Value():
		 * ���������Ͳ���ɻ�����������
		 */
		
		int ii1=ii.intValue();
		System.out.println(ii1);
	}
}
