package design.pattern;
/**
 * chain of Responsibility
 * @author abhkumar
 *
 */
public abstract class CORAbstractLogger {
	
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	public int level;
	
	// Contains the refernece of next element in chain.
	protected CORAbstractLogger nextLogger;
	
	//this will set the next logger that needs to be printed
	public void setNextLogger(CORAbstractLogger nextLogger){
		this.nextLogger = nextLogger;
	}
	
	public void logMessage(int level, String message){
		if(this.level <= level){
			getMesssage(message);
		}
		if(nextLogger != null){
			nextLogger.logMessage(level, message);
		}
		
	}
	
	protected abstract void getMesssage(String message);
	
}
