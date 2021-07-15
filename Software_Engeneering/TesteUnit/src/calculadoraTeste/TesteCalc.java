package calculadoraTeste;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import calculadoraTeste.Calculadora;

public class TesteCalc {

	public TesteCalc(){
	}
	
	@Test
	
	public void assertSoma() {
	Calculadora c = new Calculadora();
	assertEquals(2, c.soma(1, 1));
	assertEquals(3, c.subtracao(6, 3));
	
	assertEquals(4.0, c.multiplicacao(2, 2), 0.1);
	assertEquals(5.0, c.divisao(25, 5), 0.1);
	}
}
