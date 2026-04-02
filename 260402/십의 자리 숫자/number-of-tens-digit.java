import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
		
		int []arr10 = new int [10];
		
		while(true) {
			int num =sc.nextInt();
			arr10[num/10]++;
			if (num==0) {
				for (int i=1; i<10; i++) {
					System.out.println(i+" - "+arr10[i]);
				}
				break;
			}
		}
	}
}
