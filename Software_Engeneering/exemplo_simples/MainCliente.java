// Importando o scanner para o usuario digitar no console os dados

import java.util.Scanner;

// Classe main
public class MainCliente {

	private static Scanner in;
	
	// Chamando a main
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		// Solicitando ao usuario que ele digite o valor dos atributos
		
		System.out.println("Digite o nome: ");
		String nome = in.next();
		
		System.out.println("Digite o cpf: ");
		String cpf = in.next();
		
		System.out.println("Digite a idade: ");
		int idade = in.nextInt();
		
		System.out.println("Digite o valor da compra: ");
		double valor_compra = in.nextDouble();
		
		// Instanciando atributo
		Cliente nutty = new Cliente(nome, cpf, idade, valor_compra);
		
		// Chamando os métodos da classe Cliente
		nutty.FormatacaoDados(nutty.nome);
		System.out.println("--------------DADOS CLIENTE------------");
		nutty.Mostrar();
		System.out.println();
		nutty.DescontoIdade(idade,valor_compra);
		
		System.out.println("\nAtualizar idade:");
		nutty.AtualizarDados(in.nextInt());
		System.out.println("\nAtualizar o valor da compra:");
		nutty.AtualizarDados(in.nextDouble());
		
		nutty.DescontoIdade(idade, valor_compra);
	}
}
