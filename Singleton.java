package design.pattern;
/**
 * 1. instance variable and method are made static so that getInstance can be access without 
 * creating an instance and with the class name only e.g. Singleton.getInstance();
 * 2. construtors are private so that even user must not create an instance of it.
 * e.g Singleton object = new Singlton : not possible
 * @author abhkumar
 *
 */
public class Singleton {

	private static Singleton instance = new Singleton();
	private  Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return instance;
	}
}

/**
 * Synchronized method Vs block
 * One significant difference is synchronized block generally reduces the scope of lock.
 * A synchronization method uses the method receiver as a lock(i.e this for non-static methods 
 * and the enclosing class for static methods)
 */


/**
Implementing singleton with double check using synchronization
Double check is required in multithreading environment where singleton class breaks
its contract
**/

class SingletonDoubleCheck{
	/*
	 * without volatile a thread can see half initialized instance of singleton
	 */
	private static volatile SingletonDoubleCheck instance;
	
	private SingletonDoubleCheck(){
		
	}
	
	/**
	 * 1st version : not thread safe , multiple threads will create multiple instance;
	 */
	
	public static SingletonDoubleCheck getInstanceQT(){
		if(instance == null){
			instance = new SingletonDoubleCheck();
		}
		return instance;
	}
	
	/**
	 * 2nd version : completely thread safe and creates only one instance but 
	 * unnecessarily expensive due to the cost of synchronization at every call.
	 * seems like call to the synchronization method is about 50 times slow than the actual 
	 * method
	 * Syncronization block will get executed every time class will access this particular
	 * method.
	 * @return
	 */
	public static synchronized SingletonDoubleCheck getInstanceTS(){
		if(instance == null){
			instance = new SingletonDoubleCheck();
		}
		return instance;
	}
	
	/**
	 * 3rd Version : Minimize the cost of synchronization and improve performance by only
	 * locking the critical section of code, the one which creates instance of singleton 
	 * class.
	 * Here the synchronization block will get executed if and only if instance is null.
	 * @return
	 */
	public static SingletonDoubleCheck getInstance(){
		if(instance == null){								//Single checked
			synchronized (SingletonDoubleCheck.class) {
				if(instance == null){						// Double Checked
					instance = new SingletonDoubleCheck();
					
				}
				
			}
		}
		return instance;
	}
}
