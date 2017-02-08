package design.pattern;

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
