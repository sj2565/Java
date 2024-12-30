package pkg06;

public class PersonMain03 {

	public static void main(String[] args) {
		PersonMain03_Class saram = new PersonMain03_Class();
		
		saram.name = "홍길동";
		saram.height = 185.5;
		saram.setWeight(91.57);
		saram.hobby = "운동";
		saram.blood = "A형";
				
		saram.Display();
	}
}
