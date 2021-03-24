package com.cg.hbm.dao;

import com.cg.hbm.entites.Transactions;

public interface ITransactionRepository {
	public Transactions addTransaction(Transactions transaction);
}
