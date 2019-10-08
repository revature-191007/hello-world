package scopes;

/**
 * What is scope?
 * 
 * Where a variable is the area within code in which some variable
 * is referenceable and defined.
 *
 * Scope is a function of where and how a variable is defined.
 * Java has a number of scopes:
 * 
 * 1. Method scope - Variables scoped to an entire function body.
 * 					These are defined as method parameters.
 * 2. Block scope - Variables scoped within a block from the point
 * 	  (local scope) where they are defined. These are variables
 * 					declared anywhere within a method body.
 * 3. Object scope - Object scoped variables are referenceable through
 * 					an object, or directly in a non-static method of
 * 					the object class implicitly, or explicitly using 'this'.
 * 4. Static scope - Static scoped variables are scoped to the class itself
 * 					(as opposed to an object, or instance of it). These
 * 					variables are accessible anywhere in the class,
 * 					and through the classname outside of it.
 * 
 * 		What is static?
 * 	Static associates a value, method, or class with the encompassing
 * class, rather than instances of that class. Meaning that they can be
 * referenced without any instance present, are shared amongst instances when
 * instances are in context, and static methods have no context of 'this'
 * because static methods aren't called on instances.
 */
public class ScopeSample {
	
	// c is declared in object scope
	int c = 20;
	static int d = 30;
	
	// shadowing c - the method scoped c shadows the object scope
	ScopeSample(int c) {
		this.c = c;
	}
	
	public static void main(String[] args) {
		ScopeSample sample = new ScopeSample(1);
		System.out.println(sample.c); // valid, reference through object
									// in static method
//		System.out.println(c); // invalid, can't reference directly in 
								// static
		System.out.println(d);
	}
	
	// x is in method scope. It is only valid within this method.
	public void someMethod(int x) {

		{
			System.out.println(this.c);
			System.out.println(d);
			// local/block scope
			int a = 20;
			int b = a; // valid, a is defined and still in scope
		}
//		int b = a; invalid because 'a's scope ended with the block
	}
	
	public void otherMethod() {
//		int y = x; // invalid - x is not valid outside of the method its
				   // defined upon
	}
	
}
