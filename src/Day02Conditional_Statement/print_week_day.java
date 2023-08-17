package Day02Conditional_Statement;
import java.util.*;
public class print_week_day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value 1 to 7");
        int week = sc.nextInt();
        if(week==1){
            System.out.println("Monday");
        } else if (week==2) {
            System.out.println("TuesDay");
        } else if (week==3) {
            System.out.println("WednesDay");
        } else if (week==4) {
            System.out.println("ThusDay");
        }else if (week==5) {
            System.out.println("FriDay");
        }else if (week==6) {
            System.out.println("SaturDay");
        }else if (week==7) {
            System.out.println("SunDay");
        }else {
            System.out.println("Wrong Value");
        }

        }
    }

