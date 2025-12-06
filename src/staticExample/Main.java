package staticExample;

public class Main {
    public static void main(String[] args) {
//        Human shivam= new Human(21,"Shivam",1000,false);
//        Human amar= new Human(22,"Amar",15000,true);
//        System.out.println(shivam.population);
//        System.out.println(amar.population);
        fun();

    }
    //static method doesn't depend on objects.
    static void fun(){
        // greeting(); //can't call a non-static method from static method

        //We can't access non-static method without referencing its context to a static context.

        Main obj=new Main();
        obj.greeting();

    }

    //If something is not static then it belongs to object.
     void greeting(){
        System.out.println("Hello");
    }
}
