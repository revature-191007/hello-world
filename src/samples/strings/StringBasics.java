package samples.strings;

/*
 * Strings represent an array of characters.
 * String is a class in Java, and strings themselves are objects.
 * String is an example of an 'immutable' class.
 * 
 * Immutable - Cannot be changed.
 * Immutable - cannot be mutated - mutation means changing the state of
 *  			an object.
 *  changing the state - changing the property values of the object.
 *  
 * Strings are some of the mostly commonly used types in programming. They
 * can also be somewhat expensive to work with. It's also very very frequent
 * to use the same string throughout the execution of a program.
 * 
 * String Pool - A dedicated location in heap memory where strings are stored.
 * Not every string must be in the pool, but those referenced by string literals
 * or any expression that can be optimized to a string literal by the compiler
 * in the pool. The literals, (etc) will always reference the exact same string
 * in memory, which allows the memory and performance of Java applications to
 * be improved for applications that regularly use Strings.
 * 
 * String Equality:
 * == - Reference Equality
 * .equals - Same string value
 * 
 */
public class StringBasics {

	static void stringImmutability() {
		String myString = "cat";
		int x = 0;
		if (++x > 0) {
			// all string 'mutation' methods just return new strings
			// they can't actually mutate the original, because all strings
			// are immutable
			myString = myString.concat(" hello");
		} else {
			myString = myString.concat(" dog");			
		}
		
		System.out.println(myString);
	}
	
	static void stringEquality() {
		String a = "hello";
		String b = "hello";
		String c = new String("hello");
		c = "bye";
		c = "hello";
		String start = "he";
		String end = "llo";
		String d = start + end;

		System.out.println(a.equals(d));
		System.out.println(a == d);
	}
	
	static void stringOperations() {
		String myString = "hello";		
	}
	
	static void stringBuilder() {
		StringBuilder sb = new StringBuilder("Hello");
		sb.reverse();
		System.out.println(sb);
	}
	
	static void performanceTest() {
		int iterations = 1_000_000;
		
		long startTime = System.currentTimeMillis();
		String start = "";
		for(int i = 0; i < iterations; i++) {
			start = start + "a";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("String Time: " + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < iterations; i++) {
			builder.append("a");
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder Time: " + (endTime - startTime));

		startTime = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer();
		for(int i = 0; i < iterations; i++) {
			buffer.append("a");
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuffer Time: " + (endTime - startTime));

		
		
	}
	
	public static void main(String[] args) {
		performanceTest();
	}
}
