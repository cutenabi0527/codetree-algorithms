import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int [] arr = new int [10];
		
		int sum=0;
		int cnt=0;
		int idx=0;
		for (int i=0; i<10; i++) {
			int num = sc.nextInt();
			if (num==0) break;
			arr[i]= num;
			idx=i;
			
		}
		for (int j=0; j<=idx; j++) {
			if (arr[j]%2==0) {
				sum+=arr[j];
				cnt++;
			}
			
		}
		
	
		System.out.printf("%d %d", sum, cnt);

	}
}