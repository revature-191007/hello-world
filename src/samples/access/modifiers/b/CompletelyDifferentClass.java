package samples.access.modifiers.b;

import samples.access.modifiers.a.AccessModifiers;

public class CompletelyDifferentClass {
	static {
		// not accessible
		// private members can't be accessed outside
		// the class
//		System.out.println(AccessModifiers.a);
		
		// not accessible
		// default members can't be accessed outside
		// of the defining package
//		System.out.println(AccessModifiers.b);
		
		// not accessible
		// protected members can't be accessed 
		// when not in the package and not in
		// an extending class
//		System.out.println(AccessModifiers.c);
		System.out.println(AccessModifiers.d);
	}
}
