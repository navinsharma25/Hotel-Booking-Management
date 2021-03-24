package com.cg.hbm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hbm.dao.IPaymentRepository;
import com.cg.hbm.entites.Payments;

@Service
@Transactional
public class IPaymentServiceImpl implements IPaymentService {
	@Autowired
	IPaymentRepository repository;
	@Override
	public Payments addPayment(Payments payment) {
		// TODO Auto-generated method stub
		repository.save(payment);
		
		return payment;
	}
	@Override
	public List<Payments> showAllPayments() {
		
		return repository.findAll();
	}

	
}