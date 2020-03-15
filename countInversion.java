package numberOfInversions;
import java.util.Arrays;

public class countInversion {
	int[] input;
	public countInversion(){
		
	}
	public sortCountType sortCount(int[] A) {
		//for(int i : A) {
		//	System.out.println("Array: " + i);
		//}
		if(A.length == 1) {
			return new sortCountType(A, 0);
		}
		else {
			int mid = A.length /2;
			//System.out.println("Mid: " + mid);
			sortCountType left = sortCount(Arrays.copyOfRange(A, 0, mid));
			sortCountType right = sortCount(Arrays.copyOfRange(A, mid, A.length));
			sortCountType split = mergeCountSplitInv(left.array, right.array, A.length);
			return new sortCountType(split.array, left.count + right.count + split.count);
		}
	}
	
	public sortCountType mergeCountSplitInv(int[] B, int[] C, int n) {
		int[] D = new int[n];
		int i = 0;
		int j = 0;
		long inversion = 0;
		int BFinish = 0;
		int CFinish = 0;
		for(int k = 0; k < n; k ++) {
			if((B[i] < C[j] || CFinish == 1) && BFinish ==0) {
				D[k] = B[i];
				if(i == B.length - 1) {
					BFinish = 1;
				}
				else {
					i++;
				}
			}
			else {
				D[k] = C[j];
				inversion = inversion + (B.length - i - BFinish);
				if(j == C.length - 1) {
					CFinish = 1;
				}
				else {
					j++;
				}
			}
		}
		//for(i = 0; i < D.length; i++) {
		//	System.out.println("D: " + D[i]);
		//}
		return new sortCountType(D, inversion);
	}
}
