//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Car audi= new Car(3901.1f);
//        audi.engine="Electric Engine";
//        audi.numOfSeats=4;
//        System.out.println("After creation");
//
//        System.out.println(audi.engine+" "+audi.numOfSeats+" "+audi.price);
       final A shivam=new A("shivam");
        shivam.name="kumar"; //allowed
        //When a non-primitve is final you can't reassign it.
        //shivam=new A("hero"); //not allowed

    }


}


//class Car{
//    String engine;
//    Float price;
//    int numOfSeats;
//
//    Car(Float price){
//        this.price=price;
//        System.out.println("Instantiated");
//    }
//}

class A{

    final int num=20;
    String name;

    public A(String name){
        this.name=name;
    }

}