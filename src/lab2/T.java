package lab2;

public class T extends Thread {
	
	private static Total tot;
	private int id;
	private int suma;
	private boolean termino;
	private static int [][] M;
	
	private static void crearMatriz (int n){
		M = new int [n][n];
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				M[i][j]=1;
			}
		}
	}
	
	public T (int pId){
		id = pId;
		suma = 0;
		termino = false;
	}
	
	public void run()
	{
		int n = M[id].length;
		for (int i=0; i<n; i++){
			suma+=M[id][i];
		}
		termino=true;
		tot.anotar(suma);
	}
	
	public static void main (String [] args){
		int nThreads = 10;
		crearMatriz(nThreads);
		tot = new Total(nThreads);
		for (int i=0; i<nThreads; i++){
			T nuevo = new T(i);
			nuevo.start();
		}
		
		while (true){
			if (tot.termino()){
				break;
			}
		}
		System.out.println(tot.darTotal());
	}
	
}
