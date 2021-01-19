package exercise6;

public class Person {
	private String name;
	private int age;
	private String address;
	
	public void walk() {
		System.out.println(name + "walks");
	
	}
	public void eat() {
	System.out.println(name + "talks");
	}
	
	public void eat (String foodName) {
		System.out.println(name + "was eating" + foodName);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
