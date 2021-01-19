package exercise8;

public class DepartmentApp {
	public static void main(String[] args) {
		Department myDepartment = new Department();
		
		Person person1 = new Person("aaaa");
		Person person2 = new Person("bbbb");
		Person person3 = new Person("cccc");
		
		myDepartment.setPersons(person1, person2, person3);
		
	}

}
