import java.util.Random;

/**
 * TestTier1Assignment to test Tier1Assignment class.
 */

/**
 * @author devonmcb@yahoo.com Devon McBride
 * 
 * Return work to michael.goldstein@bluewolfgroup.com
 * 
 * Assumptions: 
 * 1. Since this is a "quick and easy" exercise, I am assuming the domain of
 * possible characters is only ASCII (the easy ones).
 *
 */
//import Tier1Assignment;

public class TestTier1Assignment {

	public static void main(String args[]){
	
		Tier1Assignment assignmentObject = new Tier1Assignment();		
		assignmentObject.speak();
		
		//Largest String can be length Integer.MAX_VALUE
//		String str = null; 
//		Random randy = new Random();
		// MAX_VALUE on my machine is 2147483647, but was too big. 
		//int big = Integer.MAX_VALUE/2;
//		for(int x = 0; x < big; x++){
//			str += (char)randy.nextInt(255);
//		}
		
		//String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		//System.out.println(str);
	/*good tests
		System.out.println(assignmentObject.getFirstUniqueChar("234523452351")); //1
		System.out.println(assignmentObject.getFirstUniqueChar("345976873456009832ohgo8tryuo6tuoijlfujt  . . . . ururur%%%%")); //2
		System.out.println(assignmentObject.getFirstUniqueChar("abbashhsryyrttttttttttttt3tttttttttttt")); //3
		System.out.println(assignmentObject.getFirstUniqueChar("")); // fail
		System.out.println(assignmentObject.getFirstUniqueChar("abba")); // fail
		System.out.println(assignmentObject.getFirstUniqueChar("a")); // a
	*/
		int[] theArray = new int[1000000];
		for (int i=0; i<1000000; i++){
			theArray[i] = i;
		}

		System.out.println(assignmentObject.findTheDuplicateNumber(theArray)); // -1
		theArray[888888] = 999999;
		System.out.println(assignmentObject.findTheDuplicateNumber(theArray)); // -1
		
		
	
	}
}
