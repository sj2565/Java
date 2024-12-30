package pkg02;

public class PlusMinus02 {

	public static void main(String[] args) {
		int x = 6, y = 7, z;
		
		z = x++ + --y;
		
		System.out.println("x : " +x);
		System.out.println("y : " +y);
		System.out.println("z : " +z);
		
		z += ++x + y--;
		
		System.out.println("x : " +x);
		System.out.println("y : " +y);
		System.out.println("z : " +z);
	}
}
