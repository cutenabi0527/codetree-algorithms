import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(2+" ");
		for (int i=3; i<=n; i++) {
			for (int j=2; j<i; j++) {
				if (i%2==0) continue;
				else {
					System.out.print(i+" ");
					break;
				}
			}
		}
		

	}
}