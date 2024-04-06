public class EmployeeApp {
	public static void main(String[] args) {
		Employee emp = new Employee();
		try {
			emp.setId(0);
		} catch (InvalidIdException e) {
			System.out.println("Invalid ID Exception: " + e.getMessage());
		}

		try {
			emp.setFirstName("Ravi");
		} catch (InvalidNameException e) {
			System.out.println("Invalid Name Exception: " + e.getMessage());
		}

		try {
			emp.setLastName("Kumar");
		} catch (InvalidNameException e) {
			System.out.println("Invalid Name Exception: " + e.getMessage());
		}

		try {
			emp.setSalary(5000);
		} catch (InvalidSalaryException e) {
			System.out.println("Invalid Salary Exception: " + e.getMessage());
		}
		System.out.println("Continued and completed successfully");
	}
}