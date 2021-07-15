package avaliacao;

// SubClasse Horista
public class Horista extends Funcionario{

	double comissao;
	double comissaoTotal;
	int horasTrabalhadas;
	
	// Construtor da sub-classe Horista
	public Horista(String nome, int idade, String celular, String email, Endereco ender, double comissao, double comissaoTotal, int horasTrabalhadas) {
		super(nome, idade, celular, email, ender);
		
		if(comissao<=0 ) {
			System.out.println("Comiss�o inv�lida");
			throw new IllegalArgumentException();
		}
		
		// Atributos
		this.comissao = comissao;
		this.comissaoTotal = comissaoTotal;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	// M�todo que calcula a comiss�o do Horista
	public void CalcularComissao(double comissao, double comissaoTotal, int horasTrabalhada) {
		comissaoTotal = comissao * horasTrabalhadas;
	}
	
	// M�todo que mostra os atributos do Horista
			public void Mostrar() {
				System.out.println("Nome do Funcion�rio: "+getNome());
				System.out.println("Idade: "+getIdade()+" anos");
				System.out.println("Telefone: "+getCelular());
				System.out.println("Email: "+getEmail());
				System.out.println("");
				System.out.printf("Comiss�o: R$ "+comissao,"%0.2");
				System.out.printf("Horas trabalhadas: "+horasTrabalhadas);
				System.out.printf("Comiss�o Total: R$ "+comissaoTotal,"%0.2");
				System.out.println("");
			}

}
