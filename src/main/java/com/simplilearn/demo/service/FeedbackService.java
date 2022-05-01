package com.simplilearn.demo.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.demo.entity.Feedback;
import com.simplilearn.demo.repo.FeedbackRepo;

@Service
public class FeedbackService {
	
	@Autowired
	private FeedbackRepo repo;
	
	//add user method
	public Feedback addUser(Feedback f) {
		return repo.save(f);
	}
	
	// List user method
	public List<Feedback> getAllFeedback(){
		return repo.findAll();
	}
	
	
	//get user by ID
	public Feedback getFeedbackById(int id) {
		
		if(repo.findById(id).isPresent())
			return repo.findById(id).get();
		else
			return null;
		
	}

	public Feedback addFeedback(Feedback f) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
		
	

	
	
	
	


}