package calculadordos;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraDosTest {

	static CalculadoraDos calc;//creamos static para poder utilizar el metodo beforeClass
	
	@BeforeClass//este metodo se ejecutara una unica vez al incio de la ejecución de la clase 
	//sirve por ejemplo para crear objetos muy pesados o asegurarnos que un objeto se crea siempre que se inicia la clase 
	public static void beforeClass(){ //debe ser static si o si 
		System.out.println(" BeforeClass() ");
		calc = new CalculadoraDos();
		
	}
	

	@Before // sirve para ejecutar codigo antes de que se ejecute cada una prueba
			// unitarias (metodos con anotation @Test)
	public void before() {
		System.out.println(" 	Before() ");
		calc = new CalculadoraDos();// no forma parte de la prueba es una precondicion para ejecutar el test
	}

	@After // codigo que se ejecuta despues de cada uno de los test
	public void after() {
		System.out.println("	After()");
		calc.clear();
	}
	
	@AfterClass// codigo que se ejecuta una unica vez al final de la clase 
	public static void afterClass() {//este metodo debe ser static para que se pueda ejecutar correctamente 
		System.out.println("AfterClass()");
		calc.clear();
	}
	
	@Test
	public void testSum() {
		System.out.println(" 		Ejecutando Test: TestSum() ");
		// CalculadoraDos calc = new CalculadoraDos(); codigo repetido
		int result = calc.add(3, 2);
		int esper = 5;
		assertEquals(esper, result);
	}

	@Test
	public void testAnsSum() {
		System.out.println(" 		Ejecutando Test: TestAnsSum() ");
		// CalculadoraDos calc = new CalculadoraDos(); codigo repetido
		int result = calc.add(3, 2);
		int esper = 5;
		assertEquals(esper, result);
	}

	
	@Test
	public void testDiv() {
		System.out.println(" 		Ejecutando Test: TestDiv() ");
		// CalculadoraDos calc = new CalculadoraDos(); codigo repetido
		int result = calc.div(6, 2);
		assertEquals(3, result);
	}

	@Test(expected = ArithmeticException.class)//esta prueba funcionara por que se espera un error con ele expected
	//un espected siempre va a fallar si no se genera la Exception que se le indica 
	public void testDivPorCero() {
		System.out.println("		 Ejecutando Test: TestDiv() ");
		int result = calc.div(5, 0); // forzamos un error dividiendo por cero 
	}

	//@Test(timeout = 100) //timeout sirve para testear un metodo que tarda mas delo normal , en este ejemplo 100 miliSegundos, si modificamos el tiempo no debera generar una Exception
	public void testAlgoritmoOptimo(){
		System.out.println("	 Ejecutando Test: testAlgoritmoOptimo() ");
		calc.operacionOptima();
	}
	
	
	
	

}
