package com.itheima.crm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.crm.dao.CustomerDao;
import com.itheima.crm.domain.Customer;
import com.itheima.crm.service.CustomerService;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public void save(Customer customer) {
		customerDao.save(customer);
	}

}
