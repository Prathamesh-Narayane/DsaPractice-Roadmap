package Day03Loops;
import java.util.*;
public class print_all_odd_numbers_between_1_to_100 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<=n;i++){
            if(i%2!=0)
                System.out.print(i + " ");
        }
    }
}
