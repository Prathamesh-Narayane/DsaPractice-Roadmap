package Day04Functions;

public class palimdrome_number {
    public static boolean palimdorme(int x){
        int reverse =0;
        int temp =x;
        while(temp!=0){
            int ld = temp %10;
            reverse = reverse*10+ld;
            temp = temp/10;
        }
        return (reverse == x);
    }
    public static void main(String[] args) {
        int n = 12344321;
        System.out.println(palimdorme(n));
    }
}
