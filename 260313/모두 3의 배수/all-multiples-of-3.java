import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
		boolean check = true;
		
		for (int i=0; i<5;i++) {
			int a = sc.nextInt();
			if (a%3!=0) check = false;
		}

		System.out.println(check ? 1 : 0 );

	}
}
// char a =sc.next().charAt(0);
