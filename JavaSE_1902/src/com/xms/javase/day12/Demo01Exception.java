package com.xms.javase.day12;
/**
 * �쳣��׽���ƣ�
 * 	 EXception�������߼�������(��Ҫ����)
 * 		RuntimeException:����ʱ�쳣����һ���Ჶ��
 * 		NON-RuntimeException:������ʱ�쳣�������
 * 	 Error���������ϵͳ����
 * �����쳣��Ҫ�׸�main����
 * 	����׸�main,�����ֱ��ֹͣ����
 * @author Administrator
 *
 */
public class Demo01Exception {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("��������ʼ��");
		System.out.println("����1��ʼ��");
		System.out.println("����1����ִ��");
		System.out.println("����1������");
		try {
			/*
			 * 
			 * try���г����쳣������������񵽣����ҳ���Ա������Ӧ�Ĵ�������ǲ�������ڶ�Ӧ��catch���Ǵ��ϵ��±�������Ӧ
			 * �Ĵ������ͣ�ֱ��������֮��ͬ�Ĵ�λ����λ�ã�������������������try-catch�飬
			 * 
			 */
			System.out.println("����2��ʼ��");
			System.out.println("����2����ִ��");
			String str="";
			System.out.println("����2������");
			System.out.println(str.length());
		} catch (Exception e) {
			// TODO: handle exception
			//ע�⣺��catch���У��쳣���͵������Ǵ��ϵ��£�˳��Ϊ��С����
			e.printStackTrace();
		}
		System.out.println("����3��ʼ��");
		System.out.println("����3����ִ��");
		System.out.println("����3������");
		System.out.println("�������������");
	}

}
