package API;

public class Person {
	private String firstname;
	private String lastname;
	private String phonenumber;
	private String email;
	private Address[] addresses;
	private String about;
	private int birthYear;
	
	 
	
	public Person(String firstname, String lastname, String phonenumber, String email,  Address[] addresses, String about, int birthYear) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
		this.email = email;
		this.addresses = addresses;
		this.about = about;
		this.birthYear = birthYear;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getPhonenumber() {
		return phonenumber;
	}



	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Address[] getAddresses() {
		return addresses;
	}



	public void setAddresses(Address[] addresses) {
		this.addresses = addresses;
	}



	public String getAbout() {
		return about;
	}



	public void setAbout(String about) {
		this.about = about;
	}



	public int getBirthYear() {
		return birthYear;
	}



	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	

	
}