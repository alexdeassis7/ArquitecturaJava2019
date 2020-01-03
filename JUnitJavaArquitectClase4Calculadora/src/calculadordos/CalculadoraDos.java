package calculadordos;

//USAMOS BEFORE Y AFTER
public class CalculadoraDos {
	private int ans;

	public CalculadoraDos() {

	}

	public int add(int a, int b) {
		ans = a + b;
		return ans;

	}

	public int sub(int a, int b) {
		ans = a - b;
		return ans;

	}

	public int div(int a, int b) {// divicion que puede generar error
		if (b == 0) {
			throw new ArithmeticException("no podes dividir por cero en los numeros reales !!");
		}
		ans = a / b;
		return ans;

	}

	public int add(int v) {
		ans += v;
		return ans;

	}

	public int sub(int v) {
		ans -= v;
		return ans;

	}

	public int ans() {

		return ans;

	}

	public void clear() {
		ans = 0;
	}

	// deberia estar optimizado
	public void operacionOptima() {
		try {
			Thread.sleep(2000);// demoramos dos minutos la ejecucion del hilo
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
