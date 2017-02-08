package design.pattern;

public class CORConsoleLogger extends CORAbstractLogger{

	public CORConsoleLogger(int level) {
		this.level = level;
	}
	@Override
	protected void getMesssage(String message) {
		System.out.println("Standard console : "+message);
		
	}
	

}
