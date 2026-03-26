import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num = 2;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (num >= 10)
					num = 2;
				System.out.print(num + " ");
				num += 2;
			}
			System.out.println();

		}
	}
}