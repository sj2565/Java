package pkg10;
import java.util.*;

public class HaksengDao {
	
	public void Display(List<Hakseng> student) {
		System.out.println("��� ���");
		System.out.println("�̸�\t�г�\t��\t����\t����\t����" );
		
		for(Hakseng stu: student) { // Ÿ�� �ܼ�: ����
			String name = stu.getName();
			int grade = stu.getGrade();
			int ban = stu.getBan();
			int kor = stu.getKor();
			int eng = stu.getEng();
			int math = stu.getMath();
			
			String imsi = name + "\t" + grade + "\t" + ban + "\t" 
						+ kor + "\t" + eng + "\t" + math + "\t";
			System.out.println(imsi);
		}
	}
}