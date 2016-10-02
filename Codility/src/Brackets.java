public class Brackets {
	public static void main(String[] args) {
//		String S = "{[()()]}";
//		String S = "([)()]";
		String S = ")(";
		System.out.println(solution(S));
	}

	private static int solution(String S) {
			char[] charArray = S.toCharArray();
			char[] stack = new char[charArray.length];
			int ptr =0;
			for (int i = 0; i < charArray.length; i++) {
				if (charArray[i] == '{' || charArray[i] == '[' || charArray[i] == '(') {
					stack[ptr] = charArray[i];
					ptr++;
				} else {
					if (ptr == 0) return 0;
					if (charArray[i]=='}' && stack[ptr-1] == '{' || charArray[i]==']' && stack[ptr-1] == '[' || charArray[i]==')' && stack[ptr-1] == '(') {
						ptr--;
					} else {
						return 0;
					}
				}
			}
			if(ptr != 0) return 0;
			return 1;
	}
}
