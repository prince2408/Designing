package design.pattern;

/**
 * This is an abstract class for ATM Design pattern which has been inherited by all the base classes
 * and the dispence method will be over-ridden by all the child classes.
 * setNextDispence will be used to create the chaining of the object
 * @author abhkumar
 *
 */
public abstract class ATMAbstract {

	public ATMAbstract atmabstract;
	
	public void setNextDispence(ATMAbstract nextChain) {
		this.atmabstract = nextChain;
	}
	
	public abstract void dispence(ATMCurrency cur);
	
}
