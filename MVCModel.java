package design.pattern;
/**
 * Model represent an object or java pojo carrying data. It can also have logic to update
 * controller if its data changes.
 * 1. Manages the app data and state.
 * 2. Not concerned with UI or presentation
 * 3. Same model should be resuable ,unchangeable in different interfaces
 * @author abhkumar
 *
 */
public class MVCModel {

	String name;
	int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
