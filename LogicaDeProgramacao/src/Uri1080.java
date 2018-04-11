import java.util.Scanner;


public class Uri1080 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int N;
		int menor;
		int cont = 1;
		int posi = 0;
		
		
		N = sc.nextInt();
		menor = sc.nextInt();
		for(int i=1; i < N; i++) {
			x = sc.nextInt();
			if(x < menor) {
				menor = x;
				posi = cont;
			}
			cont = cont+1;
		}
		System.out.println("Menor valor: "+menor );
		System.out.println("Posicao: "+posi);
		sc.close();
	}
	
}
