package design.pattern;

public class ATMDispatch100Notes extends ATMAbstract {

	
	public void dispence(ATMCurrency cur) {
		if (cur.getAmount() >= 100) {
			int noOf100Notes = cur.getAmount() / 100;
			int remainder = cur.getAmount() % 100;
			System.out.println("no. of 100 notes dispatched :" + noOf100Notes);
			if (remainder != 0) {
				this.atmabstract.dispence(new ATMCurrency(remainder));
			} 
		}else {
				this.atmabstract.dispence(cur);
			}
		
	}

}
