package samples.access.modifiers.a;

public class SamePackageClass {
	// Static initialization block
	// a block that will run when
	// the classloader loads the class

	static {
		// not accessible
		// private members can't be accessed outside
		// the class
//		System.out.println(AccessModifiers.a); 
		System.out.println(AccessModifiers.b);
		System.out.println(AccessModifiers.c);
		System.out.println(AccessModifiers.d);
	}
}
