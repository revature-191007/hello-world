package oop;

/**
 * When designing we want to focus on how systems interact and not the details of
 * their functionality.
 * "What are we doing, not how are we doing it".
 * 
 *  We have two mechanisms to accomplish this kind of structure in Java.
 *  
 *  1. abstract class - Concept level some class that wouldn't make sense to 
 *  exist at this level of abstraction. Example: Animal, Transportation. However,
 *  they make useful high level hierarchical definition that can be inherited
 *  by more specific implementations. 
 * 	
 * 		Normal property definitions with classes. 
 * 		Methods can be concrete or optionally abstract - they have no implementation.
 *  
 *  2. interface
 *
 */
public class Abstraction {
	public static void main(String[] args) {
		Car car = new Car();
		car.move("Abby", "Ankorage");		
	}
	
}

abstract class Transportation {
	abstract void move(String thing, String location);
}

class Car extends Transportation {
	
	// @Override - Annotation
	// Declares that this method should override a parent method
	@Override
	void move(String thing, String location) {
		System.out.println("The car drives " + thing + " to " + location +".");
	}
}
