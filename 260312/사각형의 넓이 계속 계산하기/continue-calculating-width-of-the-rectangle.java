import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			char c = sc.next().charAt(0);
			if (c=='C') {
				System.out.println(a*b);
				break;
			}System.out.println(a*b);
		}
		
	}
}
// char a =sc.next().charAt(0);
