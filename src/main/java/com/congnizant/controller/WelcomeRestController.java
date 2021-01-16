package com.congnizant.controller;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/cognizant")
public class WelcomeRestController {
  @GetMapping("/welcome")	  //binded to HTTP Get request with "/welcome" as the URI
  //@RequestMapping("/welcome")
  //@RequestMapping(path = "/welcome", method = RequestMethod.GET)	
  public String welcomeMsg(){
	  String msg = "Welcome to Cognizant";
	  return msg;
  }
}
