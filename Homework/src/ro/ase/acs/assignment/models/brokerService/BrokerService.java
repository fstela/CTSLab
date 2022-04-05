package ro.ase.acs.assignment.models.brokerService;

import ro.ase.acs.assignment.exceptions.InvalidPowerException;
import ro.ase.acs.assignment.models.account.Account;
import ro.ase.acs.assignment.models.account.AccountType;

public class BrokerService {

	static final double BROKER_FEE = 0.0125;

	public static double calculateTotalBrokerFee(Account[] accounts) {

		double totalFee = 0.0;

		for (Account account : accounts) {

			if (account.getAccountType() == AccountType.PREMIUM	|| account.getAccountType() == AccountType.SUPER_PREMIUM) {

				totalFee += BROKER_FEE * BrokerService.computeInterestPrincipal(account.getLoanStrategy().getLoanValue(),
						account.getLoanStrategy().getRate(), account.getLoanStrategy().getDaysActive()); // interest-principal
			}
		}
		return totalFee;
	}

	public static double computeInterestPrincipal(double loanValue, double rate, int daysActive) {

		if (rate <= 0) {
			throw new InvalidPowerException();
		}
		return loanValue * (Math.pow(rate, daysActive / 365) - 1);
	}
}
