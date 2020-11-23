package Model.Bean;

public class Student {
private int ID;
private String UserName;
private String Address;
private boolean Gender;
public String getName() {
	return this.UserName;
}
public void setUserName(String username) {
	this.UserName = username;
}

public String getAddress() {
	return this.Address;
}
public void setAddress(String address) {
	this.Address = address;
}

public boolean isMale() {
	return this.Gender;
}
public void setGender(boolean gen) {
	this.Gender = gen;
}
}
