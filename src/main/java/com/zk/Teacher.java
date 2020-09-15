package com.zk;

public class Teacher {
	String name;
	public Teacher(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Teacher teacher = new Teacher("ÍõÎå");
		System.out.println(teacher);
	}
	public String toString() {
		return name;
	}
}
