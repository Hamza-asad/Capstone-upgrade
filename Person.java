
public class Person {
	
	//initialize the peoples details such as name, surname, etc...
	String name;
	String surname;
	String num;
	String email;
	String address;
	
	//create a method to store all the peoples details and check for which are strings 
	public Person(String name, String surname, String num, String email, String address) {

		this.name = name;
		this.surname = surname;
		this.num = num;
		this.email = email;
		this.address = address;
	}
	

	public Person() {
		// TODO Auto-generated constructor stub
	}

	//Use the getName function to call the names and return it
	public String getName() {
		return name;
	}

	//create a toString method
	public String toString() {
	
	String output = "Name: " + name;
	output += "\nSurname: " + surname;
	output += "\nNumber: " + num;
	output += "\nEmail: " + email;
	output += "\nAddress: " + address;
	
	//return the output to print it
	return output;
		
}
}
