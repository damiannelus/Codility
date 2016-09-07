import java.util.Arrays;

public class Distinct {
	public static void main(String[] args) {
//		int[] A = {2,1,1,2,3,1};
//		int[] A = {};
		int[] A = {1};
		System.out.println(solution(A));
	}
	
	static public int solution(int[] A){
		int result = 0;
		if (A.length == 0) {
			return 0;
		} else {
			result++;
		}
		Arrays.sort(A);
		for (int i = 0; i < A.length-1; i++) {
			if(A[i]!=A[i+1]) result++;
		}		
		return result;
	};
}
