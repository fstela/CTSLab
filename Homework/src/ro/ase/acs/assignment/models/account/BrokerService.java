package ro.ase.acs.assignment.models.account;

import ro.ase.acs.assignment.exceptions.InvalidPowerException;

public class BrokerService {

	static final double BROKER_FEE = 0.0125;

	public static double calculateTotalBrokerFee(Account[] accounts) {

		double totalFee = 0.0;

		for (Account account : accounts) {

			if (account.getAccountType() == AccountType.PREMIUM	|| account.getAccountType() == AccountType.SUPER_PREMIUM) {

				totalFee += BROKER_FEE * BrokerService.computeInterestRate(account.getLoanStrategy().getLoanValue(),
						account.getLoanStrategy().getRate(), account.getLoanStrategy().getDaysActive()); // interest-principal
			}
		}
		return totalFee;
	}

	public static double computeInterestRate(double loanValue, double rate, int daysActive) {

		if (rate <= 0) {
			throw new InvalidPowerException();
		}
		return loanValue * (Math.pow(rate, daysActive / 365) - 1);
	}
}
