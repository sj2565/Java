package pkg03;
import java.util.*;

public class Switch07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int x = sc.nextInt();
		
		switch(x) {
		case 1: case 3: case 5:
			System.out.println("Ȧ��");
			break;
		case 2: case 4: case 6:
			System.out.println("¦��");
			break;
		default: // if�������� else(������)
			System.out.println("1 ~ 6 ������ ������ �Է��ϼ���");
		} // case 1:
	}     // 	System.out.println("Ȧ��");
}		  // case 2:
          // 	System.out.println("¦��");  �̷������� �ᵵ ��
