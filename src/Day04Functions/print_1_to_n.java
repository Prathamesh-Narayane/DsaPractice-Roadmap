package Day04Functions;
import java.util.*;

import java.util.Scanner;

public class print_1_to_n {
    public static void print(int n){
        for(int i=0;i<=n;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}
