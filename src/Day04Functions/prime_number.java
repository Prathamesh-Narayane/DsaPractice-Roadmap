package Day04Functions;

public class prime_number {
    public static boolean prime(int x){
        if(x==1){
            return false;
        }
        for(int i=2;i<x;i++){
            if(x%i==0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(prime(n));

    }
}
