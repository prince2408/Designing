package design.pattern;

import java.util.Scanner;

public class ATMImplementation {

	private ATMAbstract d1000notes;

	/**
	 * creates the chain of all the instance.
	 */
	public ATMImplementation() {
		this.d1000notes = new ATMDispatch1000Note();
		ATMAbstract d500notes = new ATMDispatch500Note();
		ATMAbstract d100notes = new ATMDispatch100Notes();

		d1000notes.setNextDispence(d500notes);
		d500notes.setNextDispence(d100notes);

	}

	public static void main(String[] args) {
		ATMImplementation impl = new ATMImplementation();
		int amount =0;
		while(true){
		System.out.println("Enter the amount you want to dispence");
		Scanner sc = new Scanner(System.in);
		amount = sc.nextInt();
		if (amount % 100 != 0) {
			System.out.println("Enter valid amount");
			return;
		}
		impl.d1000notes.dispence(new ATMCurrency(amount));
	}
	}
}
