import java.util.HashMap;

public class EquiLeader {
	public static void main(String[] args) {
//		int[] A = {4,3,4,4,4,2};
//		int[] A = {};
		int[] A = {1,2};
		System.out.println(solution(A));
	}
	public static int solution(int[] A){
		int lL = -1;
		int rL = -1;
		int[] lArray;
		int[] rArray;
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			lArray = new int[i+1];
			rArray = new int[A.length-i-1];
			System.arraycopy(A, 0, lArray, 0, i+1);
			lL = findLeader(lArray);
			System.arraycopy(A, i+1, rArray, 0, A.length-1-i);
			rL = findLeader(rArray);
			if (rL == lL && rL != -1) {
				result++;
			}
		}
		return result;
	};
	
	public static int findLeader(int[] A){
		HashMap<Integer, Integer> stacks = new HashMap<Integer, Integer>();
		int tmp = 0;
		int limit = A.length/2 + 1;
		for (int i = 0; i < A.length; i++) {
			if (stacks.containsKey(A[i])) {
				tmp = stacks.get(A[i])+1;
				stacks.put(A[i], tmp);
			} else {
				tmp = 1;
				stacks.put(A[i], 1);
			}
			if (tmp >= limit) {
				return A[i];
			}
		}
		return -1;
	}
}
