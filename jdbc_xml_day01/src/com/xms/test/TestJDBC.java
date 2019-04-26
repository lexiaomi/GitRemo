package com.xms.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.xms.dao.EmpDao;
import com.xms.daoimpl.EmpDaoImpl;
import com.xms.entity.Emp;

public class TestJDBC {
	public void test1() {
		EmpDao emp1=new EmpDaoImpl();
		// ��ѯ����Ա����Ϣ
		List<Emp> emps = emp1.getEmp();
		System.out.println("���ϳ��ȣ�"+emps.size());
		for (Emp emp2 : emps) {
			System.out.println(emp2);
		}
	
	}
	
	public static void test2() {
		EmpDaoImpl empOne = new EmpDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ա���ţ�");
		int empno=sc.nextInt();
		Emp emp = empOne.getEmpOne(empno);
		System.out.println(emp);
	}
	
	public static void test3() {
		EmpDaoImpl empOne = new EmpDaoImpl();
		Scanner sc=new Scanner(System.in);
		Emp emp= new Emp();
		emp.setEmpno(1021);
		emp.setEname("����");
		emp.setPosition("Clerk");
		emp.setSalary(1200);
		emp.setBouns(600);
		emp.setHiredate(new Date());
		emp.setLeader(1013);
		emp.setDeptno(20);
		int addEmp = empOne.addEmp(emp);
		if(addEmp>0) {
			System.out.println("����ɹ�");
		}
		
		
	}
	public static void test4() throws Exception {
		EmpDaoImpl empOne = new EmpDaoImpl();
		Emp emp= new Emp();
		emp.setEmpno(1021);
		emp.setEname("����2");
		emp.setPosition("Clerk");
		emp.setSalary(1500);
		emp.setBouns(700);
		emp.setHiredate(new SimpleDateFormat("yyyy-MM-dd").parse("2019-5-1"));
		emp.setLeader(1013);
		emp.setDeptno(20);
		int n = empOne.updateEmp(emp);
		if(n>0) {
			System.out.println("�޸ĳɹ�");
		}
		
		
	}
	
	// ɾ��ָ��Ա��
	public static void test5() {
		EmpDaoImpl empOne = new EmpDaoImpl();
		int i = empOne.deleteEmpOne(1021);
		if(i>0) {
			System.out.println("ɾ���ɹ�");
		}
	}
	public static void main(String[] args) throws Exception {
//		test();
//		test2();
//		test3();
//		test4();
		test5();
	}
}
