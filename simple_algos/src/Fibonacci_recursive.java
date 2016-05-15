/**
 * 
 */

/**
 * @author devonmcb
 * 
 * pretty straight forward fibonacci done with recursion
 * 
 * enter the index, get the fibonacci number for that index. 
 * 
 * so damned simple
 *
 */
public class Fibonacci_recursive {
	
	public static int fib(int n){
		if (n<1) {
			System.out.println("n is "+ n + ", so caught at if (n<1)");
			return 0; 
		}
		if (n<3) {
			System.out.println("n is "+ n + ", so caught at if (n<3)");
			return 1; 
		}
		return fib(n-1) + fib(n-2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(fib(6));

	}

}
