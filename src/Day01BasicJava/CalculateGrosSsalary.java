package Day01BasicJava;
import java.util.*;

public class CalculateGrosSsalary {
    public static void main(String[] args) {
        System.out.println("find the gross salary of user");
        Scanner sc =new Scanner(System.in);
        System.out.println("inter the base salary");
        int basesalary =sc.nextInt();
        float houserent = basesalary*0.2f;
        float dearness = basesalary*0.4f;
        System.out.print("this is a gross salary");
        System.out.println(basesalary+houserent+dearness);


    }
}
