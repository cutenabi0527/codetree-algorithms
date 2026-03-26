import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			int num = a;
			for (int j = 1; j <= a; j++) {
				System.out.print(num * i + " ");
				num--;
			}

			System.out.println();

		}
	}
}