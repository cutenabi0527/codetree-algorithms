import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i =3;
		System.out.print(a+" "+b+" ");
		while(i<=10) {
			int temp = 2*a + b;
			System.out.print(temp+" ");
			a=b;
			b=temp;
			i++;
		}
		
	}
}
