package org.dealstalker.com;

public class Customer {
    private String firstName = "";
    private String lastName = "";
    private String email = "";
    private int age = -1;
    private String password = "";
    
    
    private Boolean invalidData = false;
    private String errorText = "";

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
        if(email.indexOf("@") != -1)
        	this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
	

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "First Name: " + getFirstName() + "/n" + " Last Name:  " + getLastName() + "/n" +
        " Email:      " + getEmail() + "/n" + " Age:      " + getAge() ;
    }

}

