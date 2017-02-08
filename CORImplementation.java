package design.pattern;
/**
 * As the name suggests, the chain of responsibility pattern creates a chain of receiver objects for a request. 
 * This pattern decouples sender and receiver of a request based on type of request.
 *  This pattern comes under behavioral patterns.
 *
 *	In this pattern, normally each receiver contains reference to another receiver. 
 * If one object cannot handle the request then it passes the same to the next receiver and so on
 * 
 * Chain of responsibility pattern is used to achieve loose coupling in software design where a request from client is 
 * passed to a chain of objects to process them. Then the object in the chain will decide themselves who will 
 * be processing the request and whether the request is required to be sent to the next object in the chain or not.
 * 
 * E.g. includes logger and try-catch block
 * 
 * @author abhkumar
 *
 */
public class CORImplementation {

	public static void main(String []args){
		CORAbstractLogger getchain = getChainofLoggers();
		getchain.logMessage(CORAbstractLogger.INFO, "This is caught in Info");
		
		getchain.logMessage(CORAbstractLogger.DEBUG, "This is caught in debug");
		
		getchain.logMessage(CORAbstractLogger.ERROR, "This is caught in error");
	}
	
	/**
	 * This method is used to chain the objects so that during the call all the child objects get called.
	 * It creates different types of loggers. Assign them error level and set next logger in each logger. Next logger in each logger represent the part
	 * of the chain.
	 * @return
	 */
	public static CORAbstractLogger getChainofLoggers(){
		CORAbstractLogger errorLogger = new CORErrorLogger(CORAbstractLogger.ERROR);
		CORAbstractLogger consoleLogger = new CORConsoleLogger(CORAbstractLogger.INFO);
		CORAbstractLogger fileLogger = new CORFileLogger(CORAbstractLogger.DEBUG);
		
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
		
	}
}
