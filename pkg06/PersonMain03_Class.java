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
		System.out.println("이름 : " +name);
		System.out.println("키 : " +height);
		System.out.println("몸무게 : " +weight);
		System.out.println("취미 : " +hobby);
		System.out.println("혈액형 : " +blood);
	}
}