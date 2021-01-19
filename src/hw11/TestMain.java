package hw11;

public class TestMain {
	public static void main(String[] args) {

		Employee employees[] = new Employee[10];

		Secretary sec1 = new Secretary("Jonah", (Math.random() * 7000), "Headquarters");
		Secretary sec2 = new Secretary("Michael", (Math.random() * 7000), "TLV office");
		Manager man1 = new Manager("Sarah", (Math.random() * 15000), "Important Stuff");
		Manager man2 = new Manager("Rachel", (Math.random() * 15000), "Making Money");
		Employee emp1 = new Employee("Able", (Math.random() * 6500));
		Employee emp2 = new Employee("Body", (Math.random() * 6500));
		Employee emp3 = new Employee("Worker", (Math.random() * 6500));
		Engineer engi1 = new Engineer("Dell", (Math.random() * 18000), "Computers");
		Engineer engi2 = new Engineer("Hopp", (Math.random() * 18000), "Complicated Stuff");
		Director boss = new Director("Big", (Math.random() * 50000), "Making Money", "Money Corp");

		employees[0] = boss;
		employees[1] = man1;
		employees[2] = man2;
		employees[3] = engi1;
		employees[4] = engi2;
		employees[5] = sec1;
		employees[6] = sec2;
		employees[7] = emp1;
		employees[8] = emp2;
		employees[9] = emp3;

		printDetails(employees);

		double averageSalary = averageSalary(employees);
		double averageManagerSalary = averageManagerSalary(employees);

		System.out.println("average salarey = " + averageSalary);
		System.out.println("average Manager salarey = " + averageManagerSalary);

	}

	public static double averageSalary(Employee[] employees) {
		double sum = 0;
		for (int i = 0; i < employees.length; i++) {
			sum += employees[i].getSalary();
		}
		double average = sum / employees.length;

		return average;

	}

	public static void printDetails(Employee[] employees) {
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].toString());
		}
	}

	public static double averageManagerSalary(Employee[] employees) {
		double sum = 0;
		int counter = 0
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] instanceof Manager) {
				counter ++;
				sum += employees[i].getSalary();
			}
		}
		double average = sum / counter;

		return average;

	}

}
