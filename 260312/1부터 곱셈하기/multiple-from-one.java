import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 1;
		for (int i=1; i<=n; i++) {
			cnt*=i;
			if (cnt>=n) {
				System.out.println(i);
				break;
			}
		}
		
	}
}
// char a =sc.next().charAt(0);