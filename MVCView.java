package design.pattern;
/**
 * View represents the visulalization of data that model contains.
 * @author abhkumar
 * 1. Present the model to the user in an appropriate interface
 * 2. Allow user to manipulate data
 * 3. Does not store any data except to cache state.
 * 4. Easily reusable & configurable to display different data.
 *
 */
public class MVCView {

	String name ;
	int id;
	
	public void getDetails(int id, String name){
		System.out.println("name : "+name+" id: "+id);
	}
}
