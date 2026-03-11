import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();

		int sum=0;
		int cnt=0;
		for (int i=0; i<10; i++) {
			int a = sc.nextInt();
			if (a>=0 && a<=200) {
				sum+=a;
				cnt++;
			}
		}
		System.out.printf("%d %.1f", sum, (double)sum/cnt);
	}
}
// char a =sc.next().charAt(0);