package lab2;

public class Maximo {

	private int nThreads;
	private int maximo;

	public Maximo (int n){
		nThreads = n;
		maximo = -1;
	}

	public synchronized void anotar(int pMax){
		if (pMax>maximo){
			maximo = pMax;
		}
		nThreads--;
	}

	public boolean termino(){
		return nThreads==0;
	}

	public int darMax()
	{
		return maximo;
	}
}
