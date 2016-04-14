import java.util.HashMap;
import java.util.HashSet;

/**
 * @author devonmcb@yahoo.com Devon McBride
 * 
 * Return to michael.goldstein@bluewolfgroup.com
 * 
 * Write a function in the programming language of your choice to solve the
 * following problems (see each of the two function's comments). 
 * Each function MUST be accompanied by positive and negative unit tests. 
 *
 */
public class Tier1Assignment {
	
	/**
	 * i.) Given an array with 1,000,000 integers between 1 and 1,000,000, one
	 * integer is in the array twice. Find the duplicate.
	 * 
	 * NOTE: Since I'm given (i.e. 'guaranteed') an array as described above, 
	 * I am not testing for such things as multiple duplicates.  
	 * In my driver, however, I have provided some tests beyond this spec. 
	 * 
	 * NOTE DESIGN CHOICE: -1 is returned when no non-repeating integer is found.
	 * NOTE DESIGN CHOICE: -1 is ALSO returned when there is a number in the array 
	 * which is not within the boundaries of the specification.
	 */
	public int findDupNum(int a[]){
				
		HashSet<Integer> theSet = new HashSet<Integer>();
		
		for (int i=0; i<a.length; i++){
			if( 1 > a[i] || 1000000 < a[i] ) {
				return -1; // must be between 1 and 1,000,000, else violates contract with this function
			}
			if(!theSet.add(a[i])){ // .add will return false if already in set
				return a[i];
			}			
		}
		
		return -1; //checked the whole thing, and no duplicates, so return -1
	}
	
	
	
	/**
	 * ii.) Find the first non-repeating character in a string: ("DEFD" -> E)
	 * 
	 * NOTE DESIGN CHOICE: when no non-repeating character is found, the NULL character is returned.
	 * (Or, it could have instead throw an exception.) 
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
}
