package application;

import java.util.Locale;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; i++) {
				System.out.println(mat[n]);
			}
		}

		sc.close();

	}

}
