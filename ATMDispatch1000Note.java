package design.pattern;

/**
 * This class is responsible to dispatch the 1000note and call the other instance if the value entered
 * is less than the value entered.
 * @author abhkumar
 *
 */
public class ATMDispatch1000Note extends ATMAbstract {

	public void dispence(ATMCurrency cur) {
		if (cur.getAmount() >= 1000) {
			int noOf1000Notes = cur.getAmount() / 1000;
			int remainder = cur.getAmount() % 1000;
			System.out.println("Dispatching no of 1000 notes" + noOf1000Notes);
			if (remainder != 0) {
				this.atmabstract.dispence(new ATMCurrency(remainder));
			}
		} else {
			this.atmabstract.dispence(cur);
		}

	}

}
