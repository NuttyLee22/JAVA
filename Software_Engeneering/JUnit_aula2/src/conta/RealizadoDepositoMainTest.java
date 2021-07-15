package conta;

public class RealizadoDepositoMainTest {

	public static void main(String[] args) {
		contaCorrente cc = new contaCorrente();
		cc.depositar(100.0);
		double saldoAtual = cc.consultaSaldo();
		
		System.out.println("Saldo Atual: "+ saldoAtual);
	}
}
