package SingeletonClass;

public class Main {
    public static void main(String[] args) {

        /// obj1,obj2,obj3 all3 reference variables point to same object only.
        Singeleton obj1=Singeleton.getInstance();

        Singeleton obj2=Singeleton.getInstance();

        Singeleton obj3=Singeleton.getInstance();
    }

}
