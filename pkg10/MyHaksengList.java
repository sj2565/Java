package pkg10;
import java.util.*;

public class MyHaksengList {
	public static void main(String[] args) {
		List<Hakseng> student = new ArrayList<Hakseng>();
		
		Hakseng soo = new Hakseng("ȫ�浿", 1, 2, 30, 40, 50);
		
		student.add(soo);
		student.add(new Hakseng("�ڹڹ�", 7, 3, 70, 20, 40));
		student.add(new Hakseng("������", 10, 10, 10, 20, 60));
		
		System.out.println("��� ���� : " +student.size());
		
		HaksengDao dao = new HaksengDao();
		dao.Display(student);
	}
}