import java.util.Scanner;
import java.util.Locale;

public class ex6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int div = 1;
		
		for (int i=1; i<=n; i++) {
			div = n % i;
			if (div == 0) {
				System.out.println(i);
			}
			}
		
		sc.close();
		
		}
	}