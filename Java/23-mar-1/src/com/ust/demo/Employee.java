package com.ust.demo;

public class Employee {
	private Integer associateId;
	private String firstName;
	private String lastName;
	private String departmentName;
	
	public Employee() {}

	public Employee(Integer associateId, String firstName, String lastName, String departmentName) {
		super();
		this.associateId = associateId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentName = departmentName;
	}

	public Integer getAssociateId() {
		return associateId;
	}

	public void setAssociateId(Integer associateId) {
		this.associateId = associateId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Employee [associateId=" + associateId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", departmentName=" + departmentName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Employee arg=(Employee) obj;
		return this.getAssociateId().equals(arg.getAssociateId());
	}
	
}
