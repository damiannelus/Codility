import java.util.Arrays;

public class MaxProductOfThree {
	public static void main(String[] args) {
//		int[] A = {-3, 1, 2, -2,5,6};
//		int[] A = {-5, 5, -5, 4};
//		int[] A = {-5, -7, -5, -2};
		int[] A = {5, -7, -5, -2, 0};
		System.out.println(solution(A));
	}
	
	static public int solution(int[] A){
		Arrays.sort(A);
		int len = A.length;
		int left = 0;
		int right = 0;
		if (A[len-1] < 0) {
			return A[len-1] * A[len-2] * A[len-3];
		} else {
			if (A[0] > 0) {
				return A[len-1] * A[len-2] * A[len-3];
			} else {
				left = A[0] * A[1];
				right = A[len-3] * A[len-2];
				if (A[len-1] > 0) {					
					if (left > right) {
						return left * A[len-1];
					} else {
						return right * A[len-1];
					}
				} else {
					if (left > right) {
						return right * A[len-1];
					} else {
						return left * A[len-1];
					}
				}
			}
		}
	};
}
