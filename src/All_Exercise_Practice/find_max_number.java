package All_Exercise_Practice;
import java.util.*;
public class find_max_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter nuber A");
        int a = sc.nextInt();
        System.out.println("enter nuber B");
        int b = sc.nextInt();
        System.out.println("enter nuber C");
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("A is Big");
        }
        else if(b>=c){
            System.out.println("B is Big");
        }
        else {
            System.out.println("C is Big");
        }
    }
}
