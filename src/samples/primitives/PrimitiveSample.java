package samples.primitives;

public class PrimitiveSample {
	// Primitives - Primitives (as compared to Objects) are data and not
	// an object. Primitives are stored directly as data in memory without
	// a reference. Java has 8 primitive types. These cannot be extended and
	// are the fundamental kinds of data that underly all classes/objects.

	// integer primitives (signed integers) - What is an integer?
	// A whole number with no decimal part.
	private byte myByte; // 8bits
	private short myShort; // 16bits
	private int myInt; // 32bits
	private long myLong; // 64bits

	// Floating point numbers (2) - Variable types that can contain
	// decimal portions, floating point numbers are subject to precision
	// issues. Values stored may not be exactly what the original calculation
	// may result in, or what was assigned, though many standard whole numbers
	// are safe. Consequently, you should not use these when you need exact
	// values. Additionally we should be careful about comparisons.
	private float myFloat; // 32bit
	private double myDouble; // 64bit

	// Character type (1) - chars are 16bit unsigned integer values but
	// are represented as characters when printed
	private char myChar;

	// Logical type (1) - Booleans are true/false, (1/0)
	private boolean myBoolean;
}
