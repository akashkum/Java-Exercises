package com.cg.tms.dtos;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

 @Entity
 @Table(name="TRAINEE")
public class Trainee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String location;
	private String domain;
	
	
public Trainee() {
		super();
	}
public Trainee(int id, String name, String location, String domain) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.domain = domain;
	}
@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", location="
				+ location + ", domain=" + domain + "]";
	}

@Id
@Column(name="ID")
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="LOCATION")
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Column(name="DOMAIN")
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	
	
	
	

}
