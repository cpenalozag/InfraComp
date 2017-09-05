package lab4;

public class Productor extends Thread {

	Canal c;
	int n;

	public Productor (Canal c, int n){
		this.c = c;
		this.n = n;
	}


	public void run()
	{
		try {
			c.enviar(n);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}
}
