package com.te.Springcorexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.employeespring.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee employee=(Employee) context.getBean("empOne");
		System.out.println(employee.getEid());
		System.out.println(employee.getEname());

	}

}
