package design.pattern;

import sun.jvm.hotspot.code.SingletonBlob;
/**
 * Example of singleton is Runtime class which provides the 
 * getRuntime method with a singleton scope.
 * @author abhkumar
 *
 */
public class ImplementSingleton {


public static void main(String []args){
	long freememory = Runtime.getRuntime().freeMemory();
	System.out.println(Singleton.getInstance().toString());
}
}
