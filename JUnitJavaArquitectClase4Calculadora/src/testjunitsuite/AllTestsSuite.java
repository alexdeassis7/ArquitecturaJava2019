package testjunitsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import calculadora.CalculadoraTest;
import calculadordos.CalculadoraDosTest;
import testparametrizados.CalculadoraParametroTest;

//Esta clase debera ser creada como una SUiteJunit y NO como un "Junit Test"
@RunWith(Suite.class)
@SuiteClasses({
	CalculadoraTest.class,
	CalculadoraDosTest.class,
	CalculadoraParametroTest.class
})
public class AllTestsSuite {
	
	//esta clase puede estar vacio lo importantes es lo de arriba donde le indicamos 
	//el runner Suite.class, luego debemos decirle con la anotations @suiteClases entre los {}
	//todas las clase que queremos que se ejecuten y se ejecutaran en el mismo orden en el que fueron escritos

}
