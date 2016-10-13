import java.util.HashMap;
import java.util.Map;

public class Dominator {
	public static void main(String[] args) {
//		int[] A = {3,4,3,2,3,-1,3,3};
//		int[] A = {3,3,3,3,3,3,3,3,3,3};
		int[] A = {1,2};
//		int[] A = {};
//		int[] A = {1};
//		int[] A = {1,2,3};
//		int[] A = {1,2,1};
//		int[] A = {3,4,4,4,3,3,3,3,3,3,3,3,3};
//		int[] A = {2,1,1,3,4};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
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
				return i;
			}
		}
		return -1;
	}

	private static int leaderFrom3(int[] a) {
		if(a[0] == a[1] || a[1] == a[2] || a[2] == a[0]) return 1;
		return -1;
	};
}
