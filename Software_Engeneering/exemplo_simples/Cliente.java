//Classe Cliente com os atributos dele
public class Cliente {

	String nome;
	String cpf;
	int idade;
	double valor_compra;
	
	// Construtor da classe Cliente
	public Cliente(String nome, String cpf, int idade, double valor_compra) {
		
		// Aqui temos algumas verificações para os atributos
		if(nome.isEmpty()) {
			System.out.println("Campo nome Vazio");
			throw new IllegalArgumentException();
		}
		
		else if(idade<=14 || idade>130) {
			System.out.println("Idade invalida.");
			throw new IllegalArgumentException();
		}
		
		else if(valor_compra<=0) {
			System.out.println("Valor inválido.");
			throw new IllegalArgumentException();
		}
		
		
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.valor_compra = valor_compra;
	}
	
	// Sobrecarga de métodos
	public void AtualizarDados(int idade) {
		this.idade = idade;
		System.out.println("Idade atualizada: "+ idade);
	}
	
	public void AtualizarDados(double valor_compra) { 
		this.valor_compra = valor_compra;
		System.out.printf("Salário atualizado: R$ "+ valor_compra);
	}
	
	// Método que verifica a % de desconto para o cliente de acordo com a idade dele
	public void DescontoIdade(int idade, double valor_compra) {
		if (idade <= 25){
			valor_compra -= (valor_compra*10)/100;
		}
		else if (idade > 25 && idade < 40){
			valor_compra -= (valor_compra*18)/100;
		}
		else {
			valor_compra -= (valor_compra*30)/100;
		}
		
		System.out.println("O valor da compra agora com o desconto é de: R$ "+ valor_compra+"\n");
	}
	
	// Método que deixa a primeira letra do nome em maiúscula
	public void FormatacaoDados(String nome) {
		this.nome = nome.substring(0,1).toUpperCase().concat(nome.substring(1));
	}
	
	// Método que mostra os atributos da classe
	public void Mostrar() {
		System.out.println("Nome da Pessoa: "+nome);
		System.out.println("Idade: "+idade+" anos");
		System.out.printf("Valor da compra: R$ "+valor_compra,"%0.2");
	}
	
}
