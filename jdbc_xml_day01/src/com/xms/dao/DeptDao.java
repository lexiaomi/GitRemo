package com.xms.dao;

import java.util.List;

import com.xms.entity.Dept;

public interface DeptDao {
	//��Ӳ���
	int insertDept(Dept dept);
	
	//��ѯָ��������Ϣ
	Dept selectDeptOne(int deptno);

	List<Dept> selectDeptAll();

	int deleteDept(int deptno);

	int updateDept(Dept dept);
	
	
}
