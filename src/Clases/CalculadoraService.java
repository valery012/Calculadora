package Clases;




public class CalculadoraService {
	private Calculadora calculadora;
	
	public CalculadoraService(Calculadora calculadora) {
	this.calculadora = calculadora;
	}
	
	public int sumar(int a, int b) {
	return calculadora.sumar(a, b);
	}
	
	public int restar(int a, int b) {
	return calculadora.restar(a, b);
	}
	
}