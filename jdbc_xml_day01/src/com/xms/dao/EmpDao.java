package com.xms.dao;

import java.util.List;

import com.xms.entity.Emp;

public interface EmpDao {
	
	List<Emp> getEmp();
	
	//����Ա���Ų�ѯԱ����Ϣ
	Emp getEmpOne(int empno);
	//����Ա����Ϣ
	int addEmp(Emp e);
	
	//�޸�Ա����Ϣ
	int updateEmp(Emp emp);
	
	//ɾ��ָ��Ա����Ϣ
	
	int deleteEmpOne(int empno);
}
