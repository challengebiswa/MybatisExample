package com.mybatis.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.pojo.Employee;

public class MybatisUpdateExample {
 public static void main(String[] args) throws IOException {
	 String resource = "src/main/resources/mybatis.xml";
		File file = new File(resource);
		Reader reader = new FileReader(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();

		Employee employee = session.selectOne("com.mybatis.pojo.Employee.getById",1);
		employee.setName("Test4");
		session.update("com.mybatis.pojo.Employee.update",employee);
		session.commit();
		session.close();
		
}
}
