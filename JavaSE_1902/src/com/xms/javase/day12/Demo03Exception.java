 package com.xms.javase.day12;
/**
 * finally:���յ�
 * 		��try-catchһ��ʹ��
 * 		����try���еĴ����Ƿ��쳣��finally����䶼�ᱻִ��
 * 		ͨ����ʹ��finall���������
 * 
 * 		����IO�Ĺ��������ݿ�Ĺر�����
 * @author Administrator
 *
 */
public class Demo03Exception {
	public static void main(String[] args) {
		try {
			System.out.println("���������ݿ⽨������");
			System.out.println("��������");
			System.out.println("���ӳɹ�");
			System.out.println("����������");
			String a="a";
			int i=Integer.parseInt(a);
			System.out.println(i);
			System.out.println("�����ݿ��в�������");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
//			e.getMessage();
			/*
			 * 
			 * ��־��¼��
			 * 
			 */
		}finally{
			//���յı���Ҫ���Ĳ���
			System.out.println("�ر����ݿ�����");
		}
		
		
	}
}
