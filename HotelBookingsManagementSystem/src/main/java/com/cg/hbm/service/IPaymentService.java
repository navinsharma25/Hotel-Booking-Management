package com.cg.hbm.service;

import java.util.List;

import com.cg.hbm.entites.Payments;

public interface IPaymentService {
	public Payments addPayment(Payments payment);
	public List<Payments> showAllPayments();
}
