package ex4;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conversor c = new Conversor();
		
		System.out.print("Whats is the dollar price? ");
		c.precoDolar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		c.quantidadeDolar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", c.quantidadeReal());
		
		sc.close();
		
		}
	}