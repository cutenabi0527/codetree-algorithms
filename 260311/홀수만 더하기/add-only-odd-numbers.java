import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();

		int cnt=0;
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			if (a%2!=0 && a%3==0) cnt+=a;
		} System.out.println(cnt);
	}
}
// char a =sc.next().charAt(0);