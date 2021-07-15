package avaliacao;

// Interface IFuncionario
public interface IFuncionario {

	// Método default dando bom dia
		default void mensagem() {
			System.out.println("Fim da pesquisa!");
		}
}
