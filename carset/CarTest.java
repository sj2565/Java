package carset;
import java.util.Random;

public class CarTest {
	public static void main(String[] args) {
		Car[] mycar = new Car[2] ;
		Random rand = new Random() ; 
		
		mycar[0] = new Tico("티코", 100, "작은 차") ;
		mycar[1] = new Cube("큐브", 200, 1.5) ;
		
		for (int i = 0; i < mycar.length; i++) {
			System.out.println("==========================");
			int val = rand.nextInt(20) + 10 ;
			mycar[i].speedup(val);
			mycar[i].display();
			
			val = rand.nextInt(20) + 10 ;
			mycar[i].speedup(30); //30추가
			mycar[i].display();
			
			val = rand.nextInt(val) + 10 ;
			mycar[i].speeddown(val); 
			mycar[i].display();
			System.out.println(mycar[i]);			
		}
	}
}