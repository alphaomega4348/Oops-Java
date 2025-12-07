package Access;

public class Subclass extends A{

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj=new Subclass(18,"Virat");
        int x=obj.num;
    }
}
