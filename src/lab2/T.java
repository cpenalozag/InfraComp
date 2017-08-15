package lab2;

public class T extends Thread {
	
	private static Maximo tot;
	private int id;
	private int max;
	private boolean termino;
	private static int [][] M;
	
	private static void crearMatriz (int n){
		M = new int [n][n];
		int a = 0;
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				M[i][j]=a;
				a++;
			}
		}
	}
	
	public T (int pId){
		id = pId;
		max = -1;
		termino = false;
	}
	
	public void run()
	{
		int n = M[id].length;
		for (int i=0; i<n; i++){
			int m = M[id][i];
			if (m>max) max = m;
		}
		termino=true;
		tot.anotar(max);
	}
	
	public static void main (String [] args){
		int nThreads = 10;
		crearMatriz(nThreads);
		tot = new Maximo(nThreads);
		for (int i=0; i<nThreads; i++){
			T nuevo = new T(i);
			nuevo.start();
		}
		
		while (true){
			if (tot.termino()){
				break;
			}
		}
		System.out.println(tot.darMax());
	}
	
}
