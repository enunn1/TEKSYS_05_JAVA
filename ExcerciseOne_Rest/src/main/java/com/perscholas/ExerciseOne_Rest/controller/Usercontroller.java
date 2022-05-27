package com.perscholas.ExerciseOne_Rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.perscholas.ExerciseOne_Rest.model.User;

@Controller
public class Usercontroller {

   @PostMapping("/users")
   public void printData(@RequestBody User user) {
       System.out.println("Printing the user data:"+user);
   }
}
