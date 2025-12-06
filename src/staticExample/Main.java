package staticExample;

public class Main {
    public static void main(String[] args) {
        Human shivam= new Human(21,"Shivam",1000,false);
        Human amar= new Human(22,"Amar",15000,true);
        System.out.println(shivam.population);
        System.out.println(amar.population);

    }
}
