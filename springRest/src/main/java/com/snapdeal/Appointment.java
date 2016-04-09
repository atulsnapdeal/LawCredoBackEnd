package com.snapdeal;

import javax.persistence.*;


@Entity
@Table(name = "appointment")
public class Appointment {
	
	   @Id
	    @GeneratedValue
	    private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "name")
	String name;
	
	@Column(name = "address")
	String address;
	
	  public Appointment() {
	    	
	    }
	    
	    public Appointment(String Name, String Address) {
	    	this.name = Name;
	    	this.address = Address;
	    }
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
