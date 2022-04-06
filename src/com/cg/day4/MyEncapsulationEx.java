package com.cg.day4;

class Student{
	int rollno;
	String name;
	double marks;
	
	public Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
	
}
public class MyEncapsulationEx {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Tom", 58);
		System.out.println("Roll No:"+ s1.getRollno());
		System.out.println("Name:"+ s1.getName());
		System.out.println("Marks:"+ s1.getMarks());

	}

}
