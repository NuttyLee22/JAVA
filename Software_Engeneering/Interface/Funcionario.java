package avaliacao;

// SuperClasse Funcionario com agragação da interface IFuncionario
public abstract class Funcionario implements IFuncionario{

	String nome;
	int idade;
	String celular;
	String email;
	Endereco endereco;
	
	// Construtor da classe Funcionario
	public Funcionario(String nome, int idade, String celular, String email, Endereco ender) {
		
		// Algumas verificações para os atributos
		if(nome.isEmpty() || celular.isEmpty() || email.isEmpty()) {
			System.out.println("Campo(s) vazio(s)");
			throw new IllegalArgumentException();
		}
		
		else if(idade<=14 || idade>130) {
			System.out.println("Idade inválida.");
			throw new IllegalArgumentException();
		}
		
		//Atributos
		this.nome = nome;
		this.idade = idade;
		this.celular = celular;
		this.email = email;
		this.endereco = ender;
	}
	
	// Gets e Sets
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getCelular() {
		return celular;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	// Override do método mensagem() criado na interface IFuncionario
	@Override
	public void mensagem() {
		// TODO Auto-generated method stub
	}
}
