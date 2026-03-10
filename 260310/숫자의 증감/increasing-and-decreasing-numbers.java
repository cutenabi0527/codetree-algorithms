import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a =sc.next().charAt(0);
		int b =sc.nextInt();
		if (a=='A') {
			for (int i=1; i<=b;i++) {
				System.out.print(i+" ");
			}
		}else {
			for (int i=b; i>=1;i--) {
				System.out.print(i+" ");
			}
		}
		
	}
}