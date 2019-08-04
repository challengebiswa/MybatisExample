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

public class MybatisExample {

	public static void main(String[] args) throws IOException {
		String resource = "src/main/resources/mybatis.xml";
		File file = new File(resource);
		System.out.println(file.exists());
		Reader reader = new FileReader(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();
		
		Employee addEmp=new Employee("Test1", "dept1",10000, 9999, "s@ss.com");
		
		session.insert("com.mybatis.pojo.Employee.insert", addEmp);

		List<Employee> employee = session.selectList("com.mybatis.pojo.Employee.getAll");

		for (Employee emp : employee) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getDept());
			System.out.println(emp.getSal());
			System.out.println(emp.getEmail());
			System.out.println(emp.getPhone());
		}
		session.commit();
		session.close();

	}

}
