package com.eduit.JavaMockitoYMockObject.interfaces;
//clase se encarga de multiplicar dos números 
public interface ServicioB {
	public ServicioA getServicioA();

	public void setServicioA(ServicioA servicioA);

	public int multiplicarSumar(int a, int b, int multiplicador);

	public int multiplicar(int a, int b);
}
