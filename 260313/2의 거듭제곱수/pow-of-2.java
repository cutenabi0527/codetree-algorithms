import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x=0;
	
		while (n!=0) {
			int a=1;
			for (int i=0; i<x; i++) {
				a*=2;
			}
			if (n-a==0) break;
			x++;
		}
		System.out.println(x);
		
		
	}
}
// char a =sc.next().charAt(0);
