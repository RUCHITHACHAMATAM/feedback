package com.simplilearn.demo;

import java.util.List;





import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.demo.entity.Feedback;
import com.simplilearn.demo.service.FeedbackService;


@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {
	@Autowired
	private FeedbackService service;
	//create new record 
	@PostMapping("/")
	public ResponseEntity<Feedback> addFeedback(@RequestBody Feedback f){
		Feedback feedback=service.addFeedback(f);
			return new ResponseEntity<Feedback>(feedback, HttpStatus.CREATED);
	}
	//get all users
	@GetMapping("/")
	public List<Feedback> getAllFeedback(){
		return service.getAllFeedback();
	}
	//get user by id
	@GetMapping("/{id}")
	public ResponseEntity<Feedback>getUserById(@PathVariable int id){
		Feedback feedback =service.getFeedbackById(id);
		if(feedback!=null)
			return new ResponseEntity<Feedback>(feedback, HttpStatus.FOUND);
		else
			return new ResponseEntity<Feedback>(feedback,HttpStatus.NOT_FOUND);
			
	}
			
		
		

	}
	


