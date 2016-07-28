import java.util.Arrays;

public class OddOccurrencesInArray {
	public static void main(String[] args) {
//		int[] A = {9,4,9,5,5,4,6,6,1000000000};
//		int[] A = {9,4,9,5,5,4,6,6}; //parzysta liczba
		int[] A = {7,7,7,7,7,7,7,7,7,7,7,7,7,7}; //zera
		System.out.println(getOdd(A));
	}

	private static int getOdd(int[] a) {
		if(!validateInputArray(a)) return 0;
		Arrays.sort(a);
		for (int i = 0; i < a.length-1; i+=2) {
			if(a[i]!=a[i+1]) return a[i];
		}
		return a[a.length-1];
	}

	private static boolean validateInputArray(int[] a) {
		if (a.length%2==0) return false;
		return true;
		
	}
}
