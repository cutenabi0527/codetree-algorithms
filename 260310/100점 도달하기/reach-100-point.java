import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int i=a;
		while(i<=100) {
			if (i>=90) System.out.print("A");
			else if (i>=80) System.out.print("B");
			else if (i>=70) System.out.print("C");
			else if (i>=60) System.out.print("D");
			else System.out.print("F");
			System.out.print(" ");
			i++;
		}
	}
}
// char a =sc.next().charAt(0);