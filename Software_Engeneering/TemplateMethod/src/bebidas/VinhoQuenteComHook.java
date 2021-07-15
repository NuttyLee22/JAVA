package bebidas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VinhoQuenteComHook extends BebidasQuentesComHook {

	@Override
	void adicionaBebidaAlcolica() {
		System.out.println("Adicionando Vinho");
		
	}

	@Override
	void adicionaCondimentos() {
		System.out.println("Adicionando Frutas");
		System.out.println("Adicionando A�ucar");
		
	}
	
	@Override
	void promocaoHook() {
		System.out.println("Adicionando mais frutas e vinho no cop�o da promo maluca");
		
	}
	
	public boolean clienteQuerCondimentos() {
		String answer = getUserInput();

		if (answer.toUpperCase().startsWith("S")) {
			return true;
		} else {
			return false;
		}
	}
	
	private String getUserInput() {
		
		String answer = null;

		System.out.print("Voc� vai querer os condimentos na sua bebida? (S/N)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("digite S ou N para confirmar sua resposta");
		}
		if (answer == null) {
			return "ai n�o n� meu patr�o";
		}
		return answer;
	}
	
	public boolean clienteQuerPromocao() {
		String promo = getUserInput2();

		if (promo.toUpperCase().startsWith("S")) {
			return true;
		} else {
			return false;
		}
	}
	
	private String getUserInput2() {
		
		String promo = null;

		System.out.print("Voc� vai  querer a promo��o? (S/N)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			promo = in.readLine();
		} catch (IOException ioe) {
			System.err.println("Digite S ou N para confirmar sua resposta");
		}
		if (promo == null) {
			return "ai n�o n� meu patr�o";
		}
		return promo;
	}

}
