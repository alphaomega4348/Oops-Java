package staticExample;


//Outside classes can't be static i.e
/*
*Not allowed--------------
static{
  static/non-static{

 }
 }
 *Allowed--------------
non-static{
  static/non-static{

 }
 }
 */
public class innerClasses {

    ///throws error inside main because trying to access a inner class from static method which is not allowed
    /// it would be fine if Test was not an inner class but an independent class itself.

//    class Test{
//
//    }
//    public static void main(String[] args) {
//        Test a=new Test("Shivam");
//    }
/// TODO: Test is mentioned static inside a non-static class therefore it's object is not dependent on "innerClasses" but main and test can have instance of each other.
        static class Test{
            String name;

            public Test(String name){
                this.name=name;
            }
    }

    public static void main(String[] args) {
        Test a=new Test("Shivam");
        Test b=new Test("Amar");
        System.out.println(a.name);
        System.out.println(b.name);
    }


}
