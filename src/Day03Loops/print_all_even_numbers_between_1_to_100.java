package Day03Loops;
import java.util.*;

public class print_all_even_numbers_between_1_to_100 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=100;i++){
            if(i%2==0)
                System.out.print(i + " ");
        }
    }
}
