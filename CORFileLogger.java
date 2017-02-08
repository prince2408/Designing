package design.pattern;

public class CORFileLogger extends CORAbstractLogger{

	public CORFileLogger(int level){
		this.level = level;
	}

	@Override
	protected void getMesssage(String message) {
		System.out.println("File console : "+message);
		
	}
}
