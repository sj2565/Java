package pkg02;

public class OperatorEx04 {

	public static void main(String[] args) {	
		int n1 = 10, n2 = 10, n3, n4, val = 10, z;
		
		n3 = ++n1;
		n4 = n2++;
		// z = val + ++val + val + val++ + val + val-- + --val;
		System.out.println(n1 + ", " +n2);
		System.out.println(n3 + ", " +n4);
		
		System.out.println(val + ++val + val + val++ + val + val-- + --val);// 10+11+11+11+12+12-1+11
		System.out.println("val = " +val); // 10
	}
}
