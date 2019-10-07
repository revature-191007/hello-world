package com.revature;

/**
 * Java Conventions:
 * 	* Packages - Classes are organized into packages. Packages are written
 * in all lower case, with subpackages referenced using dot-notation, and
 * generally start with reverse domain name convention.
 * 
 *  * Classes - Classes represent encapsulated types within Java. All Java
 *  code is within some kind of class. Java files (.java) must have the same
 *  name as the top-level public type contained within. A single .java file can have
 *  only one top-level public type.
 * 
 * 	* Main method - The main method represent the starting point for execution
 * in a java application. A Java app can have more than one main method,
 * but probably shouldn't. The Java main method has a strictly defined
 * method signature, if you do not follow that method signature correctly
 * it will not be recognized as the starting point.
 * 		* Valid Variations:
 * 			public static void main(String[] args) {} <-- most common
 * 			public static void main(String args[]) {}
 * 			public static void main(String... args) {}  <-- using varargs
 * 
 *  Compiling Java:
 *  	javac
 *  	Use javac to compile .java files to .class files (bytecode)
 *  	-- javac SampleLauncher.java
 *  Running:
 *  	java
 *  	Use java to run compiled .java files (from src folder with package names)
 *    	-- java com.revature.SampleLauncher
 */
public class SampleLauncher {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}	
}


