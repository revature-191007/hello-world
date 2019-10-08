package samples.access.modifiers.b;

import samples.access.modifiers.a.AccessModifiers;

public class ExtendingClass extends AccessModifiers{
	static {
		// not accessible
		// private members can't be accessed outside
		// the class
//		System.out.println(AccessModifiers.a);
		
		// not accessible
		// default members can't be accessed outside
		// of the defining package
//		System.out.println(AccessModifiers.b);
		System.out.println(AccessModifiers.c);
		System.out.println(AccessModifiers.d);
	}
}
