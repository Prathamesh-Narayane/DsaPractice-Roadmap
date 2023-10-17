package All_Exercise_Practice;

public class numberofdivby5and3 {
    public static void main(String[] args) {
        int n = 100;
        for(int i=1;i<=n;i++){
            if(i%5==0 && i%3!=0){
                System.out.println(i);
            }
        }
    }
}
