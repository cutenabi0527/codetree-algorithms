import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [100];
		int i=2;
		arr[0] = 1;
		arr[1] = n;
		while(true) {
			arr[i]=arr[i-1]+arr[i-2];
			if (arr[i]>100) {
				for (int j=0; j<=i; j++) {
					if (arr[j]==0) continue;
					System.out.print(arr[j]+" ");
				}
				break;
			}
			i++;
		}
	}
}
