package avaliacao;
import java.util.Scanner;

// Main
public class MainFuncionario {

	public static void main(String[] args) {
		
		// Instância do leitor de dados
		Scanner ler = new Scanner(System.in);
		
		// Instância da classe Endereço
		Endereco ender = new Endereco();
		
		
		// Entrada de dados Funcionário
		System.out.println("Nome: ");
		String nome = ler.nextLine();
		
		System.out.println("Idade: ");
		int idade = ler.nextInt();
		
		System.out.println("Celular: ");
		String celular = ler.next();
		
		System.out.println("Email: ");
		String email = ler.next();
		
		
		// Entrada de dados Mensalista
		System.out.println("Salário: ");
		Double salario = ler.nextDouble();
		
		// Instância da sub-classe Mensalista
		Mensalista mst = new Mensalista(nome,idade,celular,email,salario,ender);
		
		// Métodos
		mst.AumentoSalario(salario);
		mst.Mostrar();
		ender.mostrarEndereco();
	}
}
