package Day02Conditional_Statement;
import java.util.*;
public class uppercase_or_lowercase_alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter alphabet");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("this is a lowercase");
        }else if(ch>='A' && ch<='Z'){
            System.out.println("this is a upercase");
        }else{
            System.out.println("this is not a alphabet");
        }
    }
}
