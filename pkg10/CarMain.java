package pkg10;
import java.util.*;

public class CarMain {

	public static void main(String[] args) {
		List<Car> month = new ArrayList<Car>();
		
		Car month1 = new Car("1��", 31, "January");
		Car month2 = new Car("2��", 28, "February");
		Car month3 = new Car("3��", 31, "March");
		Car month4 = new Car("4��", 30, "April");
		Car month5 = new Car("5��", 31, "May");
		Car month6 = new Car("6��", 30, "June");
	
		month.add(month1);
		month.add(month2);
		month.add(month3);
		month.add(month4);
		month.add(month5);
		month.add(month6);
		
		CarDao cd = new CarDao();
		cd.Display(month);
	}
}
