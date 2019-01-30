package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="PersonDetails")
@NamedQueries({@NamedQuery(name="getById",
query="SELECT per FROM Person per WHERE per.id=121"),@NamedQuery(name="getAll",query="SELECT per from Person per")})
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="pName")
	private String name;
	private String address;
	
	
	
	public Person()
	{
		
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address
				+ "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
}
