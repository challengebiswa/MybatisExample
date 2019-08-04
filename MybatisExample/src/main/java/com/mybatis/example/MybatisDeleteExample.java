package com.mybatis.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisDeleteExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String resource = "src/main/resources/mybatis.xml";
		File file = new File(resource);
		Reader reader = new FileReader(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();
		session.delete("com.mybatis.pojo.Employee.delete",1);
		session.commit();
		session.close();
	}

}
