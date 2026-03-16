import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars;
            
            if (i <= n) {
                stars = n+1-i;
            } else {
                stars = i-n+1;
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}