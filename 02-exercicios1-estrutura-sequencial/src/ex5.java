import java.util.Scanner;
import java.util.Locale;

public class ex5 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		sc.nextInt();
		int qntPeca1 = sc.nextInt();
		double vlrPeca1 = sc.nextDouble();
		double peca1 = qntPeca1 * vlrPeca1;
		sc.nextInt();
		int qntPeca2 = sc.nextInt();
		double vlrPeca2 = sc.nextDouble();
		double peca2 = qntPeca2 * vlrPeca2;
		double total = peca1 + peca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
		
	}

}