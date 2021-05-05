package com.capgemini.repository;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.beans.Account;

public class AccountRepositoryImpl implements AccountRepository {
	
	Map<Integer,Account> accountMap;

	public AccountRepositoryImpl() {
		accountMap = new HashMap<Integer, Account>();
	}

	@Override
	public boolean saveAccount(Account account) {
		if (accountMap.containsKey(account.getAccountNumber())) {
			return false;
		}
		accountMap.put(account.getAccountNumber(), account);
		return true;
	}

	@Override
	public Account searchAccount(int accountNumber) {
		return accountMap.get(accountNumber);
	}

	@Override
	public boolean deleteAccount(Account account) {
		return accountMap.remove(account.getAccountNumber()) != null;
	}

}
