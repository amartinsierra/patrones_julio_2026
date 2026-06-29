package com.good.prototype;

public class Course implements Cloneable{
	private String name;
	private int grade;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Course(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", grade=" + grade + "]";
	}

	@Override
	protected Course clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Course)super.clone();
	}
	
}
