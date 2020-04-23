package matriz;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho da matriz: ");
		
		int n = scan.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		int count = 0;
		for(int i =0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] < 0) {
					count ++;
				}
				System.out.println(count);
			}
		}
		
		
		scan.close();
	}

}
