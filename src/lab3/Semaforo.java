package lab3;


public class Semaforo {

	int contador;
	
	public Semaforo( int n ){
		contador = n;

	}

	public synchronized void P(){
		contador++;
		if (contador <= 0){
			try{
				wait();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public synchronized void V(){
		contador--;
		if (contador < 0){
			notify();
		}
	}

}
