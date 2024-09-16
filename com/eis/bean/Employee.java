package com.eis.bean;

public class Employee {
private  int empid;
private String name;
private int salary;
private String designation;
private String insuarancescheme;

public Employee(int empid,String name, int salary, String designation) {
	this.empid = empid;
	this.name = name;
	this.salary = salary;
	this.designation = designation;
}


public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getInsuarancescheme() {
	return insuarancescheme;
}
public void setInsuarancescheme(String insuarancescheme) {
	this.insuarancescheme = insuarancescheme;
}

public String toString() {
	return "Employee_id=" + empid + ", name=" + name + ", salary=" + salary +
            ", designation=" + designation + ", insuranceScheme=" + insuarancescheme + "]";
}




}
