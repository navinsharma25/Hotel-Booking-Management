package com.cg.hbm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hbm.entites.Payments;
import com.cg.hbm.service.IPaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	IPaymentService iService;
	
	@PostMapping
	public Payments addPayment(@RequestBody Payments payment) {
		return iService.addPayment(payment);
	}
	
	@GetMapping
	public List<Payments> showAllPayments() {
		return iService.showAllPayments();
	}
	
	
	
}
