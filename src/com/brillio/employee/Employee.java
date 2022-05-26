package com.brillio.employee;

public class Employee {
	
	public int empId;
	public String empName;
	public double empSal;
	public static String companyName; 
	
	public Employee()
	{
		System.out.println("Object created ");
		System.out.println("Launch browser");
	}
	public Employee(int empId)
	{
		this.empId=empId;
		System.out.println("Object created ");
		System.out.println("Launch browser");
	}
	
	
	public Employee(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
		System.out.println("Object created ");
		System.out.println("Launch browser");
	}
	
	public Employee(String empName,int empId)
	{
		this.empId=empId;
		this.empName=empName;
		System.out.println("Object created ");
		System.out.println("Launch browser");
	}
	
	public Employee(int empId,double sal)
	{
		this.empId=empId;
		System.out.println("Object created ");
		System.out.println("Launch browser");
	}
	
	public static void displayEmployeeDetails(Employee e)
	{
		System.out.println(e);
		System.out.println(e.empId);
		System.out.println(e.empName);
		System.out.println(e.empSal);
		System.out.println(Employee.companyName);
		System.out.println("-------------------------------");
	}
	
	public void printEmployeeDetails()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSal);
		System.out.println(Employee.companyName);
		System.out.println("-------------------------------");
	}
	
//	public static Employee getEmployeeInstance()
//	{
//		Employee e=new Employee();
//		return e;
//	}
}



