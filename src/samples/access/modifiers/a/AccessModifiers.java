package samples.access.modifiers.a;

/*
 * Depending on who you ask, Java will have 3 or 4 access modifiers:
 * 
 * 1. private - only within class
 * 2. (default) - Same package
 * 3. protected - Accessible within the same package or by extending classes
 * 4. public - anywhere
 * 
 */
public class AccessModifiers {
	private static int a = 1;
	static int b = 2; 
	protected static int c = 3;
	public static int d = 4;
	
	static {
		// Within same class so all are referenceable
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	// initialization block
	// executed upon construction of object
	{
		
	}
	
	public static void main(String[] args) {
		System.out.println("Hello!");
	}
}
