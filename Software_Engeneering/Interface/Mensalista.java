package avaliacao;

// SubClasse Mensalista
public class Mensalista extends Funcionario {
	
	private double salario;
	private double salarioAumentado;
	
	// Construtor da sub-classe Mensalista
	public Mensalista(String nome, int idade, String celular, String email, double salario, Endereco ender) {
		super(nome, idade, celular, email, ender);
		
		if(salario<=500 ) {
			System.out.println("Sal�rio muito baixo.");
			throw new IllegalArgumentException();
		}
		
		//Atributos
		this.salario = salario;
	}
	
	// M�todo que realiza o aumento do sal�rio do funcion�rio
		public void AumentoSalario(double salario) {
			salarioAumentado = salario + (salario * (6.5/100));
		}
		
	// M�todo que mostra os atributos do Mensalista
		public void Mostrar() {
			System.out.println("---- Dados do funcion�rio mensalista ----");
			System.out.println("");
			System.out.println("Nome: "+getNome());
			System.out.println("Idade: "+getIdade()+" anos");
			System.out.println("Telefone: "+getCelular());
			System.out.println("Email: "+getEmail());
			System.out.printf("Sal�rio com o aumento: R$ "+salarioAumentado,"%0.2");
			System.out.println("");
		}

		@Override
		public void mensagem() {
			// TODO Auto-generated method stub
			
		}
}
