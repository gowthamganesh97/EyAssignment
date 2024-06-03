package com.ey.day5.q1;

public class StudentTest {
	public static void main(String[] args) {
		Studentservice ss= new Studentservice();
		
		
		Address a1=new Address("chennai");
		Student s1=new Student("Gowtham","Ganesh",a1);
		
		Address a2=new Address("bangalore");
		Student s2=new Student("Ram","Kumar",a2);
		
		System.out.println(ss.addProduct(s1));
		System.out.println(ss.addProduct(s2));

		ss.listStudents();
		
		System.out.println(ss.isvalidStudent(s1, s2));
		
	}

}