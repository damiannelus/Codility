
public class PassingCars {
	public static void main(String[] args) {
		int[] A = {0,1,0,1,1}; //5
		
		System.out.println(countPasses(A));
	}

	private static int countPasses(int[] A) {
		int onesCounter = 0;
		int completeCounter = 0;
		for (int i = A.length-1; i >= 0; i--) {
			if(A[i]==1){
				onesCounter++;
			}else {
				completeCounter+=onesCounter;
			}
			if(completeCounter > 1000000000) return -1;
		}
		return completeCounter;
	}
}
