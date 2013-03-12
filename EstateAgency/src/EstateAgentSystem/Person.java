package EstateAgentSystem;

import java.util.Date;

public abstract class Person {

	// Protected to encapsulate instance variables and 
	// limit visibility to package
	public int ID;
	public static int count = 0;
	
	protected Date Created;
	protected String FirstName;
	protected String Surname;
	protected Date DOB;
	
	protected String TelephoneNo;
	protected String MobleNo;
	
	
	// Constructor
	public Person() {
		ID = count;
		count++;
	}
	
	protected void setFullName(String FirstName, String Surname) {
		this.FirstName = FirstName;
		this.Surname = Surname;
	}
	
	protected void setContactDetails(String Telephone, String Mobile) {	
		this.TelephoneNo = Telephone;
		this.MobleNo = Mobile;
	}

	public void createAgent() {
		// TODO Auto-generated method stub
		
	}

	public void deleteAgent() {
		// TODO Auto-generated method stub
		
	}

	public void readAgent() {
		// TODO Auto-generated method stub
		
	}

	public void updateAgent() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
