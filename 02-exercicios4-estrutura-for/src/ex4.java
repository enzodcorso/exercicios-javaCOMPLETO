import java.util.Scanner;
import java.util.Locale;

public class ex4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			if (n2 == 0) {
				System.out.println("divisao impossivel");
			} else {
			double div = n1 / n2;
			System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();
		
		}
	}