package Access2;

import Access.A;

public class B extends A {

    public B(int num, String name) {
        super(num, name);
    }

    ///Protected is allowed in subclass of different package but default is not allowed to access outside package it doesn't matter whether it is subclass or not
    public static void main(String[] args) {
        B obj=new B(10,"Sachin");
        System.out.println(obj.getClass().getClass());
    }


}
