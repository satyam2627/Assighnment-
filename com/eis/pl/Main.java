package com.eis.pl;
import com.eis.bean.Employee;
import com.eis.service.EmployeeService;
import com.eis.service.emplserimpl;

public class Main {
public static void main(String args[]) {
	EmployeeService em = new emplserimpl(); // interface se implemented class ka object banaya
	Employee employee = em.getemployeedetailfromuser(); 
	em.findinsuarancescheme(employee); // yeh insuarance scheme set kar dega current user k liye 
	em.displayalldetail(employee);
	

}
}
