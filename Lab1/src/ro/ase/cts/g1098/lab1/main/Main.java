package ro.ase.cts.g1098.lab1.main;

import ro.ase.cts.g1098.lab1.main.exceptions.InsufficientFundsException;
import ro.ase.cts.g1098.lab1.main.interfaces.Profitable;

public class Main {

	public static void main(String[] args) {

		System.out.println("hellooo");
		//sout in intellij
		
		Profitable reference;
		
		try {
			throw new InsufficientFundsException("You need a top-up");
			
		}
		catch(InsufficientFundsException ex) {
			System.out.println(ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println("we have another issue");
		}
		finally {
			System.out.println("exception example");
		}
		
	}

}
