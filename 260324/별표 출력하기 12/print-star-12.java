import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] check = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0)
					check[i][j] = true;
				if (i % 2 != 0) {
					for (int k = 0; k <= i; k++) {
						check[k][i] = true;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (check[i][j] == true) {
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}