package com.ndarkness.board;

import java.sql.DriverManager;

import org.junit.Test;

import java.sql.Connection;

public class MySQLConnectionTest {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/ndarkness?serverTimezone=UTC&useSSL=false";
	//jdbc:mysql:�ּ�:��Ʈ/DB��
	private static final String USER = "root";
	private static final String PW = "123456";
	//Root ��й�ȣ
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}