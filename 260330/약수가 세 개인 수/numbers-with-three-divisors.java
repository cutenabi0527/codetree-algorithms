import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int st = sc.nextInt();
		int ed = sc.nextInt();
		
		int totalCnt=0;
		for (int j=st; j<=ed; j++) {
			int cnt=0;
			for (int i=1; i<=j; i++) {
				if (j%i==0) {
					cnt++;
				}
			} if (cnt==3) totalCnt++;
		} System.out.println(totalCnt);
		
		

	}
}