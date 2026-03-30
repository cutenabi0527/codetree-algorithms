import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int st = sc.nextInt();
		int ed = sc.nextInt();
		int sum=0;
		int cnt=0;
		for (int j=st; j<=ed; j++) {
			for (int i=1; i<j; i++) {
				if (j%i==0) {
					sum +=i;
				}
			} if (j==sum) cnt++;
		} System.out.println(cnt);
		
		

	}
}