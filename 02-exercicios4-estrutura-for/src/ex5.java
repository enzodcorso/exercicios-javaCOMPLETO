import java.util.Scanner;
import java.util.Locale;

public class ex5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fatorial = 1;
		
		for (int i=1; i<=n; i++) {
			fatorial = fatorial * i;
			}
		
		System.out.println(fatorial);
		
		sc.close();
		
		}
	}