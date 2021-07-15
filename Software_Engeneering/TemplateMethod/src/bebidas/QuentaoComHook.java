package bebidas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuentaoComHook extends BebidasQuentesComHook {

	@Override
	public void adicionaBebidaAlcolica() {
		System.out.println("Adicionando Corote");
		
	}

	@Override
	public void adicionaCondimentos() {
		System.out.println("Adicionando Menta");
		System.out.println("Adicionando Canela");
		
	}
	
	void promocaoHook() {
		System.out.println("Adicionando mais Menta ao quentão");
		System.out.println("Adicionando mais Canela ao quentão");
		
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

		System.out.print("Gostaria de condimentos na sua bebida? (S/N)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("Digite S ou N para confirmar sua resposta");
		}
		if (answer == null) {
			return "Digite S ou N por favor";
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

		System.out.print("Você vai querer a promoção? (S/N)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			promo = in.readLine();
		} catch (IOException ioe) {
			System.err.println("Digite S ou N para confirmar sua resposta");
		}
		if (promo == null) {
			return "Digite S ou N por favor";
		}
		return promo;
	}
	

}

