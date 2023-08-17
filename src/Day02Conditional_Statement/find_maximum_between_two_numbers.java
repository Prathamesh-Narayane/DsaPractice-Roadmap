package Day02Conditional_Statement;
import java.util.*;

public class find_maximum_between_two_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("enter num1");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("num 1 is a maximum numbers ");
        }else{
            System.out.println("num 2 is a maximum numbers ");
        }
    }
}
