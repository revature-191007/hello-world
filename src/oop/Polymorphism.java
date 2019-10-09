package oop;

import java.math.BigDecimal;

/**
 * Polymorphism - "many forms"
 * 
 * In programming, polymorphism suggests that a single name for something
 * could represent things with many different actual implementations. This 
 * could mean that a parent might define a method, that a child defines
 * more specifically, or just differently. Or that a method, could operate
 * differently based on the parameters provided to it.
 * 
 * These forms of polymorphism are called:
 * 
 * Overloading - Providing multiple definitions of the method which
 * 	differ in parameters.
 * Overriding - Is overriding the parent implementation of a method with
 * 	a child's own implementation
 *
 */
public class Polymorphism {

	public static void main(String[] args) {
		overloadingTest();
	}
	
	static void overridingTest() {
		Feline feline = new Feline();
		Feline cat = new HouseCat();
		Feline lion = new Lion();
		HouseCat houseCat = new HouseCat();
		cat = houseCat;
		
		Feline[] felines = {feline, cat, lion, houseCat};
		for (Feline f : felines) {
			if(f instanceof HouseCat) {
				// casting - telling the compiler to trust you
				// (but if you are wrong, an exception will be thrown)
				HouseCat c = (HouseCat) f;
				c.purr();
			}
			f.speak();
		}
		
	}
	
	static void overloadingTest() {
		Calculator calculator = new Calculator();
		
		int a = calculator.sum(1, 2);
		int b = calculator.sum(1, 2, 3, 4);
		double c = calculator.sum(2.5, 3);
		BigDecimal bd = calculator.sum(
				new BigDecimal(123.9832759382753298), 
				new BigDecimal(45354435435345.409483290830958394085439853));
		System.out.printf("%d, %d, %f, %s%n", a, b, c, bd.toString());
		
		Feline feline = new Feline();
		HouseCat cat = new HouseCat();
		calculator.pet(feline);
		calculator.pet(cat);
	}
}

class Feline {
	void speak() {
		System.out.println("Roar");
	}
}

class HouseCat extends Feline {
	void speak() {
		System.out.println("Meow");
	}
	void purr() {
		System.out.println("prprrrrrrrrr");
	}
	
}

class Lion extends Feline {
	void speak() {
		System.out.println("Rooaaaaaaaaar!");
	}
}

class Calculator {

	int sum(int a, int b) {
		return a + b;
	}
	
	double sum(double a, double b) {
		return a + b;
	}
	
	int sum(int... a) {
		int sum = 0;
		for(int x : a) {
			sum += x;
		}
		return sum;
	}
	
	BigDecimal sum(BigDecimal a, BigDecimal b) {
		return a.add(b);
	}
	
	void pet(Feline feline) {
		System.out.println("Petting feline");
	}
	
	void pet(HouseCat cat) {
		System.out.println("Petting cat");
	}

}

