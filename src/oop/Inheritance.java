package oop;
/**
 * Inheritance the concept that code can be augmented through providing
 * more specific implementations while reusing existing code through extension.
 * 
 * Extension creates a child class that inherits the state and behavior of the
 * parent.
 * @author Mitch
 *
 */
public class Inheritance {
	
	
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.x);
		b.doSomething();
		b.doSomethingElse();
	}
}


class A {
	int x = 4;
	void doSomething() {
		System.out.println(x);
	}
}

class B extends A {
	int y;
	int x = 10;
	void doSomethingElse() {
		System.out.println(super.x);
	}
}

class C extends B {
	
}

