package ro.ase.cts.g1098.recap.java.main;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.g1098.recap.java.exceptions.IllegalTransferException;
import ro.ase.cts.g1098.recap.java.exceptions.InsufficientFundsException;
import ro.ase.cts.g1098.recap.java.models.AccountType;
import ro.ase.cts.g1098.recap.java.models.BankAccount;
import ro.ase.cts.g1098.recap.java.models.Banker;

public class Main {

	public static void main(String[] args) throws IllegalTransferException, InsufficientFundsException {
		// TODO Auto-generated method stub
		System.out.println("hello");
		List<BankAccount> accounts = new ArrayList<>();
		Banker abc = new Banker("ABC");
		BankAccount myDebit= abc.openAccount(AccountType.SAVINGS);
		BankAccount myCredit= abc.openAccount(AccountType.CURRENT);
		
		accounts.add(myCredit);
		accounts.add(myDebit);
		myCredit.transfer(myDebit, 1000);
				
	}

}
