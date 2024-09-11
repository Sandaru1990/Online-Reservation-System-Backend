/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.example.service;

import com.example.example.data.UserFeedback;
import com.example.example.data.UserFeedbackRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author sanda
 */
@Service
public class UserFeedbackService {
    
    @Autowired
    UserFeedbackRepository userFeedbackRepository;
   
    public UserFeedback setFeedback(UserFeedback userFeedback){
       return userFeedbackRepository.save(userFeedback);
    }
    
    public List<UserFeedback> getAllFeedback(){
       return userFeedbackRepository.findAll();
    }
    
    public void deleteFeedbackById(int feedbackId) {
        userFeedbackRepository.deleteById(feedbackId);
    }
}

