package pkg06;

public class SaramMain03 {

	public static void main(String[] args) {
		// ���۷��� ���� 2��(saram, hee)
		Saram03 saram = new Saram03(); 
		Saram03 hee = new Saram03(); 
		
		saram.nationality = "���ѹα�";
		// saram.name = "ȫ�浿";
		saram.setName("ȫ�浿");
		saram.setHeight(150.5);
		//saram.weight = 75; => private Ű����� ���� ���� ������ �Ұ���.
		saram.setWeight(75.15);	// ���� ���� 
		saram.setHobby("�");
		saram.setBlood("A");
		
		saram.Display(); // ���� �޼ҵ忡 Display�޼ҵ� ȣ��.
	}
}