import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int [] arr = new int[100];
		int i=0;
		while (true) {
			arr[i]=sc.nextInt();
			if (arr[i]==0) {
				for (int j=0; j<i; j++) {
					System.out.print(arr[j]%2==0 ? arr[j]/2 : arr[j]+3);
					System.out.print(" ");
				}
				break;
			}
			i++;
		}
		
	}
}
