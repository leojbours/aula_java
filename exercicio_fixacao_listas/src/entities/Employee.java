package entities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	
	public Employee (int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void salaryIncrease(double percentage) {
		this.salary += salary * (percentage / 100);
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
