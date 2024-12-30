package pkg10;
import java.util.*;

public class CarDao {
	
	public void Display(List<Car> month) {
		System.out.println("월\t일수\t영어");
		System.out.println("");
		
		for(Car abc : month) {
			String Month = abc.getMonth();
			int Day = abc.getDay();
			String Eng = abc.getEng();
			
			String imsi = Month + "\t" + Day + "\t" + Eng +"\t" ;
			System.out.println(imsi);
		}
	}
}