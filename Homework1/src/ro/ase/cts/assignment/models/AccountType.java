package ro.ase.cts.assignment.models;

public enum AccountType {
	STANDARD(1), BUDGET(2), PREMIUM(3), SUPERPREMIUM(4);
	int id;

	private AccountType(int id) {
		this.id = id;
	}
	
}
