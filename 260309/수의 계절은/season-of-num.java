import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       
        String result = switch (a) {
        case 3,4,5 -> "Spring";
        case 6,7,8 -> "Summer";
        case 9,10,11 -> "Fall";
        case 1,2,12 -> "Winter";
        default -> "";
        };
        System.out.println(result);

    }
}