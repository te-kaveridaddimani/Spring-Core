package com.te.employeespring;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee implements Serializable{
	public Employee() {
	
	}
	private int eid;
	private String ename;
	private Department dept;
	
}
