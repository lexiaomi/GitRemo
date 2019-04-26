package com.xms.test;

import java.util.List;

import com.xms.dao.DeptDao;
import com.xms.daoimpl.DeptDaoImpl;
import com.xms.entity.Dept;

public class TestJDBC2 {
	
	//���Ӳ�����Ϣ
	public static  void  addDept() {
		DeptDao deptDao=new  DeptDaoImpl();
		Dept dept=new Dept(60,"�г���","��ɳ");
		int i = deptDao.insertDept(dept);
		if(i>0) {
			System.out.println("����ɹ�");
		}
	}
	
	//��ѯָ��������Ϣ
	
	public static void getEmpOne() {
		DeptDao deptDao=new  DeptDaoImpl();
		Dept deptOne = deptDao.selectDeptOne(60);
		System.out.println(deptOne);
	}
	
	//��ѯȫ��������Ϣ
	
	public static void getEmpAll() {
		DeptDao deptDao=new  DeptDaoImpl();
		List<Dept> deptAll = deptDao.selectDeptAll();
		for (Dept dept : deptAll) {
			System.out.println(dept);
		}
	}
	
	// ɾ��ָ��������Ϣ
	public static  void  deleteDept() {
		DeptDao deptDao=new  DeptDaoImpl();
		
		int i = deptDao.deleteDept(50);
		if(i>0) {
			System.out.println("ɾ���ɹ�");
		}
	}
	
	// �޸�ָԱ������Ϣ
	
	public static void updateDept() {
		DeptDao deptDao=new  DeptDaoImpl();
		Dept dept=new Dept();
		dept.setDeptno(20);
		dept.setDname("�з���");
		dept.setLocation("�Ͼ�");
		
		int n= deptDao.updateDept(dept);
		if(n>0) {
			System.out.println("�޸ĳɹ�");
		}
	}
	
	public static void main(String[] args) {
		addDept();
//		getEmpOne();
//		getEmpAll();
//		deleteDept();
//		updateDept();
	}
}
