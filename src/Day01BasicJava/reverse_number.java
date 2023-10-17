package Day01BasicJava;
public class reverse_number {
    public static int reverse(int x){
        int temp = x;
        int rev = 0;
        while(temp!=0){
            int ld = temp%10;
            rev = rev*10+ld;
            temp = temp/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n=123456789;
        System.out.println(reverse(n));
    }
}
