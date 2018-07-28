package selenium.page.ebay;

public class Main {

	public static void main(String args[]) {
		Car c1  = new Car(2004,"Peugeot");
		Car c2 = new Car(2012,"FIAT");
		Car c3 = new Car(2012,"FIAT");
		
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
	}
}
