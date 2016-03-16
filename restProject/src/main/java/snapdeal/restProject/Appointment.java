package snapdeal.restProject;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Appointment {
	
	String name;
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
