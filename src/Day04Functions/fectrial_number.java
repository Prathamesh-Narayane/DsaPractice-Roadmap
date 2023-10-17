package Day04Functions;

public class fectrial_number {
    public static int factorial(int x){
        int ans =1;
        for(int i=2;i<=x;i++){
            ans = ans*i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 12;
        System.out.println(factorial(n));

    }
}
