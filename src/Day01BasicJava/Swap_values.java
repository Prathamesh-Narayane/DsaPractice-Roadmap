package Day01BasicJava;

import java.util.Scanner;

public class Swap_values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A and B value");
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println("A=" + A + "  ||  B="+ B);
        A=A+B;
        B=A-B;
        A=A-B;
        System.out.println("A=" + A + " ||  B="+ B);


    }
}
