import java.util.Scanner;
import java.util.Locale;

public class ex1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo r = new Retangulo();
		
		System.out.println("Enter rectangle width and height: ");
		r.lado = sc.nextDouble();
		r.altura = sc.nextDouble();
		System.out.println("AREA = " + r.area());
		System.out.println("PERIMETER = " + r.perimetro());
		System.out.println("DIAGONAL = " + r.diagonal());
		
		sc.close();
		
		}
	}