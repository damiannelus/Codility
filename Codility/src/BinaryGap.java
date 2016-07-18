
public class BinaryGap {
	
//	TODO:dodaæ obs³ugê GIT'a
//	TODO:przekazywaæ obiekt miêdzy metodami
//	TODO:zrobiæ testy.

	
	public static void main(String[] args) {
		int[] inputValues, outputValues;
		long startDate, finishDate;
		
		//file open
		///exception handling
		//start time
		System.out.println(calculateBinaryGap(82));
		//end time
		//print results
	}

	private static int calculateBinaryGap(int i) {
		String binaryRepresenation;
		int maxGapLength = 0, startIndex, endIndex;
		binaryRepresenation = Integer.toBinaryString(i);
		maxGapLength = findNextGap(0,0,maxGapLength,binaryRepresenation);
		return maxGapLength;	
	}

	private static int findNextGap(int startIndex, int endIndex, int maxGapLength, String binaryRepresenation) {
		System.out.println(binaryRepresenation);
		int localGapLength;
		while (binaryRepresenation.indexOf("10", startIndex) != -1 && binaryRepresenation.indexOf("01", endIndex) != -1) {
			startIndex = binaryRepresenation.indexOf("10", startIndex);
//			System.out.println("startIndex " + startIndex);
			endIndex = binaryRepresenation.indexOf("01", endIndex);
//			System.out.println("endIndex " + endIndex);
			localGapLength = findNextGap(startIndex+1, endIndex+1, maxGapLength, binaryRepresenation);
			if (localGapLength > maxGapLength) maxGapLength = localGapLength;
			System.out.println(maxGapLength);
			return maxGapLength;
		}
		return 0;	
	}
}
