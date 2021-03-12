package com.eduit.JavaMockitoYMockObject.entidades;

import com.eduit.JavaMockitoYMockObject.interfaces.ServicioA;

public class ServicioAImpl implements ServicioA {

	public int sumar(int a, int b) {
		return a + b +1;
	}
}
