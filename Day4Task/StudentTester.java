package com.ey.task4;
import java.util.Date;
import java.util.*;
public class StudentTester {
	public static void main(String[]args) {
		Student[] student=new Student[5];
		Student.setAdmissionCounter(10);
		student[0]=new Student("Gowtham1" ,new Date(103,4,6) ,new Integer[] {76,70,87});
		student[0].setGrade();
		student[1]=new Student("Gowtham2",new Date(100,2,17),new Integer[] {45,72,68});
		student[1].setGrade();
		student[2]=new Student("Gowtham3",new Date(166,4,6),new Integer[] {91,59,97});
		student[2].setGrade();
		student[3]=new Student("Gowtham4",new Date(103,4,6),new Integer[] {96,70,87});
		student[3].setGrade();
		student[4]=new Student("Gowtham5",new Date(103,4,6),new Integer[] {76,80,87});
		student[4].setGrade();
		
		StudentService sc=new StudentService();
		sc.displayallStudents(student);
	}
}
