package com.spring.springGITtest1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springGITtest1.model.SpringGITtest1DAO;

@Service
public class SpringGITtest1Service implements InterSpringGITtest1Service {

	@Autowired
	private SpringGITtest1DAO dao;
	
}//SERVICE END


