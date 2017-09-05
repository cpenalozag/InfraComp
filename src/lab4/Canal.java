package lab4;

public class Canal {

	boolean ocupado;
	int contenido;

	public Canal(){

	}

	public synchronized void enviar(int n) throws InterruptedException{
		if (!ocupado) {
			contenido = n;
			ocupado = true;
			wait();
		}
		else {
			contenido = n;
			notify();
		}
		
		
	}

	public synchronized int recibir() throws InterruptedException{
		int n=-1;
		
		if (ocupado){
			n = this.contenido;
			notify();
		}
		else{
			wait();
			n = this.contenido;
		}
		return n;
	}

}
