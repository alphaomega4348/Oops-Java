//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car audi= new Car(3901.1f);
        audi.engine="Electric Engine";
        audi.numOfSeats=4;
        System.out.println("After creation");

        System.out.println(audi.engine+" "+audi.numOfSeats+" "+audi.price);
    }

}


class Car{
    String engine;
    Float price;
    int numOfSeats;

    Car(Float price){
        this.price=price;
        System.out.println("Instantiated");
    }
}