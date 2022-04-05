package ro.ase.acs.assignment.models.loan;

import ro.ase.acs.assignment.exceptions.InvalidRateException;
import ro.ase.acs.assignment.interfaces.LoanStrategyInterface;

public class LoanStrategy implements LoanStrategyInterface {

	private int daysActive;
	private double loanValue;
	private double rate;

	public void setLoanValue(double loanValue) {
		if(loanValue<=0) {
			throw new InvalidRateException();
		}
	}
	
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


	public LoanStrategy(int daysActive, double loanValue, double rate) {
		super();
		this.daysActive = daysActive;
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
