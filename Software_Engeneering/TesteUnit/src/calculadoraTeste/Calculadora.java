package calculadoraTeste;

public class Calculadora {

	public int soma(int a, int b) {
		return a+b;
	}
	
	public int subtracao(int a, int b) {
		return a-b;
	}
	
	public double multiplicacao(int a, int b) {
		return a*b;
	}
	
	public double divisao(int a, int b) {
		if(b==0) {
			return 0;
		}
			return a/b;
	}
}
