package Day02Conditional_Statement;
import java.util.*;

public class alphabet_digit_or_special_character {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a character");
        char ch =sc.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'  ){
            System.out.println("this is a Alphabet");
        }else if(ch>='0' && ch<='9'){
            System.out.println("this is a Digit");
        }else{
            System.out.println("this is a Special Character");
        }
    }
}
