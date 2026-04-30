import java.util.Scanner;
import java.util.Locale;

public class ex2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int contIn = 0;
		int contOut = 0;
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				contIn = contIn + 1;
			} else {
				contOut = contOut + 1;
			}	
		}
		
		System.out.println(contIn + " In");
		System.out.println(contOut + " Out");
		
		sc.close();
		
		}
	}