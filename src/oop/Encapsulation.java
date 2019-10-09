package oop;

/**
 * A class should be responsible for maintaining its own state. 
 * 
 * Implementation of encapsulation requires us to make all fields private
 * while exposing getter/setter methods.
 * 
 * By doing this, any external code that interacts with your class, must pass
 * through your logic in order to mutate it. This gives your class control over
 * its internal state, because it can apply its own logic anytime anything interacts
 * with it.
 * 
 *
 */
public class Encapsulation {
	
	private int x, y;
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		x = Math.min(10, x);
		x = Math.max(0, x);
		
		// Ternary operation -> y = condition ? true case result : false case result;
		x = x < 0 ? 0 : (x > 10 ? 10: x);
		
		this.x = x; 
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
}
