package colegio;

public class Alumno {
	
	// Attributes
	
	private String name;
	private String lastName;
	private String dni;
	private int age;
	
	
	//Constructor
	
	public Alumno(String dni) {
		this.dni = dni;
	}
	
	public Alumno(String name, String lastName, String dni, int age) {
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
		this.age = age;
	}
	
	//Getters & Setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDni() {
		return dni;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Alumno [name=" + name + ", lastName=" + lastName + ", dni=" + dni + ", age=" + age + "]";
	}
	
	
	
	
}
