import java.util.Locale;

public class Ex_fixacao {

	public static void main(String[] args) {
	
	String product1= "Computer";
	String product2= "Office desk";
	
	int age = 30;
	int code = 5290;
	char gender = 'F';
	
	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567;
	
	System.out.println("Products:");
	System.out.printf(product1 + ", which price is $ " + price1 + "%n");
	System.out.printf(product2 + ", which price is $ " + price2 + "%n");
	System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
	System.out.print("Measure with eight decimal places: ");
	System.out.printf("%.8f%n", measure);
	System.out.printf("%.3f%n", measure);
	Locale.setDefault(Locale.US);
	System.out.printf("%.3f%n", measure);
	
	}
}
