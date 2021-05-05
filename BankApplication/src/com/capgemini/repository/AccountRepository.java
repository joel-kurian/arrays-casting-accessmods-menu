package com.capgemini.repository;

import com.capgemini.beans.Account;

public interface AccountRepository {
	boolean saveAccount(Account account);
	boolean deleteAccount(Account account);
	Account searchAccount(int accountNumber);
}
