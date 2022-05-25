package com.brillio.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1= Employee.getEmployeeInstance();
		e1.empId=105;
		
		Employee.companyName="Brillio";
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		emp1.empId=101;
		emp1.empName="John";
		emp1.empSal=5000;
		
		emp2.empId=102;
		emp2.empName="Peter";
		emp2.empSal=6000;
	  
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
//		Employee.displayEmployeeDetails(emp1);
//		Employee.displayEmployeeDetails(emp2);
//		Employee.displayEmployeeDetails(emp3);
		
		
		emp2.printEmployeeDetails();
		emp1.printEmployeeDetails();
		emp3.printEmployeeDetails();
	}

}


