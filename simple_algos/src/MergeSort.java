/**
 * 
 */

/**
 * @author devonmcb
 * 
 * Awesome video by youtube account mycodeschool about mergesort at https://www.youtube.com/watch?v=TzeBrDU-JaY
 * I love that guy: so clear and easy!  
 *
 */
public class MergeSort {
	/**
	 * @param args
	 */
	public static void merge(int[] L, int[] R, int[] A) {
		
		int i = 0;
		int j = 0; 
		int k = 0;
		
		while(i < L.length && j < R.length){
			if (L[i] <= R[j]){
				A[k] = L[i];
								//				System.out.println("L["+ i + "]: " + L[i]);
								//				System.out.println("     A["+ k + "]: " + A[k]);
				k+=1;
				i+=1;
			}else{
				A[k] = R[j];
								//				System.out.println("R["+ j + "]: " + R[j]);
								//				System.out.println("     A["+ k + "]: " + A[k]);
				k+=1;
				j+=1;
			}
		}
		while(i < L.length){
			A[k] = L[i];
			k+=1;
			i+=1;
		}

		while(j < R.length){
			A[k] = R[j];
			k+=1;
			j+=1;
		}
	}
	

	/**
	 * @param args   // this version assumes references for everything
	 */
	public static void mergesort(int[] A) {
		
		if (A.length < 2 ){
			return;
		}
		int mid = A.length/2;
		int[] L = new int[mid];
		int[] R = new int[A.length-mid];
		for(int a = 0; a<mid; a++){
			L[a] = A[a];
		}
		for(int b = 0; b<R.length; b++){
			R[b] = A[b+mid];
		}
		mergesort(L);
		mergesort(R);
		merge(L,R,A);
	}
	

//	/**
//	 * @param args
//	 */
//	public static int[] mergesort(int[] A) {
//		
//		if (A.length < 2 ){
//			return A;
//		}
//		int mid = A.length/2;
//		int[] L = new int[mid];
//		for(int a = 0; a<mid; a++){
//			L[a] = A[a];
//		}
//		int[] R = new int[A.length-mid];
//		for(int b = 0; b<R.length; b++){
//			R[b] = A[b+mid];
//		}
//		
//		L = mergesort(L);
//		R = mergesort(R);
//		merge(L,R,A);
//		return A;
//	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = new int[16];
		int[] L = {1,3,4,4,5,6,7,9};
		int[] R = {1,2,5,7,8,9,11,16};
		
		merge(L,R,A);
		for(int x = 0; x< A.length; x++){
			System.out.println(A[x]);
		}
		System.out.println("---------------------------------------------");
		
		int[] B = {9,3,4,28,345,3,0,88,33,1234};
		for(int z = 0; z< B.length; z++){
			System.out.println(B[z]);
		}
		//B = mergesort(B);
		mergesort(B);
		for(int z = 0; z< B.length; z++){
			System.out.println(B[z]);
		}
				

	}

}
