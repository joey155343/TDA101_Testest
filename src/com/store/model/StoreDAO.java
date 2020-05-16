package com.store.model;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class StoreDAO implements StoreDAO_interface {
	private static DataSource ds = null;
	public StoreDAO() {
	}
	private static final String INSERT_STMT = 
			"INSERT INTO emp2 (empno,ename,job,hiredate,sal,comm,deptno) VALUES (emp2_seq.NEXTVAL, ?, ?, ?, ?, ?, ?)";
		private static final String GET_ALL_STMT = 
			"SELECT empno,ename,job,to_char(hiredate,'yyyy-mm-dd') hiredate,sal,comm,deptno FROM emp2 order by empno";
		private static final String GET_ONE_STMT = 
			"SELECT empno,ename,job,to_char(hiredate,'yyyy-mm-dd') hiredate,sal,comm,deptno FROM emp2 where empno = ?";
		private static final String DELETE = 
			"DELETE FROM emp2 where empno = ?";
		private static final String UPDATE = 

			"UPDATE emp2 set ename=?, job=?, hiredate=?, sal=?, comm=?, deptno=? where empno = ?";

	@Override
	public void insert(StoreVO storeVO) {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/TestDB");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(StoreVO storeVO) {

	}

	@Override
	public void delete(StoreVO storeVO) {

	}

	@Override
	public StoreVO findByPK(StoreVO storeVO) {
		return null;
	}

	@Override
	public List<StoreVO> getAll(StoreVO storeVO) {
		return null;
	}

}
