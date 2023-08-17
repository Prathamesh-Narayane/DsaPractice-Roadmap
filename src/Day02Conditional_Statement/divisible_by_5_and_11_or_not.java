package Day02Conditional_Statement;
import java.util.*;
public class divisible_by_5_and_11_or_not {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" enter the number ");
        int number =sc.nextInt();
        if(number%5==0 && number%11==0){
            System.out.println(" this number is 'divisible by 5 and 11' ");
        }else{
            System.out.println(" this number is 'not divisible by 5 and 11' ");
        }

    }
}
