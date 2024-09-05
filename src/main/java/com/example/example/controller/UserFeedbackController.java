package com.example.example.controller;

import com.example.example.data.UserFeedback;
import com.example.example.service.UserFeedbackService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sanda
 */
@RestController
 @RequestMapping("/api")
public class UserFeedbackController {
    
    @Autowired
    UserFeedbackService userFeedbackService;
   
    
    @CrossOrigin
    @PostMapping(path = "/set-user-feedback")
    public UserFeedback setFeedback(@RequestBody UserFeedback userFeedback){
       return userFeedbackService.setFeedback(userFeedback);
    }
    
    @CrossOrigin
    @GetMapping(path = "/view-all-user-feedback")
    public List<UserFeedback> getAllFeedback(){
       return userFeedbackService.getAllFeedback();
    }
}
