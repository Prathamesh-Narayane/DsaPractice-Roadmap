package All_Exercise_Practice;

public class sum_odd_even {
    public static void main(String[] args) {
        int n = 100;
        int even = 0;
        int odd = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                even+=i;

            }
        }
        System.out.println("sum of Even Number "+ even);

        for(int i=1;i<=n;i++){
            if(i%2!=0){
                odd+=i;

            }
        }
        System.out.println("sum of Odd Number "+ odd);
    }

}
