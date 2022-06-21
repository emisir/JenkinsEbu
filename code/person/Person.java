package fh.aalen.person;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	private String id;
	private String surename;
	private String birthdate;
	
	public Person(){
		
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	
	public void setSurname(String surename) {
		this.surename = surename;
	}
	
	public String getSurname() {
		return surename;
	}
	
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	public String getBirthdate() {
		return birthdate;
	}
	
	

}
