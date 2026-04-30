package ex3;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		
		s.name = sc.nextLine();
		s.grade1 = sc.nextDouble();
		s.grade2 = sc.nextDouble();
		s.grade3 = sc.nextDouble();
		double points = 60 - s.finalGrade();
		
		if (s.finalGrade() >= 60) {
			System.out.println("FINAL GRADE = " + s.finalGrade());
			System.out.println("PASS");
		} else {
			System.out.println("FINAL GRADE = " + points);
			System.out.println("FAILED");
			System.out.println("MISSING " + points + " POINTS");
		}
		
		sc.close();
		
		}
	}