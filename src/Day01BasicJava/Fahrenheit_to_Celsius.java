package Day01BasicJava;
import java.util.*;
public class Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the fahrenheit value");
        float fahrenheit = sc.nextFloat();
        float celsius = fahrenheit;
        celsius=celsius-32;
        celsius=celsius*5;
        celsius=celsius/9;
        System.out.println("fahrenheit to celsius");
        System.out.println(celsius);
    }
}
