package com.spring.springGITtest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.spring.springGITtest1.service.SpringGITtest1Service;

@Controller
@Component
public class SpringGITtest1Controller {

	 @Autowired
	 private SpringGITtest1Service service;
	 
	
	
	
}//Controller END
