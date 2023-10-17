package Day02Conditional_Statement;
import java.util.*;
public class Positive_Negative_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 0){
            System.out.println("negative number");
        }else{
            System.out.println("positive number");
        }
    }
}
