package ro.ase.acs.assignment.models.loan;

import ro.ase.acs.assignment.interfaces.LoanStrategyInterface;

public class LoanStrategy implements LoanStrategyInterface {

	private int daysActive;
	private double loanValue;
	private double rate;

	public int getDaysActive() {
		return daysActive;
	}
	
	public double getLoanValue() {
		return this.loanValue;
	}

	public double getRate() {
		return this.rate;
	}

	public LoanStrategy() {
	}

	public LoanStrategy(double loanValue, double rate) {
		this.loanValue = loanValue;
		this.rate = rate;
	}

	@Override
	public double getMonthlyRate() {
		return this.loanValue * this.rate;
	}

	@Override
	public String toString() {
		return "LoanStrategy [daysActive=" + daysActive + ", loanValue=" + loanValue + ", rate=" + rate + "]";
	}

}
