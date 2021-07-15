package avaliacao;

// SubClasse Mensalista
public class Mensalista extends Funcionario {
	
	private double salario;
	private double salarioAumentado;
	
	// Construtor da sub-classe Mensalista
	public Mensalista(String nome, int idade, String celular, String email, double salario, Endereco ender) {
		super(nome, idade, celular, email, ender);
		
		if(salario<=500 ) {
			System.out.println("Salário muito baixo.");
			throw new IllegalArgumentException();
		}
		
		//Atributos
		this.salario = salario;
	}
	
	// Método que realiza o aumento do salário do funcionário
		public void AumentoSalario(double salario) {
			salarioAumentado = salario + (salario * (6.5/100));
		}
		
	// Método que mostra os atributos do Mensalista
		public void Mostrar() {
			System.out.println("---- Dados do funcionário mensalista ----");
			System.out.println("");
			System.out.println("Nome: "+getNome());
			System.out.println("Idade: "+getIdade()+" anos");
			System.out.println("Telefone: "+getCelular());
			System.out.println("Email: "+getEmail());
			System.out.printf("Salário com o aumento: R$ "+salarioAumentado,"%0.2");
			System.out.println("");
		}

		@Override
		public void mensagem() {
			// TODO Auto-generated method stub
			
		}
}
