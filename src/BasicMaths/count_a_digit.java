package BasicMaths;

public class count_a_digit {
    public static void main(String[] args) {
        int n = 456;
        int rev = 0;
        while(n>0){
            n = n/10;
            rev ++;
        }
        System.out.println(rev);
    }
}
