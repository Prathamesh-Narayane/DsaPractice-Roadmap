package Day04Functions;
import java.util.*;

public class trading_zero_in_factorial {
    public static int findingZero(int n){
        int ans =1;
        for(int i=2;i<=n;i++){
            ans = ans *i ;
        }
        int x=0;
        while(ans!=0){
            if(ans%10==0) {
                x++;
                ans = ans / 10;
            }
                ans=ans /10;
        }
        return x;
    }
    public static void main(String[] args) {
        int n=12;
        System.out.println(findingZero(n));
    }
}
