public class NumberOfDiscIntersections {
	public static void main(String[] args) {
//		int[] A = {1,5,2,1,4,0};
//		int[] A = {1, 2147483647, 0};
		int[] A = {1, 5, 8, 7, 8, 4, 8, 5, 0, 5};
		System.out.println(solution(A));
	}
	
	static public int solution(int[] A){
		int result = 0;
		long[][] begg = new long[A.length][2];
		for (int i = 0; i < A.length; i++) {
			begg[i][0] = (long)i - (long)A[i];
			begg[i][1] = (long)i + (long)A[i];
		}
		mergeSort(begg);
		int bLen = begg.length;
		for (int i = 0; i < begg.length; i++) {
			for (int j = i; j < begg.length-1; j++) {
				if (begg[i][1]>=begg[j+1][0] && begg[i][0]<=begg[j+1][1] ) {
					result++;
				}else if (result>10000000) return -1;
			}
		}
		return result;		
	};
	
	public static void mergeSort(long[][] inputArray) {
        int size = inputArray.length;
        if (size < 2)
            return;
        int mid = size / 2;
        int leftSize = mid;
        int rightSize = size - mid;
        long[][] left = new long[leftSize][2];
        long[][] right = new long[rightSize][2];
        for (int i = 0; i < mid; i++) {
            left[i] = inputArray[i];
        }
        for (int i = mid; i < size; i++) {
            right[i - mid] = inputArray[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, inputArray);
    }

    public static void merge(long[][] left, long[][] right, long[][] arr) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i][0] <= right[j][0]) {
            	arr[k++] = left[i++];
            } else {
            	arr[k++] = right[j++];
            }
        }
        while (i < leftSize) {
        	arr[k++] = left[i++];
        }
        while (j < leftSize) {
        	arr[k++] = right[j++];
        }
    }
}