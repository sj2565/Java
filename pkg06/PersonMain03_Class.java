package pkg06;

public class PersonMain03_Class {
	String name;
	double height; 
	private double weight;
	String hobby;
	String blood;
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void Display() {
		System.out.println("�̸� : " +name);
		System.out.println("Ű : " +height);
		System.out.println("������ : " +weight);
		System.out.println("��� : " +hobby);
		System.out.println("������ : " +blood);
	}
}