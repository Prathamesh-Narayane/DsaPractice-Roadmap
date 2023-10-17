package All_Exercise_Practice;
import java.util.*;

public class swap_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("value of A");
        int a = sc.nextInt();
        System.out.println("value of B");
        int b = sc.nextInt();

        int c = a ;
        a = b;
        b = c;

        System.out.println("after swap A = " + a );
        System.out.println("after swap B = " + b );
    }
}
