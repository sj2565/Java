package pkg02;

public class OperatorEx {

	public static void main(String[] args) {
		int x, y, z;
		x = 11;
		y = 8;
		z = -2;
		int max = x > y ? x : y;
		max = max > z ? max : z;
		
		int min = x > y ? y : x;
		min = min > z ? z : min;
		
		System.out.println("Max : " +max);
		System.out.println("Min : " +min);
	}
}
