package samples.exception.trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Keyboard shortcuts:
 * auto-import ctrl+shift+o
 * auto-format ctrl+shift+f
 * rename identifier alt+shift+r
 * ctrl+delete - delete word
 * ctrl+arrow - navigate word
 * alt+up/down - move line up or down
 * ctrl+up/down - copy line or selection
 * ctrl+s - save
 * alt+shift+s - generation menu
 */

/**
 * Exception Handling
 * -------------------
 * Checked exceptions require handling and unchecked can optionally handled
 * if desired, but don't require it.  To handle an exception, we have two options
 * 
 * 1. try/catch block
 * 		- Handling exception locally
 * 2. declaring the method throws the exception type
 *		- Our method should end and the exception should propagate through
 *			the stack.
 *
 *
 * Try/Catch
 * ------------
 * 
 * In a situation where you need to write code which may be at risk of throwing
 * an exception, you can supply a 'try' block, which will attempt the dangerous code,
 * and if the exception does occur, it will delegate handling of the exception to
 * a supplied 'catch' block declared with the expected exception.
 * 
 * Finally - Finally is an additional code block that will always execute regardless
 * of whether the an exception occurs or not. Finally can be used to close resources
 * or do any cleanup that needs to occur that an exception might prevent.
 * 
 * Try-with-resources - allows a try block to be created alongside the declaration
 * of variables that implement the interface AutoClosable. These resources will be
 * automatically closed when the try block concludes - regardless of exception.
 * 
 * throw vs throws vs throwable
 * 
 * Throwable - the interface that is implemented by both Error and Exception
 * 				and defines something that can be thrown.
 * 
 * throws 	 - Keyword used in method signature to declare that the method may
 * 				throw the provided exception.
 * 
 * throw 	 - Throw is a keyword used to explicitly throw an instance of an exception.
 * 
 * NullPointerException - Tried to call a method or access a property on a variable
 * 			whose value is null. Unchecked.
 * 
 * IndexOutOfBoundsException - Access something by index, but index is out of bounds.
 * 	Extended by ArrayIndexOutOfBounds, StringIndexOutOfBounds. Unchecked.
 * 
 * ArithmeticException - Divided by zero. Unchecked.
 * 
 * IOException - Generic exception related to IO operations. Checked.
 * 
 * 
 * Checked vs Unchecked Exceptions
 * 
 * Checked Exceptions - Exceptions which require handling logic, either by
 * 					supplying a try/catch block OR by declaring the method 
 *  				throws the exception (and allowing it to propagate up).
 *  				Generally related to external operations that cannot be
 *  				logically checked beforehand.
 *  
 * Unchecked Exceptions - Exceptions which do not require handling logic.
 * 							These can generally be handled logically without
 * 							a try-catch block.
 */
public class TryCatchExample {
	public static void main(String[] args) {
		System.out.println(finallyTest());
		System.out.println("Application finished okay.");
	}
	
	static void a() {
		try {
			b();
			System.out.println("Try output!");
		} catch (NullPointerException /* | FileNotFoundException */ e) {
			System.out.println("Exception caught!");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			
		}
		System.out.println("A output!");
	}
	
	static void b() throws FileNotFoundException {
		c();
		System.out.println("B output!");
	}
	
	static void c() {
		String str = null;
		int x = str.length(); // NullPointerException
		System.out.println("C output!");
		
		File file = new File("myfile.txt");

		try(FileReader fileReader = new FileReader(file)) {
			// do stuff with fileReader
			// will automatically be closed as it was 
//			opened using try-with-resources
		} catch (IOException e) {
			e.printStackTrace();
		}
		throw new NullPointerException();		
	}
	
	static String finallyTest() {
		try {
			String myString = null;
			return myString.concat("try");
		} catch(NullPointerException e) {
			System.out.println("throws");
			return "";
		} finally {
			System.out.println("Finally");
		}
	}
}
