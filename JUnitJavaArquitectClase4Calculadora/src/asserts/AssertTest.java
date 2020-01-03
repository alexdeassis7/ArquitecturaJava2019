package asserts;

import static org.junit.Assert.*;

import org.junit.Test;

import calculadora.Calculadora;

public class AssertTest {

	@Test
	public void test() {
		// assertEquals(long, long);//sirve para todos los numericos
		// AssertEquals(Object , Object ); //debe tener bien implementado equals en el object
		// AssertEquals(double ,double , double delta ); //el delta es la tolerancia a la falla
		// AssertEquals(String mensaje ,double , double delta ); //en caso que falle mostrara el mensaje!
		// ej:
		assertEquals("3 es distinto de 4", 4, 4);
		
//		assertEqualsArray (funciona igual que con los demas numbers)
//		assertFalse() y assertTrue () sirven para validar que una  determinada condicion sea falsa o verdadera
		
//		assertNotEquals(), funciona al reves que los assertEquals falla cuando no sean iguales los parametros 
//		assertNotNull() : sirve para comprobar que algo no sea null
//		asserNull()   : sirve para comprobar que algo  sea null
//		assertSame(expected, actual); //sirve para comprobar que los objetos sean los mismos  por ejemplo 
		
		Calculadora s1 = new Calculadora();
		
		Calculadora s2 = new Calculadora(); //si remmplazo por Calculadora s1 = s2 assertSame() da true! 
		
		String st1 ="hola";
		String st2 ="hola";
		
		assertEquals(st1, st2); //esto da true por que los dos String son iguales
		assertSame(s1, s2); //esto da false por que los dos objetos estan en posiciones de memoriaas distintas
	}
	
	
	

}
