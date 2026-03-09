import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if ((a>=b&&b>=c)||((a>=c&&c>=b))) {
			System.out.println(a);
		}
		else if ((b>=a&&a>=c)||((b>=c&&c>=a))) {
			System.out.println(b);
		}
		else if ((c>=a&&a>=b)||((c>=b&&b>=a))) {
			System.out.println(c);
		}
		
		
	}
}