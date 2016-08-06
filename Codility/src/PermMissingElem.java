import java.util.Arrays;

public class PermMissingElem {
	public static void main(String[] args) {
//		int[] A = {2,3,4,1};
		int[] A = {};
		System.out.println(findMissing(A));
	}

	private static int findMissing(int[] A) {
		if(A.length == 0) return 1;
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {
			if(A[i] != i+1) return i+1;
		}
		return A[A.length-1]+1;
	}
}
