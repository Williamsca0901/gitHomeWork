package com.syntax.class16;

public class EmployeeTester {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.empId="123";
		employee.salary=100000;
		
		Employee employee2=new Employee();
		employee2.empId="1234";
		employee2.salary=120000;
		
		System.out.println(employee.empId);
		System.out.println(employee.salary);
		System.out.println(employee2.empId);
		System.out.println(employee2.salary);
		System.out.println(Employee.CEO);
		
				

	}

}
