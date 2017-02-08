package design.pattern;

public class CORErrorLogger extends CORAbstractLogger {

	public CORErrorLogger(int level) {
		this.level = level;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void getMesssage(String message) {
		System.out.println("Error console : "+message);
	}
}
