
public class BinaryGap {
	
//	TODO:zrobiæ testy.

	
	public static void main(String[] args) {
		int[] inputValues, outputValues;
		long startDate, finishDate;
		
		//file open
		///exception handling
		//start time
		for (int i = -10; i < 9; i++) {
			System.out.println("Dla i = " + i + " BinaryGap = " + calculateBinaryGap(i));
		}
		
		//end time
		//print results
	}

	private static int calculateBinaryGap(int i) {
		if(i < 1) return 0;
		int maxGapLength = 0, startIndex, endIndex;
		maxGapLength = findMaxGap(0,0,Integer.toBinaryString(i));
		return maxGapLength;	
	}

	private static int findMaxGap(int startIndex, int endIndex, String binaryRepresenation) {
		int maxGapLength = 0;
		int localGapLength;
		while (binaryRepresenation.indexOf("10") != -1 && binaryRepresenation.indexOf("01") != -1) {
			startIndex = binaryRepresenation.indexOf("10");
			endIndex = binaryRepresenation.indexOf("01");
			localGapLength = endIndex - startIndex;
			if (localGapLength > maxGapLength) maxGapLength = localGapLength;
			binaryRepresenation = binaryRepresenation.substring(endIndex+1);
		}
		return maxGapLength;	
	}
}
