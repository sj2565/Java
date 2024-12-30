package pkg10;

public class Car {
	private String Month;
	private int Day;
	private String Eng;
	
	public Car(String Month, int Day, String Eng) {
		this.Month = Month;
		this.Day = Day;
		this.Eng = Eng;
	}

	public String getMonth() {
		return Month;
	}

	public int getDay() {
		return Day;
	}

	public String getEng() {
		return Eng;
	}
}