import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for (int i=1; i<=n; i++) {
			if ((i/8)%2==0 || i%7<4 || (i%2==0&&i%4!=0)) {
				continue;
			}else System.out.print(i+" ");
		}
		
	}
}
// char a =sc.next().charAt(0);