package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.user.model.UserCreditScore;

@Repository
public interface UserCreditScoreRepository extends JpaRepository<UserCreditScore, Long>
{
	
	

}
