package com.xms.javase.day15;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * y����Log4j�Ĳ�����
 * 	����䵱Log4j����־��¼��
 * @author Administrator
 *
 */
public class TestLog4j {
	//��ȡ��־��¼������ǰ��(���������)
	static Logger logger=Logger.getLogger(TestLog4j.class);
	
	public static void main(String[] args) {
		//���������ļ�
		PropertyConfigurator.configure("./src/com/xms/javase/day15/testLog4j.properties");
		
		for (int i = 0; i <15; i++) {
			logger.info("this is an info");
			logger.warn("this is an warn");
			logger.error("this is an Error");
			logger.debug("this is an Debug");
		}
		
	}
	
}
