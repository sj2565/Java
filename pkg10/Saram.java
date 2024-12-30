package pkg10;

public class Saram {
	public String name;
	public String address;
	
	public Saram(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return this.name + " / " +this.address;
	}
}