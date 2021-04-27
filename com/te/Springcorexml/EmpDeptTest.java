package com.te.Springcorexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.employeespring.Employee;

public class EmpDeptTest {

	public static void main(String[] args) {

ApplicationContext context=new ClassPathXmlApplicationContext("Employee.xml");
Employee employee=(Employee) context.getBean("empdept");
System.out.println(employee.getEid());
System.out.println(employee.getEname());
System.out.println(employee.getDept().getId());
System.out.println(employee.getDept().getDname());


	}

}
