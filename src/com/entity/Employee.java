package com.entity;

public class Employee {

	private int empId;
	private String empName;
	private String empDepartment;
	private double empSalary;

	public Employee(int empId, String empName, String empDepartment, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empSalary = empSalary;
	}

	public Employee(String empName, String empDepartment, double empSalary) {
		super();
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empSalary = empSalary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDepartment=" + empDepartment + ", empSalary="
				+ empSalary + "]";
	}

}