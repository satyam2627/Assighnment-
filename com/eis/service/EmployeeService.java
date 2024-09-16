package com.eis.service;

import com.eis.bean.Employee;
import java.util.Scanner;

public interface EmployeeService{
	Employee getemployeedetailfromuser(); // yeh user se details lega 
	void findinsuarancescheme(Employee employee); // yeh categorize karega scheme
	void displayalldetail(Employee employee);
};
 



