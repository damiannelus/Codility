
public class MaxSliceSum {

	public static void main(String[] args) {
		int[] A = {3, 2, -6, 4, 0};
//		int[] A = {-3, -2, -6, -4, -1};
//		int[] A = {1};
//		int[] A = {-2, 1};
//		int[] A = {3, -2, 3};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
		int result = A[0];
		int tmpSum  = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i]>= 0 ) {
				if (tmpSum < 0) {
					tmpSum = A[i];
				} else {
					tmpSum += A[i];
				}			
			}else {
				if (tmpSum+A[i]<=0) {
					tmpSum = A[i];
				} else {
					tmpSum += A[i];
				}
			}
			if (tmpSum > result) {
				result = tmpSum;
			}
		}
		return result;
	};
}
