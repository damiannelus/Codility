
public class StoneWall {
	
	public static void main(String[] args) {
		int[] H = {8,8,5,7,9,8,7,4,8};
//		int[] H = {8,8,8,8,8,8,8,7};
//		int[] H = {1};
//		int[] H = {2,3,2,1};
		System.out.println(solution(H));
	}

	public static int solution(int[] H){
		int tmpHeight = 0;
		int result = 0;
		int[] foundation = new int[H.length+1];
		int foundationPtr = 0;
		foundation[foundationPtr] = 0;
		for (int i = 0; i < H.length; i++) {
			if (H[i] > tmpHeight ) {
				tmpHeight = H[i];
				foundationPtr++;
				foundation[foundationPtr] = H[i];				
				result++;
			}else if(H[i] < tmpHeight) {
				tmpHeight = H[i];
				while (foundation[foundationPtr] > H[i]) {
					foundationPtr--;
				}
				if (foundation[foundationPtr] != tmpHeight) {
					result++;
					foundationPtr++;
					foundation[foundationPtr] = tmpHeight;
				}
			}
		}
		return result;
	};
}
