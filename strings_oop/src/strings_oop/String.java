package strings_oop;

import java.util.Arrays;

/**
 * Each instance represents a sequence of text characters.
 * 
 * @immutable
 * 
 * @invar | toCharArray() != null
 */
public class String {

	/**
	 * @inspects | this
	 * @creates | result
	 */
	public char[] toCharArray() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @inspects | this
	 * @post | result == toCharArray().length
	 */
	public int length() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @pre | 0 <= index && index < length()
	 * @inspects | this
	 * @post | result == toCharArray()[index]
	 */
	public char charAt(int index) { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * Initializes this object to represent the given sequence of characters.
	 * 
	 * @pre | characters != null
	 * @post | Arrays.equals(toCharArray(), characters)
	 */
	public String(char[] characters) { throw new RuntimeException("Not yet implemented"); }

}
