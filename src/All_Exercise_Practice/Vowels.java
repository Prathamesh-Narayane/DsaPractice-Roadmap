package All_Exercise_Practice;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inter value");
        char ch = sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
            System.out.println("this is a Vowels ");
        }else{
            System.out.println("Invalid");
        }
    }
}
