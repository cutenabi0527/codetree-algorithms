import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
		
		int []arr = new int [11];
		
		while(true) {
			int num =sc.nextInt();
			arr[num/10]++;
			if (num==0) {
				for (int i=10; i>=1; i--) {
					System.out.println(i*10+" - "+arr[i]);
				}
				break;
			}
		}
	}
}
