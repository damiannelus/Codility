
public class FrogJmp {
	public static void main(String[] args) {
//		int x=10, y = 85, d=30; //given example
//		int x=2, y = 2, d=2; //given example
		int x=2, y = 3, d=200000000; //given example
		
		
		System.out.println(calculateJmpNumber(x, y, d));
	}

	private static int calculateJmpNumber(int X, int Y, int D) {
		return (int) Math.ceil(((double)Y - (double)X) / D);
		
	}
}
