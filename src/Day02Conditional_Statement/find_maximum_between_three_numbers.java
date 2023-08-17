package Day02Conditional_Statement;
import java.util.*;
public class find_maximum_between_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        System.out.println("enter num3");
        int num3=sc.nextInt();
        System.out.print("answer is := ");
        if(num1>num2 && num1>num3){
            System.out.println("num1 is bigger");
        } else if (num2>num1 && num2>num3) {
            System.out.println("num2 is bigger");
        }else{
            System.out.println("num3 is bigger");
        }

    }
}
