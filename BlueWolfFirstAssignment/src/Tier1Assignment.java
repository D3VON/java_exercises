import java.util.HashMap;
import java.util.HashSet;

/**
 * 
 */

/**
 * @author devonmcb@yahoo.com Devon McBride
 * 
 * Return work to michael.goldstein@bluewolfgroup.com
 * 
 * Assumptions: 
 * 1. Use Basic Multilingual Plane (BMP) of characters;
 * the set of characters from U+0000 to U+FFFF.
 *
 */
public class Tier1Assignment {
	
	/**
	 * i.) Given an array with 1,000,000 integers between 1 and 1,000,000, one
	 * integer is in the array twice. Find the duplicate. 
	 * 
	 * NOTE: when no non-repeating integer is found, 
	 * the -1 is returned.
	 * (Or, it could throw an exception, but that's ugly.) 
	 */
	public int findTheDuplicateNumber(int a[]){
		
		HashSet<Integer> theSet = new HashSet<Integer>();
		

		for (int i=0; i<a.length; i++){
			if(!theSet.add(a[i])){ // add returns false if already in set
				return a[i];
			}			
		}
		
		//checked the whole thing, and no duplicates, so return -1
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	/**
	 * ii.) Find the first non-repeating character in a string: ("DEFD" -> E)
	 * 
	 * NOTE: when no non-repeating character is found, 
	 * the NULL character is returned.
	 * (Or, it could throw an exception, but that's ugly.) 
	 */
	// Two loops, so O(n), which isn't bad. 
	public char getFirstUniqueChar(String str) {

		// doesn't preserve order, but stores unique key -> value pairs
		HashMap<Character,Integer> map = new HashMap<>();

		// key:   the character
		// value: count of times the character appears 
		for (int a = 0; a < str.length(); a++) {
			char c = str.charAt(a);
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1 );
			}else{
				map.put(c, 1);
			}
		} 
		
		// traverse string again to identify non-repeated character
		for (int b = 0;	b < str.length(); b++) {
			char c = str.charAt(b);
			if (map.get(c) == 1) {
				return c;
			}
		}
		int noUniques = 0;
		return (char) noUniques;
		
		//throw new RuntimeException("No unique (non-repeating) character found.");
	}
	
	public void speak() {
		System.out.println("woof");
	}

}
