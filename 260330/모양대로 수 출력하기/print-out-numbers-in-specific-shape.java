import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for (int i = a; i >=1; i--) {
			for (int j = 1; j <= a-i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j >=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}