https://www.arquitecturajava.com/java-mockito-y-los-mock-objects/

Como podemos observar ambas clases disponen de un método que se puede testear de forma aislada  ServicioA (sumar) y ServicioB (multiplicar). Vamos a instalar JUnit y Mockito como dependencias de Maven para poder trabajar.

Ahora bien ¿qué pasará si tenemos que testear el método sumarMultiplicar que tiene el ServicioB?. Este método primero suma dos números delegando en el ServicioA y luego los multiplica.

Todo funciona correctamente. Los problemas aparecen cuando yo modifico  el método sumar del ServicioA y le asigno el siguiente código:

package com.arquitecturajava.servicios;
 
public class ServicioAImpl implements ServicioA {
public int sumar(int a ,int b) {
 
return a+b+1;
}
}



Fallan dos test y no uno solo, esto es un problema importante ya que los desarrolladores no sabrán que esta pasando exactamente. Para evitar este tipo de problemas debemos aislar las pruebas unitarias y una de las opciones es usar Java Mockito y crear un Mock Object. Los objetos Mock nos permiten simular ser un objeto real y eliminan dependencias , permitiendo que los test se ejecuten de forma aislada.