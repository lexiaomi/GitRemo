package com.xms.javase.day02.p;
/**
 * 2.�����ַ���"adsadaFASFAASDADAASSDDAS15465"���м���
	��д��ĸ������Сд��ĸ���������֣�
 * 
 */
public class TestString2 {
	public static void main(String[] args) {
		test();
	}
	public static void test(){
		String str="adsadaFASFAASDADAASSDDAS15465";
		int sumUp=0;
		int sumLow=0;
		int sumNum=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='a'&&str.charAt(i)<'z'){
				sumLow++;
			}else if(str.charAt(i)>='A'&&str.charAt(i)<'Z'){
				sumUp++;
			}else{
				sumNum++;
			}
		}
		System.out.println("Сд��ĸ������"+sumLow);
		System.out.println("��д��ĸ������"+sumUp);
		System.out.println("���ָ�����"+sumNum);
		
	}
}
