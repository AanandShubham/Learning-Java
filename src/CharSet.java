// Write a java program to list the available character set in charset objects ;
import java.nio.charset.Charset;
public class CharSet {
    public static void main(String... args){
        System.out.println("Available Char Set list : ");
        for(var str:Charset.availableCharsets().keySet())
            System.out.println(str);
    }
}
