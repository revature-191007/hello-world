package samples.methods;

/**
 * Methods represent the behavior part of Java classes.
 * A method is a function that is owned or belongs to a class.
 * Functions have a few key parts:
 *  * A signature - defines the type of function and the parameters
 *  * Function body - Which defines the behavior when invoked
 *  
 *  
 *  |         method signature           |
 *  public static void main(String[] args) {
 *  	// function body, between curly brackets
 *  }
 *  
 *  Return Types - All methods except constructor methods require a 
 *  defined return type. This can be easily identified because it will
 *  be the part of the signature with a data type or 'void' if there is
 *  no return value.
 *  
 *  Arguments (or parameter) list - represents input requirements to
 *  the function. These values can be passed when the function is invoked
 *  and can be referenced by the name provided in the parameter list within
 *  the body of the function. Note: Java is a pass by value language, 
 *  for objects the value is the reference. 
 */
public class MethodSample {

	static void simpleMethod() {
		System.out.println("Simple method running!");
	}
	
	static int getTwo() {
		return 2;
	}
	
	static int sum(int a, int b) {
		return a + b;
	}
	
	// varargs - variable arguments, allowing any number of arguments of
	// a given type to be passed
	// varargs - must be the last item in the parameter list
		// Okay: void sum(double a, double b, int... i) {}
		// not okay: void sum(int... i, double a, double b) {}
	// Consequently, cannot have more than one varargs
		// not okay: void sum(double... d, int... i) {}
	static int sum(int... values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	static int intModifier(int i) {
		i = i + 10;
		return i;
	}
	
	static MyClass modMyClass(MyClass myClass) {
		myClass.x += 10;
		return myClass;
	}
	
	static Integer modInteger(Integer a) {
		a = a + 10;
		return a;
	}
	
	/*
	 * The wrapper types can't be mutated. Because of this, we can only
	 * reassign, which is a change in the value of the object. Meaning the
	 * original object will still be the same.
	 */
	static void wrapperTest() {
		int a = 1;
		Integer b = 2;
		Integer c = modInteger(b);
		System.out.printf("b: %d, c: %d %n", b, c);
	}
	
	public static void main(String[] args) {
		simpleMethod();
		int myInt = getTwo();
		System.out.println(myInt);
		System.out.println(sum(5, 10));
		System.out.println(sum(1, 2, 3, 4));
		int a = 15;
		int b = intModifier(a);
		System.out.printf("a: %d b: %d %n", a, b);
		
		MyClass c = new MyClass();
		c.x = 15;
		MyClass d = modMyClass(c);
		System.out.printf("c: %d d: %d %n", c.x, d.x);
		
		// == - for primitives compares value
		// == - for objects, compares reference value
		System.out.println(c == d); // true - same object in memory
		MyClass e = new MyClass();
		e.x = 25;
		System.out.println(c == e); // false - different objects
//		System.out.println(c === e); no triple equals in java
		
		wrapperTest();
	}
	

	
}

class MyClass {
	public int x;
}




