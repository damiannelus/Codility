
public class MaxDoubleSliceSum {

	public static void main(String[] args) {
//		int[] A = {3,2,6,-1,4,5,-1,2}; //17
//		int[] A = new int[100000]; for (int i = 0; i < A.length; i++) {A[i] = 1;};
		int[] A = new int[100000]; for (int i = 0; i < A.length; i++) {A[i] = 1;};
//		int[] A = {-2,-7,-5,-3,-4};
//		int[] A = {3,2,5};
//		int[] A = {1,2,-10,21,5,-2,7};
//		int[] A = {1,2,3,1,4,5,6};
//		int[] A = {-2, -3, -4, 1, -5, -6, -7}; //1
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
		int result = 0;
		int tmpMin = A[1];
		int tmpSum = 0;
		for (int i = 1; i < A.length-1; i++) {
			tmpSum += A[i];
			if (tmpMin > A[i]) {
				tmpMin = A[i];
			}
			if (tmpSum < 0) {
				tmpSum = A[i];
				tmpMin = 0;
			}
			if (tmpSum - tmpMin > result) {
				result = tmpSum - tmpMin;
			}
		}
		return result;
	};
}
