package pkg07;

public class EmpSalary {
	public static void main(String[] args) {
		System.out.println("´ëÇ¥ ÀÌ»ç ÀÌ¸§ : " + Salary.ceoname);
		
		Employee hong = new Employee("È«±æµ¿", 10000, "¿µ¾÷");
		hong.Display();
		
		Employee hee = new Employee("¹Ú¿µÈñ", 5000, "±¸¸Å");
		hee.Display();
		
		Employee soo = new Employee("±èÃ¶¼ö",  "±¤°í");
		soo.Display();
	}
}
