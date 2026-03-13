import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean check = false;
		
		for (int i=2; i<a;i++) {
			if (a%i==0) {
				check=true;
				break;
			}
		}

		System.out.println(check ? "C" : "P");

	}
}
// char a =sc.next().charAt(0);
