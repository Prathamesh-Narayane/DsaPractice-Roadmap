package Day01BasicJava;
import java.util.*;
public class Student_Mark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float sub1,sub2,sub3,sub4,sub5;
        System.out.println("enter the subject marks out of 100");
        System.out.println("enter sub1 marks");
        sub1=sc.nextFloat();
        System.out.println("enter sub2 marks");
        sub2=sc.nextFloat();
        System.out.println("enter sub3 marks");
        sub3=sc.nextFloat();
        System.out.println("enter sub4 marks");
        sub4=sc.nextFloat();
        System.out.println("enter sub5 marks");
        sub5=sc.nextFloat();

        float total_mark = sub1+sub2+sub3+sub4+sub5;
        float parcentage=(total_mark/500)*100;
        System.out.println("total_mark " +total_mark);
        System.out.println("parcentage " +parcentage);

    }
}
