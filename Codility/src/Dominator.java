
public class Dominator {
	public static void main(String[] args) {
//		int[] A = {3,4,3,2,3,-1,3,3};
//		int[] A = {3,3,3,3,3,3,3,3,3,3};
//		int[] A = {1,2};
//		int[] A = {};
//		int[] A = {1};
//		int[] A = {1,2,3};
		int[] A = {1,2,1};
//		int[] A = {3,4,4,4,3,3,3,3,3,3,3,3,3};
//		int[] A = {2,1,1,3,4};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
		switch (A.length) {
		case 0:
			return A.length-1;
		case 1:
			return A.length-1;
		case 2:
			if (A[0] == A[1]) {
				return 0;
			} else {
				return -1;
			}
		case 3:
			return leaderFrom3(A);
		default:
			int leader = -1;
			int[] stack = new int[A.length/2 + 1];
			int stackPtr = 1;
			stack[stackPtr] = A[0];
			for (int i = 1; i < A.length; i++) {
				stack[stackPtr] = A[i];
				if(stackPtr > 0){
					if (stack[stackPtr] == stack[stackPtr-1]) {
						stackPtr++;
						leader = i;
					} else {
						stackPtr--;
						leader = -1;
					}
				}
			}
			return leader;
		}
	}

	private static int leaderFrom3(int[] a) {
		if(a[0] == a[1] || a[1] == a[2] || a[2] == a[0]) return 1;
		return -1;
	};
}
