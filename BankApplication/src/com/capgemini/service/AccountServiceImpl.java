package com.capgemini.service;

import com.capgemini.beans.Account;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.InsufficientOpeningBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.repository.AccountRepository;
import com.capgemini.repository.AccountRepositoryImpl;

public class AccountServiceImpl implements AccountService {
	
	AccountRepository ar;
	
	public AccountServiceImpl() {
		ar = new AccountRepositoryImpl();
	}

	@Override
	public Account createAccount(int accountNumber, double amount) 
			throws InsufficientOpeningBalanceException {
		
		if (amount < 500) {
			throw new InsufficientOpeningBalanceException("Starting balance must be >= $500");
		} else if (ar.searchAccount(accountNumber) != null) {
			return null;
		}
		
		Account newAccount = new Account(accountNumber, amount);
		ar.saveAccount(newAccount);
		return newAccount;
	}
	
	public boolean deleteAccount(int accountNumber) {
		Account ac = ar.searchAccount(accountNumber);
		return ac == null ? false : ar.deleteAccount(ac);
	}

	@Override
	public double depositAmount(int accountNumber, double amount) 
			throws InvalidAccountNumberException {
		
		Account ac = ar.searchAccount(accountNumber);
		if (ac == null) {
			throw new InvalidAccountNumberException("Invalid account number");
		}
		
		ac.setAmount(ac.getAmount() + amount);
		return ac.getAmount();
	}

	@Override
	public double withdrawAmount(int accountNumber, double amount) 
			throws InsufficientBalanceException, InvalidAccountNumberException {
		
		Account ac = ar.searchAccount(accountNumber);
		if (ac == null) {
			throw new InvalidAccountNumberException("Invalid account number");
		} else if (ac.getAmount() - 500 < amount) {
			throw new InsufficientBalanceException("Balance too low for withdrawal");
		}
		
		ac.setAmount(ac.getAmount() - amount);
		return ac.getAmount();
	}

	@Override
	public boolean fundTransfer(int senderAccount, int receiverAccount, double amount)
			throws InvalidAccountNumberException {
		
		Account acs = ar.searchAccount(senderAccount);
		Account acr = ar.searchAccount(receiverAccount);
		if (acs == null || acr == null) {
			throw new InvalidAccountNumberException("Invalid account number");
		} else if (acs.getAmount() - 500 < amount) {
			return false;
		}
		
		acs.setAmount(acs.getAmount() - amount);
		acr.setAmount(acr.getAmount() + amount);
		return true;
	}

}
