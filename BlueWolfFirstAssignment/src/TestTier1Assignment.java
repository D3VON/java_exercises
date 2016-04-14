import java.util.Random;

/**
 * TestTier1Assignment to test Tier1Assignment class.
 */

/**
 * @author devonmcb@yahoo.com Devon McBride
 * 
 * Return to michael.goldstein@bluewolfgroup.com
 * 
 * Assumptions: 
 * 1. Since this is a "quick and easy" exercise, I am assuming the domain of
 * possible characters is only ASCII (the easy ones).
 *
 */
//import Tier1Assignment;

public class TestTier1Assignment {

	public static void main(String args[]){
	
		Tier1Assignment theObj = new Tier1Assignment();		

		/****************************************************************
		 ****************************************************************
		 * 	TEST FUNCTION getFirstUniqueChar()
		 ****************************************************************
		 ****************************************************************/
		System.out.println("The following are testing getFirstUniqueChar().............................");
		

		/********************************
		 * tests expected to pass
		 ********************************/
		System.out.println("getFirstUniqueChar() returned: " + theObj.getFirstUniqueChar("DEFD") + ", E expected");		
		System.out.println("getFirstUniqueChar() returned: " + theObj.getFirstUniqueChar("234523452351") + ", 1 expected"); //1
		System.out.println("getFirstUniqueChar() returned: " + theObj.getFirstUniqueChar("ABABABA12134567!@#$") + ", 2 expected"); //2
		System.out.println("getFirstUniqueChar() returned: " + theObj.getFirstUniqueChar("abbashhstttttttttt3tttshhs12") + ", 3 expected"); //3
		System.out.println("getFirstUniqueChar() returned: " + theObj.getFirstUniqueChar("a") + ", a expected"); // a
		String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		System.out.println("getFirstUniqueChar() returned: " + theObj.getFirstUniqueChar(str) + ", L expected");
		
		/********************************
		 * tests expected to fail
		 ********************************/
		System.out.println();
		System.out.println("The next tests of getFirstUniqueChar() are expected to return null -- causing string in test to think it's ended.");
		System.out.println("getFirstUniqueChar() returned: " + theObj.getFirstUniqueChar("") + ", NULL character expected (will print nothing)"); // fail
		System.out.println("getFirstUniqueChar() returned: " + theObj.getFirstUniqueChar("abba") + ", NULL character expected (will print nothing)"); // fail


		/****************************************************************
		 ****************************************************************
		 * 	TEST FUNCTION findDupNum()
		 ****************************************************************
		 ****************************************************************/
		System.out.println();
		System.out.println("The following are testing findDupNum().............................");
		
		// set up array according to specification
		int[] inOrderArray = new int[1000000];
		for (int i=0; i<1000000; i++){
			inOrderArray[i] = i+1;
			// NOTE: e.g., index 0 has value 1; index 999999 has value 1,000,000
		}
		
		/********************************
		 * tests expected to pass
		 ********************************/
		// boundary test: 1
		inOrderArray[888888] = 1; // should fail, b.c. 0 isn't between 1 and 1,000,000
		System.out.println("Expecting: 1, got: " + theObj.findDupNum(inOrderArray));
		inOrderArray[888888] = 888888+1; // 'reset' that one

		// boundary test: 1000000
		inOrderArray[888888] = 1000000; // should fail, b.c. 0 isn't between 1 and 1,000,000
		System.out.println("Expecting: 1000000, got: " + theObj.findDupNum(inOrderArray));
		inOrderArray[888888] = 888888+1; // 'reset' that one

		// arbitrary duplicate
		inOrderArray[888888] = 12345;
		System.out.println("Expecting: 12345, got: " + theObj.findDupNum(inOrderArray));
		inOrderArray[888888] = 888888+1; // 'reset' that one
		
		// some simple randoms just for kicks
		Random randy = new Random();
		for (int i=0; i<3; i++){
			int testValue = randy.nextInt(1000000);
			int testIndex = randy.nextInt(1000000);
			while(testValue == testIndex){ // ensure these two are different
				testValue = randy.nextInt(1000000);
				testIndex = randy.nextInt(1000000);
			}
			inOrderArray[testIndex] = testValue;
			System.out.println("Expecting: " + testValue + ", got: " + theObj.findDupNum(inOrderArray));
			inOrderArray[testIndex] = testIndex+1; // 'reset' that one
		}
		
		/********************************
		 * tests expected to fail
		 ********************************/

		// boundary test: 0
		inOrderArray[888888] = 0;
		System.out.println("Expecting: -1, got: " + theObj.findDupNum(inOrderArray));
		inOrderArray[888888] = 888888+1; // 'reset' that one

		// boundary test: 1000001
		inOrderArray[888888] = 1000001; 
		System.out.println("Expecting: -1, got: " + theObj.findDupNum(inOrderArray));
		inOrderArray[888888] = 888888+1; // 'reset' that one

		// boundary test: -1
		inOrderArray[888888] = -1; 
		System.out.println("Expecting: -1, got: " + theObj.findDupNum(inOrderArray));
		inOrderArray[888888] = 888888+1; // 'reset' that one

		// overflow test: Integer.MAX_VALUE
		inOrderArray[888888] = Integer.MAX_VALUE + 1; 
		System.out.println("Expecting: -1, got: " + theObj.findDupNum(inOrderArray));
		inOrderArray[888888] = 888888+1; // 'reset' that one

		// overflow test: Integer.MIN_VALUE
		inOrderArray[888888] = Integer.MIN_VALUE - 1; 
		System.out.println("Expecting: -1, got: " + theObj.findDupNum(inOrderArray));
		inOrderArray[888888] = 888888+1; // 'reset' that one
				
		// empty (small) array
		int[] smallEmptyArray = new int[1];
		System.out.println("Expecting: -1, got: " + theObj.findDupNum(smallEmptyArray));
		
	
	}
}
