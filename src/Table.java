// Write a program that takes a number as input and prints its multiplication table up to 10 ;
import java.util.Scanner;
public class Table {

    public static void main(String... args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A Number to See it's tabel : ");
        int num = s.nextInt();

        for(int a=1; a<=10; a++)
            System.out.println(num + " x " + a + " = " + (num*a));
    }
}
