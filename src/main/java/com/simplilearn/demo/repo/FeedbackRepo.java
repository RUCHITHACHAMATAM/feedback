package com.simplilearn.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.simplilearn.demo.entity.Feedback;
@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer>{
}
