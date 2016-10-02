
public class Nesting {

	public static void main(String[] args) {
//		String S = "(()(())())";
//		String S = "())";
		String S = ")(";
		System.out.println(solution(S));
	}
	
	public static int solution(String S) {
		char[] charArray = S.toCharArray();
		int equilibrium = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '(') {
				equilibrium++;
			}else equilibrium--;
			if(equilibrium<0) return 0;
		}
		if (equilibrium==0) {
			return 1;
		} else {
			return 0;
		}
	}
}
