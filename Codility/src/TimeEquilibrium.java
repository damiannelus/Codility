import java.util.Arrays;
import java.util.stream.IntStream;

public class TimeEquilibrium {

	public static void main(String[] args) {
//		int[] a = {3,1,2,4,3,3,1,2,4,3,3,1,2,4,3,3,1,2,4,3,3,1,2,4,3,3,1,2,4,3,1000,2,972}; //initial test vector
//		int[] a = {1,1}; //2 value test vector
//		int[] a = {3,1,2,4,3};
//		int[] a = {-1,1}; //2 value test vector
//		int[] a = {-10, -20, -30, -40, 100};
		int[] a = {5, 6, 2, 4, 1};
		
		System.out.println(calculateEquilibrium(a));
	}

	private static int calculateEquilibrium(int[] A) {
		int minDiff = Integer.MAX_VALUE;
		int leftSum = 0, rightSum = 0, absVal = 0;
		if(!validateInput(A)) return 0;
		for (int i = 1; i < A.length; i++) {
			rightSum += A[i];
		}
		leftSum = A[0];
		minDiff = Math.abs(leftSum-rightSum);
		for (int i = 2; i < A.length; i++) {
			rightSum -= A[i-1];
			leftSum += A[i-1];
			absVal = Math.abs(leftSum - rightSum);
			if(minDiff > absVal) minDiff = absVal;
		}
		return minDiff;
	}

	private static boolean validateInput(int[] a) {
		if(a.length < 2 || a.length > 100000) return false;
		return true;
	}
}
