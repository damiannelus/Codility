
public class CyclicRotation {

	public static void main(String[] args) {
//		int[] A = {3,8,9,7,6}; int K = 3;
		int[] A = {5, -1000}; int K = 1;
//		int[] A = {5, -1000, 7, 9, 13};
		
		solution(A, K);
	}

	public static int[] solution(int[] A, int K) {
		//TODO: PRZYPADKI TESTOWE
		if (!validateInput(A, K)) {
			verbose(A);
			return A;
		}
		verbose(A);
		K=K%A.length;
		System.out.println(K);
		int length = A.length - K;
		int[] left = new int[K];
		int[] right = new int[length];
		System.arraycopy(A, length, left, 0, K);
		verbose(left);
		System.arraycopy(A, 0, right, 0, length);
		verbose(right);
		System.arraycopy(left, 0, A, 0, K);
		System.arraycopy(right, 0, A, K, length);
		verbose(A);
		return A;
	}

		private static boolean validateInput(int[] a, int k) {
			if(a.length > 100 || a.length < 2 || k > 100 || k < 1) return false; //max K and N.
			return true;
		}

	private static void verbose(int[] a) {
		System.out.println("-------");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}
