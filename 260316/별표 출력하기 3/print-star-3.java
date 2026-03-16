import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = n; i >=1; i--) {
        	int star = 2*i-1;
        	for (int j=0; j<Math.abs(n-i); j++) {
        		System.out.print("  ");
        	}
        	for (int j=0; j<star; j++) {
        		System.out.print("* ");
        	} System.out.println();
    
        }
    }
}