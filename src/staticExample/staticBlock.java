package staticExample;


// how to initialize static variables use STATIC BLOCK...
public class staticBlock {
    static int a=4;
    static int b;

    //run only once at beginning when class is initialized to initialize static variables.
    static{
        System.out.println("I am inside static block");
        b=a*5;
    }

    public static void main(String[] args) {
        staticBlock obj= new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);

        staticBlock.b+=4;
        System.out.println(staticBlock.a+" "+staticBlock.b);

        //static block didn't run here as it runs only once during initialization...
        staticBlock obj2= new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);

    }
}
