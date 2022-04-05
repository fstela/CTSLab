package ro.ase.cts.assignment.models;

public class Account {
	public double loanValue, rate;
	public int daysActive;
	AccountType accountType;

	public double getLoan() {
		System.out.println("The loan value is " + this.loanValue);
		return this.loanValue;
	}

	public double getRate() {
		System.out.println("The rate is " + rate);
		return this.rate;
	}

	// must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return this.loanValue * this.rate;
	}

	public void setValue(double value) throws Exception {
		if (value < 0)
			throw new Exception();
		else {
			this.loanValue = value;
		}
	}

	@Override
	public String toString() {
		return "Loan: " + this.loanValue + "; rate: " + this.rate + "; days active:" + daysActive + "; Type: "
				+ accountType + ";";
	}

	public void print() {
		int vb = 10;
		System.out.println("This is an account");
	}

	public double calculateTotalFee(Account[] accounts, AccountType accountType) {
		double totalFee = 0.0;
		Account account;
		int temp = 365;
		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if (accountType == AccountType.PREMIUM || accountType == AccountType.SUPERPREMIUM)
				totalFee += .0125 * ( // 1.25% broker's fee
				account.loanValue * Math.pow(account.rate, (account.daysActive / 365)) - account.loanValue); // interest-principal
		}
		return totalFee;
	}

	public Account(double value, double rate, AccountType accountType) throws Exception {
		if (value < 0)
			throw new Exception();
		else {
			this.loanValue = value;
		}
		this.rate = rate;
		this.accountType = accountType;
	}

}
