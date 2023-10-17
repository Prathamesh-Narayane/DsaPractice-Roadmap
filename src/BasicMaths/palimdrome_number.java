package BasicMaths;

public class palimdrome_number {
    public static void main(String[] args) {
        int n = 79897;
        int temp = n;
        int rev=0;
        while(temp>0){
            int digit = temp%10;
            rev = rev *10+ digit;
            temp = temp/10;
        }
        System.out.println(rev);
        if(rev==n){
            System.out.println("this is palimdrome");
        }else{
            System.out.println("this is a not palimdrome");
        }
    }
}
