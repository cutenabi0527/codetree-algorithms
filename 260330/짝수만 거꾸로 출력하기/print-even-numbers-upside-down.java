import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n+1];
		for (int i=1; i<=n; i++) {
			int num = sc.nextInt();
			if (num%2==0) arr[i]=num;
		}
		for (int i=n; i>=1; i--) {
			if (arr[i]!=0) System.out.print(arr[i]+" ");
		}

	}
}