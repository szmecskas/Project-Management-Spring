package com.jrp.pma.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jrp.pma.dao.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRepo;
	
	
}
