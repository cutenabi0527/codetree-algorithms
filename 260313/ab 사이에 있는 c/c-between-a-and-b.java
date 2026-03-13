import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		boolean check = false;
		if (a <= b) {
			for (int i = a; i <= b; i++) {
				if (i%c==0) {
					check = true;
					break;
				}
			}
		} else {
			for (int i = b; i <= a; i++) {
				if (i%c==0) {
					check = true;
					break;
				}
			}
		}

		System.out.println(check ? "YES" : "NO");

	}
}
// char a =sc.next().charAt(0);
