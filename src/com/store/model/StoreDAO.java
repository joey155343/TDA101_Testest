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
