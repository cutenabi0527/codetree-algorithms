import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num = 0;

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (i % 2 == 0) {
					num++;
					System.out.print(num + " ");
				} else {
					num += 2;
					System.out.print(num + " ");
				}
			}
			System.out.println();
		}

	}
}