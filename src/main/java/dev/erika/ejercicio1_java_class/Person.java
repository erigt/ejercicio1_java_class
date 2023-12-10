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

	//Getters & Setters//
	public String getName(){
		return name;
	}
	public String getfirstName(){
		return firstName;
	}
	public String getDni(){
		return dni;
	}
	public int getbornYear(){
		return bornYear;
	}


	public void printAll(){
		System.out.println(name);
		System.out.println(firstName);
		System.out.println(dni);
		System.out.println(bornYear);
	}

}
