package pkg04;

public class Method03 {

	public static void main(String[] args) {
		int n = 10;
		sum(n);
	}
	
	static void sum(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += i; 
		}
		System.out.println("����� : " +result);
	}
}

/** return���� ��ȯ �� �� 
 
package pkg04;

public class Method03 {

	public static void main(String[] args) {
		int n = 10;
		int result = sum(n);
		System.out.println("����� : " +result);
	}
	
	static int sum(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += i; 
		}
		return result;
	}
}
 */