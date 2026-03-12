import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt=0;
		while (true) {
			int a = sc.nextInt();
			if (a>=20 && a<30) {
				sum+=a;
				cnt++;
			}else {
				System.out.printf("%.2f",(double)sum/cnt);
				break;
			}
		}
		
	}
}
// char a =sc.next().charAt(0);
