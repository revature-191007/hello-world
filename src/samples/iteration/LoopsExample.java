package samples.iteration;

import java.security.SecureRandom;

/**
 * Java has four primary methods of imperative iterative programming.
 * 
 * 
 * These are:
 * 
 * 1. for loops
 * 2. while loops
 * 3. do-while loops
 * 4. enhanced-for loop
 * 
 * What is iteration?
 * 
 * Repeatedly executing logic, given some kind of control.
 * 
 * 
 */
public class LoopsExample {
	
	/*
	 * While loops are generally used when we don't have a defined number
	 * of times to iterate, and thus are mostly just wanting to do something
	 * until it results in some new state.
	 */
	static void whileExample() {
		boolean maybe = true;
		int count = 0;
		SecureRandom random = new SecureRandom();
		
		while( maybe /* predicate */) {
			count++;
			if ( random.nextDouble() > 0.95) {
				maybe = false;
			}
		}
		System.out.println(count);
	}
	
	/*
	 * do-while will always run at least once
	 * while will run n times
	 * then do while will run x
	 */
	static void doWhileExample() {
		boolean maybe = true;
		int count = 0;
		SecureRandom random = new SecureRandom();
		
		do {
			count++;
			// iterative executing code
			if (random.nextDouble() > 0.95) {
				maybe = false;
			}
		} while (maybe);
		System.out.println(count);
	}

	/**
	 * For loops include the usage of a tracking variable to track the number
	 * of iterations the loop should run.
	 * 3 parts of the loop declaration are:
	 * 1. variable declaration*
	 * 2. condition
	 * 3. mutation
	 */
	static void forExample() {
		
		for( int i = 1, x = 3, y = 10; i <= 10 || y % 2 == 0; i++, y--, x+=2) {
			System.out.printf("i: %d, x: %d, y: %d%n", i, x, y);
		}
		
		int x;
		for(x = 0; x < 10; x++) {
			
		}
		System.out.println(x);

		String[] strings = new String[10];
		
		for(int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	
		
	}
	
	/**
	 * Enhanced for loop is an abbreviated syntax for iteration over
	 * some kind of iterable collection (Array, list, etc).
	 */
	static void enhancedForLoop() {	
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int x : arr) {
			x *= 2;
		}
		for(int x : arr) {
			System.out.println(x);
		}
		
		
	}
	
	static void forIncrementor() {
		for(int i = 0; i < 10; ++i) {
			if(i % 2 == 0) {
				i++;
			}
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		forIncrementor();
	}
}
