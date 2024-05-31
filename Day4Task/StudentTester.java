package com.ey.task4;
import java.util.Date;
import java.util.*;
public class StudentTester {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Student students[]=new Student[5];
		Integer a[] = {45,42,67};
		
		 students[0]=new Student("Arun1",new Date(7,8,9),a);
		 students[0]=new Student("Arun2",new Date(8,9,0),a);
		 students[0]=new Student("Arun2",new Date(9,10,11),a);
		 students[0]=new Student("Arun3",new Date(10,11,12),a);
		 students[0]=new Student("Arun4",new Date(11,12,13),a);
		 StudentService sc=new StudentService();
		 sc.ShowStudentDetails(students);
	}

}
