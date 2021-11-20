package com.user.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User
{

	@Id
	long id;
	String firstName;
	String lastName;
	String emaild;
	

	public User()
	{
		super();
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public User(int id, String firstName, String lastName, String emaild)
	{
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emaild = emaild;
	}

	

	public String getEmaild()
	{
		return emaild;
	}

	public void setEmaild(String emaild)
	{
		this.emaild = emaild;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	

}
