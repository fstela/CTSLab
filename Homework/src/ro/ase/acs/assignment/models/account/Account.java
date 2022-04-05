package ro.ase.acs.assignment.models.account;

import ro.ase.acs.assignment.models.loan.LoanStrategy;

public class Account {

	private AccountType accountType;
	private LoanStrategy loanStrategy;

	public AccountType getAccountType() {
		return accountType;
	}

	public void printAccount() {
		System.out.println("This is an account");
	}

	public LoanStrategy getLoanStrategy() {
		return this.loanStrategy;
	}

	public void setLoanStrategy(LoanStrategy loanStrategy) {
		if (loanStrategy != null)
			this.loanStrategy = loanStrategy;
	}

	public Account() {
	}

	public Account(AccountType accountType) {
		this.accountType = accountType;
	}

	public Account(LoanStrategy loanStrategy, AccountType accountType) {

		if (loanStrategy != null)
			this.loanStrategy = loanStrategy;
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Loan: " + this.loanStrategy.getLoanValue() + "; Type: " + this.accountType + ";";
	}
}
