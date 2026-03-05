import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String[] arr = a.split(":");

        System.out.println(Integer.parseInt(arr[0])+1+":"+arr[1]);

    }
}