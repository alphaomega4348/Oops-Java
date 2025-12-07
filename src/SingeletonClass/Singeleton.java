package SingeletonClass;


/// Only Create one object for the class-- don't allow constructor to be called. Use private before constructor and initialize in the class itself
public class Singeleton {
     private Singeleton(){

    }
    private static Singeleton instance;
     public static Singeleton getInstance(){
         /// Check whether only one object is created or not
         if(instance==null){
             instance=new Singeleton();
         }
         return instance;
     }
}
