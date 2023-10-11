package TreeSetCustomObject;
import java.text.DecimalFormat;
import java.util.*;

public class TreeSetCarExample {
	public static void main(String[] args)
	{
		TreeSet<Car> set = new TreeSet<Car>();

		Car c1 = new Car(132, "BMW", "Rajkot", 35);
		Car c2 = new Car(269, "Audi", "Surat", 20);
		Car c3 = new Car(560, "Kia", "Vadodara", 15);
		Car c4 = new Car(109, "Creta", "Ahmedabad", 26);
		Car c5 = new Car(109, "Creta", "Ahmedabad", 26);

		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);

		Iterator itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(100/20));
		}  
		}
	}


