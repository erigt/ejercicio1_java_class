package dev.erika.ejercicio1_java_class;

public class Person {
	
	public String name;
	public String firstName;
	public String dni;
	public int bornYear;

	public Person (String name, String firstName, String dni, int bornYear) {
		this.name=name;
		this.firstName=firstName;
		this.dni=dni;
		this.bornYear=bornYear;
	}
	public void render(){
		System.out.println(name);
		System.out.println(firstName);
		System.out.println(dni);
		System.out.println(bornYear);
	}

}
