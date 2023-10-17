package All_Exercise_Practice;
import java.util.*;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();

        if(age < 18){
            System.out.println("Teen");
        }else if(age < 60){
            System.out.println("Adult");
        }else{
            System.out.println("Old");
        }
    }
}
