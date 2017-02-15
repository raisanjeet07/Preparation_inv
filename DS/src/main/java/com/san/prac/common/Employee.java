package com.san.prac.common;

public class Employee implements Comparable<Employee> {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int compareTo(Employee o) {
		return this.id - o.id;
	}

	@Override
	public String toString() {
		return id+"";
	}
}
