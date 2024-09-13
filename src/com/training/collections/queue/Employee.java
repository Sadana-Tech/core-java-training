package com.training.collections.queue;

import java.util.Comparator;

class Employee {
	String name;
	Integer rating;
	Integer empId;

	public Employee(String name, Integer rating, Integer empId) {
		super();
		this.name = name;
		this.rating = rating;
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rating=" + rating + ", empId=" + empId + "]";
	}

}

class EmployeeComaprator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getRating() > o2.getRating()) {
			return 1;

		} else
			return -1;
	}

}