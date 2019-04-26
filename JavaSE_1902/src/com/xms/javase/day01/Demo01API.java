package com.xms.javase.day01;

import com.xms.basic.day13.Animal;

/**
 * JAVAME:΢�Ͱ�Javase,�������JavaSE�Ļ���֮�ϣ�ɾ��������ͽӿڣ�ͬʱ���һ���ֹ�����Ϸ�����ĵĹ�����(�ֻ�С��Ϸ)
 * JavaSE������Java����Ҫ��һЩ��������ͽӿڣ��Լ���Ӧ�ķ���(�����࣬�ӿڣ���������ͨ��.......)
 * JavaEE:���ڻ�����JavaSE��ǰ���¡����ϲ��ֵĹ���web��̵�������(��ҵ������);
 *	---�ĵ�ע�ͣ�д�����ǰ�棬������ģ� д�ڷ���ǰ�����ͷ����ģ�
 *			ֻ���ĵ�ע�ͲŻ�������doc�ĵ���ʾ����
 *
 * @author  ������
 * @see �ο����ס����õ�֪ʶ��
 * @version ��װ�����ʱ����ʹ�õİ汾JDK 1.6
 * @since ���ĸ��汾֧�����ֹ���
 * 
 * jar��������һ����װ�õ��࣬�����ǽӿ�
 * ����jar��:ѡ���ӦҪ���ɵ�������ǽӿڣ�
 * 		���裺Export--->Java-->JARfile
 * 
 * ����jar����ѡ��Ҫ�������Ŀ��������Ŀ���´���Folder,����Ϊlib,����Ҫ����ĵ�jar��(.jar, .zip)���Ƶ�lib�ļ��У�����ļ���Դ·����Ҳ����add Builder path
 * 
 */
public class Demo01API {
	
	
	public static void main(String[] args) {
		Animal an=new Animal();
	}
	/**
	 * ���������add�������ڷ��������һ���ַ���
	 */
	public void add(){
		/*
		 * ����ע��(һ���߼���������棬)---һ���ǽ���һ���ִ������˼
		 * �����һ��������
		 */
		System.out.println("add()");// ����ע��---����һ�����ĺ��� д��һ�����֮���������������
	}
	
	
	/**
	 * ��������Ǽ�������int���͵�������ӵķ���
	 * @param a int���͵Ĳ���a
	 * @param b int���͵Ĳ���b
	 * @return  ����ֵ��a+b�ĺ�
	 */
	public int add1(int a,int b){
		System.out.println("int-add(int a,int b");
		return a+b;
	}
}
