/**
 * 
 */

/**
 * @author devonmcb
 *
 */
public class Factorial_recursive {

	public static int fact(int n){
		if (n<1) return 0;
		if (n==1) return 1;
		return fact(n-1) * n;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(fact(5));

	}

}
