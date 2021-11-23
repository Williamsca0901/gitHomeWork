package com.syntax.class16;

public class StudentTester {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.name="Christine";
		student.id="123";
		Student.numberOfStudents++;
		
		Student student1=new Student();
		student1.name="Philip";
		student1.id="1234";
		Student.numberOfStudents++;
		
		Student student2=new Student();
		student2.name="Kevin";
		student2.id="12345";
		Student.numberOfStudents++;
		
		System.out.println(Student.numberOfStudents);
	}

}
