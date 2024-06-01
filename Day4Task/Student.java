package com.ey.task4;
import java.util.Calendar;
import java.util.Arrays;
import java.util.Date;

public class Student {
	private Integer admissionCode;
	private String studentName;
	private Date birthdate;
	private Integer[] marks;
	private String grade;
	private static Integer admissionCounter = 0;
	private static String schoolName;
	
	static {
		schoolName = "Hyderbad Public School";
	}
	public Student() {
		this.admissionCode = admissionCounter+100;
	}
	public Student(String studentName, Date birthdate) {
		this();
		this.studentName = studentName;
		this.birthdate = birthdate;
	}
	public Student(String studentName, Date birthdate, Integer[] marks) {
		this(studentName, birthdate);
		this.marks = marks;
		calculateGrade();
	}
	public Integer getAdmissionCode() {
		return admissionCode;
	}
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public Integer[] getMarks() {
		return marks;
	}
	public void setmarks(Integer[] marks) {
		this.marks = marks;
		calculateGrade();
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade() {
		calculateGrade();
	}
	public static String getSchoolName() {
		return schoolName;
	}
	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}
	private void calculateGrade() {
		if (marks != null && marks.length == 3) {
			int totalMarks = Arrays.stream(marks).mapToInt(Integer::intValue).sum();
			if (totalMarks >=240 && totalMarks <= 300) {
				this.grade = "Excellent";
			} else if ( totalMarks >= 180 && totalMarks < 240) {
				this.grade = "Good";
			} else if ( totalMarks >= 150 && totalMarks < 179) {
				this.grade = "Average";
			} else {
				this.grade ="Fail";
			}
		} else {
			this.grade = "N/A";
		}
	}

	@Override
	public String toString() {
		return "Student [admissionCode=" + admissionCode +", studentName='" + studentName + ", birthdate=" + birthdate
				+ ", marks=" + Arrays.toString(marks) + ", grade=" + grade + "]";
			
	}
}
