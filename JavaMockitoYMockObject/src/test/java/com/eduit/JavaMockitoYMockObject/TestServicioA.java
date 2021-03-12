package com.eduit.JavaMockitoYMockObject;

import org.junit.Assert;
import org.junit.Test;
import com.eduit.JavaMockitoYMockObject.entidades.ServicioAImpl;
import com.eduit.JavaMockitoYMockObject.interfaces.ServicioA;

public class TestServicioA {

	@Test
	 public void testSuma() {
	  
	 int a=2;
	 int b=2;
	 ServicioA servicio= new ServicioAImpl();
	 Assert.assertEquals(servicio.sumar(a, b),4);
	  
	 }

}
