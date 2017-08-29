package lab3;

public class T extends Thread {

	private int cant;
	private Principal principal;
	private static int numero = 0;

	public T (int cant, Principal principal){
		this.cant = cant;
		this.principal = principal;
	}

	public void mA (int n){
		principal.darSemaforo().P();
		numero+=n;
		System.out.println(numero);
		principal.darSemaforo().V();
	}



	public void run()
	{
		this.mA(this.cant);
	}
}
