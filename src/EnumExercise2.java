// Write a program to create an eum called "Weekend" with constants representing the days of the weekend
public class EnumExercise2 {
    public enum Weekend{
        SUNDAY ,SATURDAY
    }

    public static void main(String... args){
        Weekend day1 = Weekend.SUNDAY;
        Weekend day2 = Weekend.SATURDAY;
        System.out.println(day1);
        System.out.println(day2);

    }
}
