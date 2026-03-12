import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int check=0;
		while (check<3) {
			int a = sc.nextInt();
			if (a%2!=0) {
				continue;
			}
			else {
				System.out.println(a/2);
			}
			check++;
		}
		
	}
}
// char a =sc.next().charAt(0);
