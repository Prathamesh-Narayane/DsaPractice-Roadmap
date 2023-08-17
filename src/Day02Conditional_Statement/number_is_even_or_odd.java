package Day02Conditional_Statement;
import java.util.*;
public class number_is_even_or_odd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        if(number % 2==0){
            System.out.println("this number is Even number");
        }else{
            System.out.println("this number is Odd number");
        }
    }
}
