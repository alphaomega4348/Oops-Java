package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    //not allowed as this keyword inside static is not allowed
    static void message(){
        // System.out.println(this.age); accessing non-static from static is not allowed...
    }

    //allowed to reference object
     void message2(){
         System.out.println(this.age);
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;
    }


}
