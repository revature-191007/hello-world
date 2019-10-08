package samples.control.conditional;

/**
 * Control structures are used to control the flow of the execution of code.
 * Control structures in imperative code can be broken down into two primary
 * categories:
 * 
 * 1. Conditional control structures 2. Iterative control structures
 *
 * Conditional control structures are designed to execute code conditionally
 * given some predicate expression or some kind of equalitive express.
 *
 * 1. If statement - Executes a code block given some predicate evaluating to
 * true. Predicate - Some expression that will evaluate to true or false and
 * generally used in some kind of conditional evaluation.
 * 
 * 1. b if-else - Executes a code block given some predicate, or else executes a
 * different code block. 1. c if-else if-else
 * 
 * 2. switch statement - Switch statements allow us to define a value and then
 * provide cases for what should happen provided given values.
 *
 *
 * Logical Operators: &&, & - AND - true when both sides are true ||, | - OR -
 * true when either side is true ^ - XOR - true when exactly one side is true !
 * - NOT - negates the paired value == - EQUALS - True when both sides are the
 * same != - NOT EQUALS - True when are different
 * 
 */
public class IfExamples {
	static void IfStatement() {
		if (!true == false != true || true && !false && false || true) {
			System.out.println("Will this print?");
		} else if (true) {
			System.out.println("This should always print, right?");
		} else {
			System.out.println("Or will this one print?");
		}
	}

	/*
	 * Switch statements are not valid for every type. int, char, byte, short,
	 * String, enums Long, double, float, boolean - invalid for switch statement
	 */
	static void switchStatement() {
		String myString = "animal";
		switch (myString) {

			case "bird": {
				System.out.println("It's a bird!");
				break;
			}
			case "animal":
			default:
				System.out.println("Some kind of animal");
				break;
			case "lion":
			case "tiger":
			case "cat": {
				System.out.println("It's a cat!");
				break;
			}
			case "dog": {
				System.out.println("It's a dog!");
				break;
			}
		}
	}

	public static void main(String[] args) {
//		IfStatement();
		switchStatement();
	}
}
