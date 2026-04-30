import java.util.Scanner;
import java.util.Locale;

public class ex7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		for (int i=1; i<=n; i++) {
			int quadrado = i * i;
			int cubo = i * i * i;
			System.out.printf("%d %d %d%n", i, quadrado, cubo);
		}
		
		sc.close();
		
		}
	}