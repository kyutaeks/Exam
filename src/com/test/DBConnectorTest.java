package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.sql.Connection;

import org.junit.Test;

import com.common.DBConnector;

public class DBConnectorTest {
//
//	@Test
//	public void driverTest() throws ClassNotFoundException {
//		DBConnector.setDriver();
//	}
//
//	@Test
//	public void openTest() throws SQLException {
//		DBConnector.open();
//	}

	@Test
	public void getConTest() {
		Connection con = DBConnector.getCon();
		assertNotEquals(null, con);
	}
}
