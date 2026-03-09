import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a>=b) {
			if (c>=a) System.out.println(c);
			else if (b>=c) System.out.println(a);
		}
		else if (b>=a) {
			if (c>=b) System.out.println(c);
			else if (a>=c) System.out.println(b);
		}
		else if (a>=c) {
			if (c>=b) System.out.println(a);
			else if (b>=a) System.out.println(b);
		}
		
	}
}