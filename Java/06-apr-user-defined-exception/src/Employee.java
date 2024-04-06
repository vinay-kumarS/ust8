public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private double salary;

	public Employee() {}
	
	public Employee(int id, String firstName, String lastName, double salary)
			throws InvalidIdException, InvalidNameException, InvalidSalaryException {
		validateId(id);
		validateName(firstName);
		validateName(lastName);
		validateSalary(salary);

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	private void validateSalary(double salary) {
		if (salary < 10000) {
			throw new InvalidSalaryException("Salary must be at least 10000.");
		}
	}

	private void validateName(String firstName) {
		if (firstName.length() < 3 || !firstName.matches("[a-zA-Z]+")) {
			throw new InvalidNameException("Name must be at least 3 characters long and contain only letters.");
		}
	}

	private void validateId(int id) throws InvalidIdException {
		if (id <= 1) {
			throw new InvalidIdException("ID must be greater than 1.");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) throws InvalidIdException {
		validateId(id);
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		validateName(firstName);
		this.firstName = firstName;
	}

	public String getLastName() {
		validateName(firstName);
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		validateSalary(salary);
		this.salary = salary;
	}
	
	
}