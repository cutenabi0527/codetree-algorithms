import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			int num = 11 + i * 2;
			for (int j = 0; j < a; j++) {
				System.out.print(num + " ");
				num += 2;
			}
			System.out.println();
		}
	}
}