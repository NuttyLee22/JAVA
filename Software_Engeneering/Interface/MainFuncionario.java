package avaliacao;
import java.util.Scanner;

// Main
public class MainFuncionario {

	public static void main(String[] args) {
		
		// Inst�ncia do leitor de dados
		Scanner ler = new Scanner(System.in);
		
		// Inst�ncia da classe Endere�o
		Endereco ender = new Endereco();
		
		
		// Entrada de dados Funcion�rio
		System.out.println("Nome: ");
		String nome = ler.nextLine();
		
		System.out.println("Idade: ");
		int idade = ler.nextInt();
		
		System.out.println("Celular: ");
		String celular = ler.next();
		
		System.out.println("Email: ");
		String email = ler.next();
		
		
		// Entrada de dados Mensalista
		System.out.println("Sal�rio: ");
		Double salario = ler.nextDouble();
		
		// Inst�ncia da sub-classe Mensalista
		Mensalista mst = new Mensalista(nome,idade,celular,email,salario,ender);
		
		// M�todos
		mst.AumentoSalario(salario);
		mst.Mostrar();
		ender.mostrarEndereco();
	}
}
