package matriz;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = scan.nextInt();
			}
			System.out.println("teste");
		}
		
		
		
		
		
		
		
		
		
		scan.close();

	}

}
