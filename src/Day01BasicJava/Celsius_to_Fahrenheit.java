package Day01BasicJava;

import java.util.Scanner;

public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter Celsius value");
        float celsius = sc.nextFloat();
        float fahrenheit = celsius;
        fahrenheit = fahrenheit*9;
        fahrenheit = fahrenheit/5;
        fahrenheit = fahrenheit+32;
        System.out.println("Celsius_to_Fahrenheit");
        System.out.println(fahrenheit);
    }
}
