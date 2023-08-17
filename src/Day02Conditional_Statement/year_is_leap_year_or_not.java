package Day02Conditional_Statement;

import java.util.Scanner;

public class year_is_leap_year_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year");
        int year = sc.nextInt();
        if(year%400==0 || year %100!=0 && year%4==0){
            System.out.println("this year is 'Leap year'");
        }else{
            System.out.println("this year is 'Not Leap year'");
        }
    }
}
