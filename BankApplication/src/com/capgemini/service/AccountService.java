package com.capgemini.service;

import com.capgemini.beans.Account;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.InsufficientOpeningBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;

public interface AccountService {
	Account createAccount(int accountNumber, double amount) throws InsufficientOpeningBalanceException;
	boolean deleteAccount(int accountNumber) throws InvalidAccountNumberException;
	double depositAmount(int accountNumber, double amount) throws InvalidAccountNumberException;
	double withdrawAmount(int accountNumber, double amount) throws InsufficientBalanceException, InvalidAccountNumberException;
	boolean fundTransfer(int senderAccount, int receiverAccount, double amount) throws InvalidAccountNumberException;
}
