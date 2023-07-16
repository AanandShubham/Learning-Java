// Write a program to create an array of enum and print it's all values
public class EnumExercise3 {
    enum Status{
        RUNNING,PENDING,FAILED,SUCCESS;
    }

    public static void main(String... args){
        Status[] s = Status.values();
        for(Status a:s)
            System.out.println(a);
    }
}
