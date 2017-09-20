/**
 * 
 */

/**
 * @author devonmcb
 * Implement fibonacci with loops, not with recursion. 
 * Also, print out code as you go. 
 *
 */
class Fibonacci_Loop {
	
	
	public static int fib(int n){

		int a = 1;
		int b = 1;
		int c = 0;
		if ( n<1 ) {
			System.out.println("-----------------------------------");
			System.out.println("n is "+ n + ", so fib(n) is " + c);
			return c;
		}

		if ( n<2 ){
			System.out.println("-----------------------------------");
			System.out.println("n is "+ n + ", so fib(n) is " + a);
			return a;
		}
		
		if ( n<3 ){
			System.out.println("-----------------------------------");
			System.out.println("n is "+ n + ", so fib(n) is " + b);
			return b;
		}

		System.out.println("-----------------------------------");
		System.out.println("n is "+n);
		for(int i=3; i<=n; i++){
			c = a + b; 
			a = b; 
			b = c; 
			System.out.println("c is "+c+", a is "+a+", b is "+b);
		}
		System.out.println("--------so fib is "+c);
		return c;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Fibonacci_Loop f = new Fibonacci_Loop();

		fib(-1);
		fib(0);
		fib(1);
		fib(2);
		fib(3);
		fib(4);
		fib(5);
		fib(6);
		fib(7);
		fib(8);

	}
	
}	
