package Day01BasicJava;

import java.util.Scanner;

public class MetersFeetInchesanCentimeters {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the kilometer");
        float kilometer=sc.nextFloat();
        float meter=kilometer*1000;
        float centimeter=meter*100;
        float inche = centimeter/2.54f;
        float feet =inche/12;
        System.out.println("kilometer "+kilometer);
        System.out.println("meter "+meter);
        System.out.println("centimeter "+centimeter);
        System.out.println("inche "+inche);
        System.out.println("feet "+feet);

    }

}
