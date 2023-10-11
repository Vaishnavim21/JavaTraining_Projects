package TreeSetCustomObject;

public class Car implements Comparable<Car> {

	int Modelno;
	String name, city;
	int stock;

	// Car constructor
	public Car(int Modelno, String name, String city,
			int stock)
	{
		this.Modelno = Modelno;
		this.name = name;
		this.city = city;
		this.stock = stock;
	}

	public int compareTo(Car c)
	{
		if (stock > c.stock) {
			return 1;
		}
		else if (stock < c.stock) {
			return -1;
		}
		else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Car [Modelno=" + Modelno + ", name=" + name + ", city=" + city + ", stock=" + stock + "]";
	}
	
	

}
