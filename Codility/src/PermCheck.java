import java.util.Arrays;

public class PermCheck {
	public static void main(String[] args) {
//		int[] A = {4,1,3,2};
		int[] A = {4,1,3};
		System.out.println(isPermutation(A));
	}

	private static int isPermutation(int[] A) {
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {
			if(i+1!=A[i]) return 0;
		}
		return 1;
	}
}
