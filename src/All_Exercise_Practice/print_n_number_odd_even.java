package All_Exercise_Practice;

public class print_n_number_odd_even {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("EVEN");
        for(int i=1;i<=n;i++){
            if(i%2==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("ODD");
        for(int i=1;i<=n;i++){
            if(i%2!=0) {
                System.out.print(i + " ");
            }
        }
    }
}
