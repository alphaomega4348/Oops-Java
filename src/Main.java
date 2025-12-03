//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car audi= new Car();
        audi.engine="Electric Engine";
        audi.price=1202.4f;
        audi.numOfSeats=4;

        System.out.println(audi.engine+" "+audi.numOfSeats+" "+audi.price);
    }

}


class Car{
    String engine;
    Float price;
    int numOfSeats;
}