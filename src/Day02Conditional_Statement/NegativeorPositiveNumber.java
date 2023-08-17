package Day02Conditional_Statement;
import java.util.*;
public class NegativeorPositiveNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("this is a positive number");
        }else if(num<0){
            System.out.println("this is a negetive number");
        }else{
            System.out.println("this is a zero");
        }
    }
}
