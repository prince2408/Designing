package design.pattern;

import sun.jvm.hotspot.code.SingletonBlob;

public class ImplementSingleton {


public static void main(String []args){
	long freememory = Runtime.getRuntime().freeMemory();
	System.out.println(Singleton.getInstance().toString());
}
}
