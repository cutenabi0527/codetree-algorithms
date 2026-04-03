import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
		char [] con = new char [3];
		int []arr = new int [3];
		int [] cnt = new int[4];
		for (int i=0; i<3; i++) {
			con[i]=sc.next().charAt(0);
			arr[i]=sc.nextInt();
		}
		for (int i=0; i<3; i++) {
			if (con[i]=='Y') {
				if (arr[i]>=37) cnt[0]++;
				else cnt[2]++;
			}else {
				if (arr[i]>=37) cnt[1]++;
				else cnt[3]++;
			}
		}
		for (int i : cnt) {
			System.out.print(i+" ");
		}
		if (arr[0]>=2) System.out.print("E"); 
	}
}
