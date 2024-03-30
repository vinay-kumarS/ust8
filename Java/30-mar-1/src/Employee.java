
public class Employee {
	private Integer associateId;
	private String firstName;
	private String lastName;
	private String department;
	private Double salary;
	
	public Employee() {}

	public Employee(Integer associateId, String firstName, String lastName, String department, Double salary) {
		super();
		this.associateId = associateId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.salary = salary;
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

	@Display
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Deprecated
	public Double getSalary() {
		return salary;
	}

	@Deprecated
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [associateId=" + associateId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", department=" + department + ", salary=" + salary + "]";
	}
	
	
}
