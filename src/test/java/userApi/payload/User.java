package userApi.payload;

public class User {
	int user_id;
	
	String plotNumber;
	String street;
	String state;
	String country;
   int zipCode;
    String user_first_name;
    String user_last_name;
   int user_contact_number;
    String user_email_id;
    
    public int getUser_id() {
		return user_id;
	}

	public String getPlotNumber() {
	 return plotNumber;
	}
	public void setPlotNumber(String plotNumber) {
		this.plotNumber = plotNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getUser_first_name() {
		return user_first_name;
	}
	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}
	public String getUser_last_name() {
		return user_last_name;
	}
	public void setUser_last_name(String user_last_name) {
		this.user_last_name = user_last_name;
	}
	public int getUser_contact_number() {
		return user_contact_number;
	}
	public void setUser_contact_number(int d) {
		this.user_contact_number = d;
	}
	public String getUser_email_id() {
		return user_email_id;
	}
	public void setUser_email_id(String user_email_id) {
		this.user_email_id = user_email_id;
	}
	}
