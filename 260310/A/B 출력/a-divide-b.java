import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a/b;
		int d = a%b;
		System.out.print(c+".");
		int i=1;
		while (i<21) {
			int e=(d*10)/b;
			d=(d*10)%b;
			
			System.out.print(e);
			
			
			
			i++;
		}
	}
}