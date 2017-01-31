package design.pattern;

/**
 * FP says just define an interface or abstract class for creating an object but let the 
 * subclass decide which class to instantiate.
 * Also known as virtual constructor
 * 
 * FP main benefit is increased level of encapsulation while creating objects.
 * If you use factory to create objects we can replace original implementation of Products
 * or classes with more advanced and high performance implementation without any change on
 * client layer.
 * @author abhkumar
 *
 */
public class ImplementFactoryPattern {

	public FactoryInterface getInstance(String shape){
		
		if(shape == null){
			return null;
		}
		
		if(shape.equalsIgnoreCase("circle")){
			return new FactoryCircle();
		}
		else if (shape.equalsIgnoreCase("triangle")){
			return new FactoryTriangle();
		}
		else if(shape.equalsIgnoreCase("square")){
			return new FactorySquare();
		}
		return null;
	}
	
	public static void main(String []args){
		ImplementFactoryPattern obj = new ImplementFactoryPattern();
		FactoryInterface fac = obj.getInstance("triangle");
		fac.draw();
	}
}
