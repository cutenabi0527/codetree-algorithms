import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int mid = (n+1)/2;
        for (int i=0; i<2*n-1;i++) {
        	int dist = Math.abs(i-mid);
        	for (int j=0; j<Math.abs(n-dist);j++) {
        		System.out.print("*");
        	}System.out.println();
        }


    }
}