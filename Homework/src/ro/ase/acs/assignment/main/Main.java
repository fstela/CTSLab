package ro.ase.acs.assignment.main;

import ro.ase.acs.assignment.models.account.Account;
import ro.ase.acs.assignment.models.account.AccountType;
import ro.ase.acs.assignment.models.feeService.FeeService;
import ro.ase.acs.assignment.models.loan.LoanStrategy;

public class Main {

	public static void main(String[] args) {
		
		LoanStrategy loanStrategy = new LoanStrategy(101, 20000, 0.10);
		LoanStrategy loanStrategy2 = new LoanStrategy(365, 50000, 0.15);
		Account account = new Account(loanStrategy, AccountType.PREMIUM);
		Account account2 = new Account(loanStrategy2, AccountType.SUPER_PREMIUM);
		Account[] accounts = new Account[2];
		accounts[0] = account;
		accounts[1] = account2;
		double totalFee = FeeService.calculateTotalFee(accounts);
		System.out.println(totalFee);
	}

}
