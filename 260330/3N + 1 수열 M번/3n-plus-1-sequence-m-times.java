import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		for (int i=0; i<m; i++) {
			int n = sc.nextInt();
			int num = n;
			int cnt = 0;
			while (num != 1) {
				if (num % 2 == 0)
					num = num / 2;
				else
					num = num * 3 + 1;
				cnt++;
			}
			System.out.println(cnt);
		}
		

	}
}