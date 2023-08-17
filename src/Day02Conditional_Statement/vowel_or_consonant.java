package Day02Conditional_Statement;
import java.util.*;
public class vowel_or_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the alphabet");
        char ch =sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'  ){
            System.out.println("this alphabet is a Vowel");
        }else{
            System.out.println("this alphabet is Consonant");
        }
    }
}
