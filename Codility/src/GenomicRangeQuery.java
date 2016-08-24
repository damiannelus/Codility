import java.util.ArrayList;
import java.util.List;

public class GenomicRangeQuery {

	public static void main(String[] args) {
//		String S = "CAGCCTA"; int[] P = {2,5,0}; int[] Q = {4,5,6};
		String S = "A"; int[] P = {0}; int[] Q = {0};
		int[] result;
		result = minimalImpactFactor(S, P, Q);
		verbose(result);
	}

	private static int[] minimalImpactFactor(String S, int[] P, int[] Q) {
		int strL = S.length();
		int resL = P.length;
		int[] result = new int[resL];
		List<List<Integer>> positionMappings = new ArrayList<List<Integer>>();
		positionMappings.add(new ArrayList<Integer>());
		positionMappings.add(new ArrayList<Integer>());
		positionMappings.add(new ArrayList<Integer>());
		for (int i = 0; i < strL; i++) {
			switch (S.charAt(i)) {
			case 'A':
				positionMappings.get(0).add(i);
				break;
			case 'C':
				positionMappings.get(1).add(i);
				break;
			case 'G':
				positionMappings.get(2).add(i);
				break;
			default:				
				break;
			}
		}
		for (int i = 0; i < resL; i++) {
			result[i] = getMinimalForPair(P[i],Q[i], positionMappings);
		}
		
		return result;
	}

	private static int getMinimalForPair(int i, int j, List<List<Integer>> positionMappings) {
		List<Integer> tmpMaps = new ArrayList<Integer>();
		int tmpPosition = 0;
		for (int k = 0; k < positionMappings.size(); k++) {
			tmpMaps = positionMappings.get(k);
			for (int k2 = 0; k2 < tmpMaps.size(); k2++) {
				tmpPosition = tmpMaps.get(k2);
				if (i <= tmpPosition && j >= tmpPosition) {
					return k+1;
				}
			}
		}
		return 4;
	}

	private static void verbose(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
}
