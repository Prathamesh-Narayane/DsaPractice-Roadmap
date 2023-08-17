package Day02Conditional_Statement;

import java.util.Scanner;

public class character_is_alphabet_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter alphabet");
        char ch =sc.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' ){
            System.out.println("this character is a alphabet");
        }else{
            System.out.println("this character is Not a alphabet");
        }
    }
}
