import java.util.Scanner;
import java.util.Locale;

public class ex6 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double pi = 3.14159;
		
		//a)
		System.out.printf("TRIANGULO: %.3f%n", A * C / 2);
		
		//b)
		System.out.printf("CIRCULO: %.3f%n", pi * Math.pow(C, 2));
		
		//c)
		System.out.printf("TRAPEZIO: %.3f%n", (A + B) * C / 2);
		
		//d)
		System.out.printf("QUADRADO: %.3f%n", B * B);
		
		//e)
		System.out.printf("RETANGULO: %.3f%n", A * B);
		
	}

}