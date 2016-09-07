import java.util.Arrays;

public class Triangle {
	public static void main(String[] args) {
//		int[] A = {10, 2, 5, 1, 8, 20};
//		int[] A = {10, 50, 5, 1};
		int[] A = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
		
		System.out.println(solution(A));
	}
	
	static public int solution(int[] A){
		Arrays.sort(A);
		for (int i = 0; i < A.length-2; i++) {
			if((long)A[i] + (long)A[i+1]>(long)A[i+2]) return 1;
		}
		return 0;
	};
}
