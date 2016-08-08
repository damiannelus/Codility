
public class CountDiv {
	public static void main(String[] args) {
//		int A = 0; int B=13; int K=2;
//		int A = 0; int B=2000000000; int K=1;
//		int A = 11; int B=345; int K=17; // 20
		int A = 10; int B=10; int K=5; // 1
		System.out.println(solution(A,B,K));
		
	}
	
	public static int solution(int A, int B, int K) {
		int aVal = (A%K==0) ? 1 : 0;
		return B/K - A/K + aVal;
	}
}
