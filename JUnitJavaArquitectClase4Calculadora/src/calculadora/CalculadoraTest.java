package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	@Test
	public void testSuma() {
		int resultado = Calculadora.suma(2, 3);
		int esperado = 5;

		// Assert son lo metodos que me brinda Junit como resultados esperados
		assertEquals(esperado, resultado);

	}

	@Test
	public void testResta() {

		int resultado = Calculadora.resta(3, 2);
		int esperado = 1;
		// Assert son lo metodos que me brinda Junit como resultados esperados
		assertEquals(esperado, resultado);

	}

	@Test // esta anotacion marca al metodo como una prueba
	public void test() {
		// llamada a la funcion fail (esto hace que
		// automaticamente la prueba falle)
		// fail("Not yet implemented");

	}

}
