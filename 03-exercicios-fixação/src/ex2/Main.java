package ex2;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario f = new Funcionario();
		
		System.out.println("Name: ");
		f.nome = sc.nextLine();
		
		System.out.println("Gross salary: " + f.salarioBruto);
		f.salarioBruto = sc.nextDouble();
		
		System.out.println("Tax: " + f.imposto);
		f.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + f);
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double porcentagem = sc.nextDouble();
        f.salarioAumento(porcentagem);
		
		System.out.println();
		System.out.println("Updated data: " + f);
		
		sc.close();
		
		}
	}