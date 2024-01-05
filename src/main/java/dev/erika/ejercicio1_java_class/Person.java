package dev.erika.ejercicio1_java_class;

public class Person {
	
	public String name;
	public String firstName;
	public String dni;
	public int bornYear;
	// parte 2:
	public String countryBirth;
	public char gender;


	public Person (String name, String firstName, String dni, int bornYear, String countryBirth, char gender) {
		this.name=name;
		this.firstName=firstName;
		this.dni=dni;
		this.bornYear=bornYear;
		// parte 2:
		this.countryBirth=countryBirth;
		this.gender=gender;
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
 //parte 2:
 public String getcountryBirth(){
	return countryBirth;
 }
 public char getGender (){
	return gender;
 }


	public void printAll(){
		System.out.println(name);
		System.out.println(firstName);
		System.out.println(dni);
		System.out.println(bornYear);
		//parte 2:
		System.out.println(countryBirth);
		System.out.println(gender);
	}

}
