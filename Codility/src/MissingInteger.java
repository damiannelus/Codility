import java.util.Arrays;

public class MissingInteger {
	public static void main(String[] args) {
//		int[] A = {1,3,6,4,1,2};
//		int[] A = {-1};
//		int[] A = {-1,1,2,3};
		int[] A = {4, 5, 6, 2};
		System.out.println(findMissingInteger(A));
	}

	private static int findMissingInteger(int[] A) {
		Arrays.sort(A);
		int missingValue = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i]==missingValue+1) missingValue++;
		}
		return missingValue+1;
	}
}
