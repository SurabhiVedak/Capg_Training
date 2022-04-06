package com.cg.day7;



public class Student implements Comparable<Student>{

    private String id;
    private String name;

    
	public Student( String name, String id) {
		super();
		
		this.name = name;
		this.id = id;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	@Override
	public String toString() {
		 return "Student [ name=" + name +", id=" + id + "]";
		
	}

	@Override
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
	     return this.getName().compareTo(s1.getName());
	}
	

}

