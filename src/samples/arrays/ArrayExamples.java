package samples.arrays;

/**
 * A sequence of values stored together with a single identifier. 
 * In memory arrays are contiguous blocks of memory.
 *
 */
public class ArrayExamples {
	public static void main(String[] args) {
		// Array declaration
		// Declaring an array of ints
		int j;

		int[] myInts = new int[10];
		
		for(int i = 0; i < myInts.length; i++) {
			System.out.println(myInts[i]);
		}
		
		// {1, 2, 3, 4} <-- array literal syntax
		int[] arrayLiteral = {1, 2, 3, 4};
		for(int i = 0; i < arrayLiteral.length; i++) {
			System.out.println(arrayLiteral[i]);
		}
		
		int[][] twoDimensionalArray = new int[5][10];
		
		// a 2D array is less "2D" and more an array of arrays
		int[] firstYColumn = twoDimensionalArray[0];
		
		for (int x = 0; x < twoDimensionalArray.length; x++) {
			for(int y = 0; y < twoDimensionalArray[x].length; y++) {
				System.out.printf("[%d][%d]%n", x, y);
			}
		}
		
	}
}
