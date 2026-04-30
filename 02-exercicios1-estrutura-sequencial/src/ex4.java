import java.util.Scanner;
import java.util.Locale;

public class ex4 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		double horas = sc.nextDouble();
		double valorHoras = sc.nextDouble();
		double SALARIO = (horas * valorHoras);
		
		System.out.println("NUMBER = " + numero);
		System.out.println("SALARY = U$ " + SALARIO);
		
	}

}