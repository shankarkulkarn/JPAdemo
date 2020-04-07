package com.cg.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="emp_tbl")
@NamedQueries(
{
@NamedQuery(name="findall",query="select e from Employee e"),
@NamedQuery(name="findEmployeeBySalary",
 query="select e from Employee e where e.employeeSalary > :salary")
}
)
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="eid")
	private  int employeeId;
	
	
	@Column(name="ename",length=15)
	private String employeeName;
	
	@Column(name="esal")
	private int employeeSalary ;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
}
