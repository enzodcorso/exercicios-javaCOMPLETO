
public class Retangulo {
	
	public double lado;
	public double altura;
	
	public double area() {
		return lado * altura;
	}
	public double perimetro() {
		return 2 * (lado + altura);
	}
	public double diagonal() {
		return Math.sqrt(Math.pow(lado, 2) + Math.pow(altura, 2));
	}
}

