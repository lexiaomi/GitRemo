package com.xms.javase.day02;

import java.util.ArrayList;

public class Test {
public static void main(String[] args) {
	  String str = "abc";
      char[] array = {'a', 'b', 'c'};
      String str2 = new String(array);
      //ʹ��intern()��str2�ַ������ݷ��볣����
      str2 = str2.intern();
      //����Ƚ�����˵���ַ������泣��������ʹ��intern�������ַ�������ͬһ���ط�
      System.out.println(str == str2);
      //�Ǻã��������Ǿ�ƴ����intern��
      ArrayList<String> list = new ArrayList<String>();
      for (int i = 0; i < 50000000; i++) {
          String temp = String.valueOf(i).intern();
          list.add(temp);
      }
}
}
