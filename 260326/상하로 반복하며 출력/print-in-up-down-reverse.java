import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num = a % 10;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (j % 2 == 0) {
					System.out.print(i + 1);
				} else {
					System.out.print(a - i);
				}
			}
			System.out.println();
		}
	}
}