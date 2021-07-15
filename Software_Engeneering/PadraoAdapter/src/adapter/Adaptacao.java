package adapter;

import java.util.ArrayList;

public class Adaptacao {
	public static void main(String[] args) {
		ArrayList<IDados> arrdados = new ArrayList<IDados>();
		
		adptEstagio estagio = new adptEstagio("UMC", "Monitor");
		adptVisitaTecnica visita = new adptVisitaTecnica("Aviário", "12/08", "Botanicos");
		adptPalestra palestra = new adptPalestra("Desafios do tempo", "Joana", "14/09");
		adptCursoExtraCurricular curso = new adptCursoExtraCurricular("Java", "Rogério");
		
		arrdados.add(estagio);
		arrdados.add(palestra);
		arrdados.add(visita);
		arrdados.add(curso);
		
		for (IDados dados : arrdados) {
			System.out.println("Evento: " + dados.getDados());
		}
	}
}

