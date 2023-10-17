package Day03Loops;
import java.util.*;
public class print_all_alphabets_from_a_to_z {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(char i='a';i<='z';i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(char i='z';i>='a';i--){
            System.out.print(i + " ");
        }
        System.out.println();
        for(char i='A';i<='Z';i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(char i='Z';i>='A';i--){
            System.out.print(i + " ");
        }



    }
}
