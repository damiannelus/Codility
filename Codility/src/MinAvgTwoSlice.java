
public class MinAvgTwoSlice {

	public static void main(String[] args) {
//		int[] A = {4,2,2,5,1,5,8};
//		int[] A = {1,99,2,5,5,1,8};
		int[] A = {-3, -5, -8, -4, -10};
//		int[] A = {4,2,2,5,1,5};
		System.out.println(solution(A));
		
	}
	
	public static int solution(int[] A){
		int minPos = -1;
		double tmpMin2;
		double tmpMin3;
		double min = Double.MAX_VALUE;
		for (int i = 0; i < A.length-2; i++) {
			tmpMin2 = (A[i] + A[i+1])/(double)2;
			if (tmpMin2 < min) {
				min = tmpMin2;
				minPos = i;
			}
			tmpMin3 = (A[i] + A[i+1] + A[i+2])/(double)3;
			if (tmpMin3 < min) {
				min = tmpMin3;
				minPos = i;
			}
		}
		tmpMin2 = (A[A.length-2] + A[A.length-1])/(double)2;
		if (tmpMin2 < min) {
			min = tmpMin2;
			minPos = A.length-2;
		}
		return minPos;
	};
}
