package com.xms.javase.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * ���Ϸ��̰߳�ȫ��
 * 	������ת���̰߳�ȫ��
 * 
 * @author Administrator
 *
 */
public class Demo07Thread {
	public static void main(String[] args) {
		//���̰߳�ȫ�ļ���
		List<String> list=new ArrayList<String>();
		Set<String> set=new HashSet<String>();
		Map<String,Integer> map=new HashMap<String, Integer>();
		/*
		 * ����̰߳�ȫ�ļ���
		 */
		Collections.synchronizedList(list);
		Collections.synchronizedSet(set);
		Collections.synchronizedMap(map);
		
	}
}
