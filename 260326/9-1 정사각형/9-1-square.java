import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num = 9;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (num <= 0)
					num = 9;
				System.out.print(num);
				num--;
				;
			}
			System.out.println();

		}
	}
}