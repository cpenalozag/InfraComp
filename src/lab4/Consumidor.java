package lab4;

public class Consumidor extends Thread {

	Canal c;
	int n;

	public Consumidor (Canal c){
		this.c = c;
	}


	public void run()
	{
		try {
			this.n = c.recibir();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
