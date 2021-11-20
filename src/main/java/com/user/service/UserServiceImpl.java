package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.user.model.User;
import com.user.model.UserCreditScore;

import com.user.repository.UserCreditScoreRepository;
import com.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServcie
{

	@Autowired
	UserRepository userRepository;

	
	@Autowired
	UserCreditScoreRepository userCreditScoreRepository;

	
	
	@Override
	@Transactional
	public String insert(User user)
	{
		User saveduser = userRepository.save(user); // Call to the Repository

		Optional<UserCreditScore> userCreditScore = userCreditScoreRepository.findById(saveduser.getId());
		

		if(userCreditScore.get().getCreditscore() < 750)
		{
			
	        throw new RuntimeException();
			//return "user application eligibile for loan with ref id  : "+ saveduser.getId();
		}
		
		
		return "unable to process application due to user creditscore with ref id: " + saveduser.getId();
		
		
	}

}
