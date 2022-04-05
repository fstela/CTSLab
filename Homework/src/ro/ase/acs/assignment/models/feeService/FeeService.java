package ro.ase.acs.assignment.models.feeService;

import ro.ase.acs.assignment.exceptions.InvalidRateException;
import ro.ase.acs.assignment.models.account.Account;
import ro.ase.acs.assignment.models.account.AccountType;

public class FeeService {

	static final double BROKER_FEE = 0.0125;

	//compute the total fee
	public static double calculateTotalFee(Account[] accounts) {

		double totalFee = 0.0;

		for (Account account : accounts) {

			if (account.getAccountType() == AccountType.PREMIUM	|| account.getAccountType() == AccountType.SUPER_PREMIUM) {

				totalFee += BROKER_FEE * FeeService.computeInterestPrincipal(account.getLoanStrategy().getLoanValue(),
						account.getLoanStrategy().getRate(), account.getLoanStrategy().getDaysActive()); // interest-principal
			}
		}
		return totalFee;
	}

	//compute the interest principal for each account
	public static double computeInterestPrincipal(double loanValue, double rate, int daysActive) {

		if (rate <= 0) {
			throw new InvalidRateException();
		}
		return loanValue * (Math.pow(rate, daysActive / 365) - 1);
	}
}
