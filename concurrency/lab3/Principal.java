package lab3;

public class Principal {
	private Semaforo s;


	public Semaforo darSemaforo(){
		return s;
	}

	public Principal(){
		s = new Semaforo(1);
		for (int i=-10; i<11; i++){
			new T(i, this).start();
		}
	}

	public static void main (String[] args){
		Principal p = new Principal();
	}
}
