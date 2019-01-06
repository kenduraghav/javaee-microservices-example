package examples.customers.lib.v1;

import java.util.Date;

import examples.customers.lib.v1.common.BaseType;

public class Customer extends BaseType{

	private String firstName;
	private String lastName;
	private String email;
	private Date dateofBirth;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	
	
}
