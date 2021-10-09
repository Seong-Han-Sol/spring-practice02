package edu.hansol.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "C##BOARD";
	private final String PASSWORD = "BOARD";
	
	@Test
	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			final Connection conn = 
					DriverManager.getConnection(URL, USER, PASSWORD);
			log.info("데이터베이스 연결에 성공했습니다.");
			log.info("conn = " + conn);
			
		} catch (ClassNotFoundException e) {
			log.info("데이터베이스 드라이버 로드를 실패했습니다.");
		} catch (SQLException e) {
			log.info("데이터베이스 연결에 실패했습니다.");
		}
	}
}
