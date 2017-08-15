package lab1;

public class Total {
	
	private int nThreads;
	private int total;
	
	public Total (int n){
		nThreads = n;
		total = 0;
	}
	
	public synchronized void anotar(int pSuma){
		total += pSuma;
		nThreads--;
	}
	
	public boolean termino(){
		return nThreads==0;
	}
	
	public int darTotal()
	{
		return total;
	}
}
