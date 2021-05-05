package client;

import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.InsufficientOpeningBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.service.AccountService;
import com.capgemini.service.AccountServiceImpl;

public class Test {

	public static void main(String[] args) {
		AccountService as = new AccountServiceImpl();
		try {
			System.out.println(as.createAccount(1, 500));
			System.out.println(as.createAccount(2, 500));
			System.out.println(as.depositAmount(1, 500));
			System.out.println(as.withdrawAmount(1, 100));
			System.out.println(as.fundTransfer(1, 2, 200));
			System.out.println(as.withdrawAmount(1, 1000));
		} catch (InsufficientOpeningBalanceException e) {
			System.out.println(e.getMessage());
		} catch (InvalidAccountNumberException e) {
			System.out.println(e.getMessage());
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}
