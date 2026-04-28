package jp.co.aforce.sample;

public class Employee {
	//	int ID;
	//	String name;
	//	int salary;
	//
	//	void raiseSalary(double percent) {
	//		double Salary = (double) salary;
	//		Salary = Salary * percent;
	//		System.out.println(Salary);
	//	}
	//
	//	public static void main(String[] args) {
	//		Employee employee1 = new Employee();
	//		employee1.ID = 314;
	//		employee1.name = "Taro";
	//		employee1.salary = 2000000;
	//		
	//		employee1.raiseSalary(0.5);
	//	}

	int employeeId;
	String name;

	Employee(int employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		return this.employeeId == other.employeeId;
	}
}
