/**
 * 
 */

/**
 * @author devonmcb
 * 
 * 
 * KEY THINGS TO REMEMBER
 * - swap function to sway elements within the array
 * - pivot doesn't move, except when partition finishes
 * - partitionIndex (usually just called pIndex -- which confused me because I thought it meant pivot index) moves one step at a time to the right, starting from the 0th element
 * 
 *
 */
public class Quicksort {

	public static void swap(int[] A, int a, int b){ // Java passes arrays by ref.; primitives by value
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;		
	}
	
	public static int partition(int[] A, int start, int end){
		int pivot = A[end]; // pivot is always the *value* of the last one, so everything else pivots around that value
		int partitionIndex = start; // this is what confused me a lot
		for(int i=start; i<end; i++){
			if(A[i]<=pivot){
				swap(A,i,partitionIndex);
				partitionIndex+=1;
			}
		}
		swap(A,partitionIndex,end);
		return partitionIndex;
	}
	
	public static void quicksort(int[] A, int start, int end){ // sort in place
		// we have all that tail-recursion happening, so we need a base case
		if(end>start) {
			int partitionIndex = partition(A,start,end);
			quicksort(A,start, partitionIndex-1);
			quicksort(A,partitionIndex,end);
		}
		// else, the size of the sub-sections of the array has dwindled to one or zero elements
	}
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] x = {-1,234,432,654321,3,6,1,8,4,8,44,22,567,243,798,2134,0};
		System.out.println("unsorted: \n");
		for(int m=0; m<x.length; m++){	System.out.print(x[m]+" "); }

		System.out.println("\n\nsorted: \n");
		quicksort(x,0,x.length-1);
		for(int m=0; m<x.length; m++){	System.out.print(x[m]+" ");	}
		

	}

}
