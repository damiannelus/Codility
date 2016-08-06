public class FrogRiverOne {
	public static void main(String[] args) {
//		int[] A = {1,3,1,4,2,3,5,4}; int X = 5;
		int[] A = {3}; int X = 5;
		
		System.out.println(computeArrivalMoment(X, A));
	}

	private static int computeArrivalMoment(int X, int[] A) {
		boolean[] auxArr = new boolean[X];
		int finalMoment = -1;
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= X) {
				if (auxArr[A[i]-1] == false) {
					auxArr[A[i]-1] = true;
					finalMoment = i;
				}
			}
		}
		for (boolean b : auxArr) if(!b) return -1;
		return finalMoment;
	}
}
