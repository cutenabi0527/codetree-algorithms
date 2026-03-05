import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c =sc.nextInt();
        double d = (int)(a+b+c)/3;

        System.out.printf("%d\n%.0f",a+b+c,d);


        

    }
}