package com.xms.javase.day08;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		//����һ�����˹���
		return pathname.getName().endsWith(".txt");
	}
	
}
