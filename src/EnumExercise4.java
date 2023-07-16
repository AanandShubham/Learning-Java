// Write a progarm to create an enum of laptop models and also describe its price with it

public class EnumExercise4 {

    enum Laptop{
        MackbookAir(100000),NitroRyzen5(50000),Hp2000(34000);
        private int price;
        private Laptop(int price){ this.price = price; }
        private Laptop() { }
        public void setPrice(int price){this.price = price;}
        public int getPrice(){ return price;}
    }

    public static void main(String... args){
        Laptop lap = Laptop.NitroRyzen5;
        System.out.println(lap + " " + lap.getPrice());

        // Printing all the value of Laptop Class

        for(Laptop l:Laptop.values()) // You can do this too with the enum
            System.out.println(l + " : " + l.getPrice());
    }
}

