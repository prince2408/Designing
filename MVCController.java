package design.pattern;
/**
 * Controller acts on both Model and view. It controls the data flow into model object
 * and updates the view whenever data changes. It keeps the view and model separate.
 * 1. Intermediary between model and view
 * 2. Updates the view when model changes.
 * 3. Updates the model when the user manipulates the view.
 * @author abhkumar
 *
 */
public class MVCController {

	MVCModel model;
	MVCView view;
	
	public MVCController(MVCModel model, MVCView view) {
		// TODO Auto-generated constructor stub
		this.view = view;
		this.model = model;
	}
	
	public String getName() {
		return model.getName();
	}
	public void setName(String name) {
		model.setName(name);
	}
	public int getId() {
		return model.getId();
	}
	public void setId(int id) {
		model.setId(id);
	}
	
	public void showDetails(){
		view.getDetails(model.getId(), model.getName());
	}
}
