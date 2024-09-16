package com.eis.service;

import java.util.Scanner;

import com.eis.bean.Employee;

	public class emplserimpl implements EmployeeService{
		
		public Employee getemployeedetailfromuser() {
			System.out.println("enter employee id ");
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			
			System.out.println("enter employee name ");
			
			String name = sc.next();
			
			System.out.println("enter employee salary ");
			
			int salary = sc.nextInt();
			
			System.out.println("enter employee designation ");
			
			String desg = sc.next();
			
			return new Employee(id,name,salary,desg);
			
		}
		
		public void findinsuarancescheme(Employee employee) {
			String scheme;
			if (employee.getSalary()>10000) {
				scheme = "high";
			}
			else if (employee.getSalary()>8000 ) {
				scheme = "standard";
			}
			else {
				scheme = "low";
			}
			
			employee.setInsuarancescheme(scheme);
			
		}
		
		public void displayalldetail(Employee employee) {
	        System.out.println(employee);
	    }

	};


