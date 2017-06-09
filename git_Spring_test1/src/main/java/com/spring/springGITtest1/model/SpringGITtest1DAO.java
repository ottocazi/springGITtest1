package com.spring.springGITtest1.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//DAO 선언
@Repository
public class SpringGITtest1DAO implements InterSpringGITtest1DAO {

	@Autowired
	private SqlSessionTemplate sqlsession;
	
	
}//DAO END
