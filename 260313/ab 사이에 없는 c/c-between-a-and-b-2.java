import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		boolean check = false;
		
		for (int i=a; i<=b;i++) {
			if (c%a==0&&c%b==0) {
				check=true;
				break;
			}
		}

		System.out.println(check ? "YES" : "NO");

	}
}
// char a =sc.next().charAt(0);
