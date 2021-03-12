package com.eduit.JavaMockitoYMockObject;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;


import com.eduit.JavaMockitoYMockObject.entidades.ServicioBImpl;
import com.eduit.JavaMockitoYMockObject.interfaces.ServicioA;
import com.eduit.JavaMockitoYMockObject.interfaces.ServicioB;

public class TestServicioB {

	@Test
	public void testMultiplicacion() {

		ServicioB servicioB = new ServicioBImpl();

		Assert.assertEquals(servicioB.multiplicar(2, 3), 6);
		// al modificar esta linea no compilara el proyecto ya que no paso lo test
//	 Assert.assertEquals(servicioB.multiplicar(2, 3),6);

	}

	
//	Ahora bien ¿qué pasará si tenemos que testear el método sumarMultiplicar que tiene el ServicioB?.
//			Este método primero suma dos números delegando en el ServicioA y luego los multiplica.
//	@Test
//	public void testmultiplicarSumar() {
//
//		ServicioA servicioA = new ServicioAImpl();
//		ServicioB servicioB = new ServicioBImpl();
//
//		servicioB.setServicioA(servicioA);
//		Assert.assertEquals(servicioB.multiplicarSumar(2, 3, 2), 10);
//
//	}
//	Todo funciona correctamente. Los problemas aparecen cuando yo modifico  el método sumar del ServicioA 
	//y le asigno el siguiente código:
//
//		public class ServicioAImpl implements ServicioA {
//		public int sumar(int a ,int b) {
//		 
//		return a+b+1;
//		}
//		}
//		Los test fallarán:
	
	//ahora lo probamos con un mock 
	@Test
	public void testmultiplicarSumar() {
	 
	ServicioA servicioA=mock(ServicioA.class);
	when(servicioA.sumar(2,3)).thenReturn(5);
	 
	ServicioB servicioB= new ServicioBImpl();
	servicioB.setServicioA(servicioA);
	Assert.assertEquals(servicioB.multiplicarSumar(2, 3, 2),10);
	 
	}

}
