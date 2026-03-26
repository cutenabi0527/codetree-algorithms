import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num = 1;
		int[][] map = new int[a][a];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				int col = i % 2 == 0 ? j : a - 1 - j;
				map[i][col] = num++;
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}