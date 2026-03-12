import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			int check=0;
			if (a%2!=0)continue;
			else {
				if (check<3) {
					System.out.println(a/2);
					check++;
				}else break;
			
			}
		}
		
	}
}
// char a =sc.next().charAt(0);
