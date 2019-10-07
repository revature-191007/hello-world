package samples.classes;

/**
 * What is a class? 
 * 	Serves as a schematic for an object. Encapsulation of some kind of
 * 'thing', which could be a real thing, or some kind of business thing,
 * or something purely intangible. We can think of a class as a combination
 * of 'state' and 'behavior'.  Practically, state is represent by properties
 * (variables associated with a class) and behavior is represented by
 * methods (functions associated with a class). Together these are called
 * 'members'.
 * 
 * What is an object?
 * 	Instance of a class. Objects are things that can be represented. Generally
 * where a Cat might be a class, Socks (the cat) would be an instance of
 * that class and an object. 
 *
 * What is a constructor?
 * 	A function that is used to create instances of a class.
 * Requirements for a function to qualify as a constructor:
 * 		* Exactly the same name as the class.
 * 		* No return type at all (not even void)
 * 		* The first line of any contructor must be either:
 * 			super(...);
 * 			this(...);
 * 			or else super() will implicitly be called at the first line.
 */
public class SampleClass {
	
	public static void main(String[] args) {
		// Data type is first, in this case we will declare a variable
		// with the type: SampleClass
		// Secondly, the variable name, which is the identifier we will use
		// to reference it.
		// 'new' - keyword used to run constructors to create instances
		// of a class.
		// Classname with method parenthesis - in this case, any constructor
		// parameters can be provided
		System.out.println("First");
		SampleClass sampleClass = new SampleClass();
		System.out.println("Last");
	}
	
	SampleClass() {
		System.out.println("Hello");
	}
	
}
