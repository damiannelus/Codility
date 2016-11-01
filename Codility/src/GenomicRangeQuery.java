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
	
	static class Point{
		public Point(int x, int val) {
			super();
			this.x = x;
			this.val = val;
		}
		int x;
		int val;
		
		public int getVal(){
			return this.val;
		}
		public int getX(){
			return this.x;
		}
	}
	

	private static int[] minimalImpactFactor(String S, int[] P, int[] Q) {
		int strL = S.length();
		int resL = P.length;
		int[] result = new int[resL];
		List<List<Point>> pointsMap = new ArrayList<List<Point>>();
		int[] auxVals = new int[strL];
		int tmpVal = 0;
		for (int i = 0; i < strL; i++) {
			tmpVal = getVal(S.charAt(i));
			pointsMap.add(new ArrayList<Point>());
			pointsMap.get(i).add(new Point(i,tmpVal));
			auxVals[i] = tmpVal;
			for (int j = 0; j <= i; j++) {
				if(auxVals[i-j] > tmpVal) {
					pointsMap.get(i-j).add(new Point(i,tmpVal));
					auxVals[i-j] = tmpVal;
				}
			}
		}
		for (int i = 0; i < resL; i++) {
			result[i]= getMinimal(pointsMap.get(P[i]), Q[i]);
		}
		return result;
	}
	
	private static int getVal(char charAt) {
		switch (charAt) {
		case 'A':
			return 1;
		case 'C':
			return 2;
		case 'G':
			return 3;
		default:
			return 4;
		}
	}

	private static int getMinimal(List<Point> list, int i) {
		for (int j = list.size()-1; j >= 0; j--) {
			if(i >= list.get(j).getX()) return list.get(j).getVal();
		}
		return 5;
	}

	private static void verbose(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
}
