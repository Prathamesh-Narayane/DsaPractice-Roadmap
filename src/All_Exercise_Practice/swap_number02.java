package All_Exercise_Practice;

import java.util.Scanner;

public class swap_number02 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.println("value of A");
        int a = 5;
        System.out.println("value of B");
        int b = 6;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swap A = " + a);
        System.out.println("After swap B = " + b);
    }
}
