package pkg10;
import java.util.*;

public class HaksengDao {
	
	public void Display(List<Hakseng> student) {
		System.out.println("목록 출력");
		System.out.println("이름\t학년\t반\t국어\t영어\t수학" );
		
		for(Hakseng stu: student) { // 타입 단수: 복수
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