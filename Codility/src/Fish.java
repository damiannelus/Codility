
public class Fish {
	public static void main(String[] args) {
		int[] A = {4,3,2,1,5}; int [] B = {1,1,0,0,0};
		
		System.out.println(solution(A, B));
	}
	
	public static int solution(int[] A, int[] B){
		int n = A.length;
		int[] leftQueue = new int[n];
		int leftPtr = 0;
		int[] rightQueue = new int[n];
		int rightPtr = 0;
		for (int i = 0; i < A.length; i++) {
			if (B[i]==0) {
				leftQueue[leftPtr] = A[i];
				leftPtr++;
			} else {
				rightQueue[rightPtr] = A[i];
				rightPtr++;
			}
			if (B[i]==0) {
				while(rightPtr>0){
					if(A[i]>rightQueue[rightPtr-1]){
						rightPtr--;
					}else {
						leftPtr--;
						break;
					}
				}
			}
		}
		return leftPtr + rightPtr;
	};
}
