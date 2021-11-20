package com.user.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usercreditscore")
public class UserCreditScore
{

	@Id
	long id;
	long creditscore;
	

	public UserCreditScore()
	{
		super();
	}

	public long getId()
	{
		return id;
	}

	public long getCreditscore()
	{
		return creditscore;
	}

	public void setCreditscore(long creditscore)
	{
		this.creditscore = creditscore;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public UserCreditScore(int id, int creditscore)
	{
		super();
		this.id = id;
		this.creditscore = creditscore;
		}

	


	

}
