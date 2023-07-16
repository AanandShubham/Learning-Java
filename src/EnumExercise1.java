public class EnumExercise1 {
    public enum Weeks{
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
    }
    public static void main(String... args){
        Weeks w = Weeks.MONDAY;
        System.out.println(w);
    }
}
