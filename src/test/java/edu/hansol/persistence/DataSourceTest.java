package edu.hansol.persistence;
import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTest {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testConnection() {
		try {
			final Connection conn = dataSource.getConnection();
			log.info("conn = " + conn);
			
		} catch (Exception e) {
			log.info("예외발생: " + e.getStackTrace());
		}
	}
	
	@Test
	public void testMybatis() {
		final SqlSession sqlSession = sqlSessionFactory.openSession();
		final Connection conn = sqlSession.getConnection();
		log.info("sqlSession = " + sqlSession);
		log.info("conn = " + conn);
	}
}