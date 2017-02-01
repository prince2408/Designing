package design.pattern;
/**
 * it is used to separate application concerns.
 * 1. Modularity of componenets allows core logic developers and UI developers to work
 * simultaneously without affecting each other.
 * @author abhkumar
 * 
 * View and model interact only with the controller and NEVER with each other.
 * 
 *
 */
public class MVCImplementation {

	public static void main(String []args){
		MVCModel model = new MVCModel();
		model.setId(24);
		model.setName("abhishek");
		
		MVCView view = new MVCView();
		
		MVCController controller = new MVCController(model , view);
		controller.setId(213);
		controller.setName("abhishek");
		controller.showDetails();
	}
}
