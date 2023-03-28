package com.ait.main.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Employee")
@Data
public class Employee {
   @jakarta.persistence.Id
   @GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	
   private String FirstName;
   private String LastName;
   public long getId() {
	return Id;
}
public void setId(long id) {
	Id = id;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
private String email;
@Override
public String toString() {
	return "Employee [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", email=" + email + "]";
}
}

