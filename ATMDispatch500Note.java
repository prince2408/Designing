package design.pattern;

public class ATMDispatch500Note extends ATMAbstract {

	
	public void dispence(ATMCurrency cur) {

		if (cur.getAmount() >= 500) {
			int numOf500Notes = cur.getAmount() / 500;
			System.out.println("Dispensing 500 notes : " + numOf500Notes);
			int remainder = cur.getAmount() % 500;
			if (remainder != 0) {
				this.atmabstract.dispence(new ATMCurrency(remainder));
			}
		}else {
				this.atmabstract.dispence(cur);
			}

		
	}

	

}
