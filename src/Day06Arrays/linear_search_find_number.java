package Day06Arrays;
import java.util.*;

public class linear_search_find_number {
    public static int linear(int [] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key =sc.nextInt();
        int n= sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int find = linear(arr,key);
        if(find==-1){
            System.out.println("Not Found Number");
        }else{
            System.out.println("This Is Your Number = "+find);
        }

    }
}
