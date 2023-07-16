// Write a program to accept a number and check whether the number is even or not
import java.util.Scanner;
public class ChkEvenOdd {
    public static void main(String... args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = s.nextInt();
        if(num %2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
