package Day03Loops;
import java.util.*;
public class sum_of_odd_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0)
                ans=ans+i;

        }
        System.out.println(ans);

    }
}
