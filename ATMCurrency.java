package design.pattern;

public class ATMCurrency {

	private int value;
	
	public ATMCurrency(int value) {
		this.value = value;
	}
	
	public int getAmount(){
		return this.value;
	}
}
