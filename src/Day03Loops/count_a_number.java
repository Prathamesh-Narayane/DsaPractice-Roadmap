package Day03Loops;
import java.util.*;
public class count_a_number {
    public static  int countDigit(int x){
        int count = 0;
        while (x != 0){
            x=x/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countDigit(n));

    }
}
