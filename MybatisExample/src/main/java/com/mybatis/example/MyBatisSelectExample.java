package com.mybatis.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.pojo.Employee;

public class MyBatisSelectExample {

	public static void main(String[] args) throws IOException {
		String resource = "src/main/resources/mybatis.xml";
		File file = new File(resource);
		Reader reader = new FileReader(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();

		Employee employee = session.selectOne("com.mybatis.pojo.Employee.getById",1);

		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getDept());
		System.out.println(employee.getSal());
		System.out.println(employee.getEmail());
		System.out.println(employee.getPhone());
		session.commit();
		session.close();

	}
}
