package oop;

import java.util.RandomAccess;

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
 *  2. interface - Contract that stipulates that certain actions (methods) will be 
 *  available for the consumers of that class. Methods in an interface are 
 *  implicitly public and abstract. All fields defined on an interface are implicitly
 *  (and required to be) public static final. With Java 8, interfaces allow for 'default'
 *  methods, which are methods on an interface that have implementations. A class can
 *  implement multiple interfaces, but can extend only one class. For this reason,
 *  interfaces are often described using adjectives: Cloneable, Adaptable, ...
 *
 */
public class Abstraction {
	public static void main(String[] args) {
		Car car = new Car();
		car.move("Abby", "Ankorage");
		Catapult catapult = new Catapult();
		catapult.move("boulder", "castle");
		
		Drinkable water = new Water();
		water.drink();
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

class Catapult extends Transportation {

	@Override
	void move(String thing, String location) {
		System.out.println("The catapult launches " + thing + " into " + location + ".");
	}	
}

interface Drinkable {
	void drink();
}

/* classes IMPLEMENT interfaces */
class Water implements Drinkable {
	public void drink() {
		System.out.println("Drinking water");
	}
}

/* interfaces EXTEND interfaces */
/* Interfaces can extend multiple interfaces */
interface Swimmable extends Drinkable, RandomAccess {
	void swim();
}
