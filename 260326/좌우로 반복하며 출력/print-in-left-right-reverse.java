import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num = a % 10;
		for (int i = 0; i < a; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= a; j++) {
					System.out.print(j);
				}
			} else {
				for (int j = a; j >= 1; j--) {
					System.out.print(j);
				}
			}

			System.out.println();
		}
	}
}