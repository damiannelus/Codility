
public class MaxProfit {
	
	public static void main(String[] args) {
		int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
//		int[] A = {};
		System.out.println(solution(A));
	}
	public static int solution(int[] A){
		int min = 0;
		int minCandidate = min;
		int result = 0;
		if (A.length > 1) {
			for (int i = 0; i < A.length; i++) {
				if (A[i] < A[min] && A[i] < A[minCandidate]) {
					minCandidate = i;
				}
				if(A[i] - A[min] > result){
					result = A[i] - A[min];
				}
				if(A[i] - A[minCandidate] > result){
					result = A[i] - A[minCandidate];
					min = minCandidate;
				}
			}
		} else {
			return result;
		}
		return result;
	};
}
