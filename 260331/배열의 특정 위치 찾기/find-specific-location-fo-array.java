import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int [] arr = new int [11];
		for (int i=1; i<=10; i++) {
			arr[i]= sc.nextInt();
		}
		int sum =0;
		int avg =0;
		for (int i=1; i<=10; i++) {
			if (i%2==0) sum+=arr[i];
			if (i%3==0) avg+=arr[i];
		}
		
		System.out.printf("%d %.1f", sum, (float) avg/3);
	}
}