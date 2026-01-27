public class OopsConcepts {
    static int b;

    static { // this is called static block
        b=4; // b declare to 4 as soon as class is initialize.
    }

    static void main(String[] args) {

        // INTRO TO STATIC
        // As we know When we want to use a member of specific class. we have to make an object of class to use that member.
        // So, sometimes we want to make a member to which we use without any object which is possible
        // we can make a method and member to which we can access without creating an object
        // For this we have to use word "static" before its return type.

        greeting();  // so we use it directly but it is not static then we have to make an object.
        // when an object is made things with static cannot initialize. because same copy is share to all objects
        // we can access only static variables in a static method and function etc.
        // we cannot used instance variables in static.


        // FINAL KEYWORD
        // we used keyword final to declare a variable constant. to prevent it from being modified.
        // we can give it to value while initialization and in constructor of class when we made an object.
        // once then variable is declared then its value cannot be changed by any means

        final int marks = 86; // it cannot be changed by any means


        // NESTED CLASSES
        // It is possible to make classes into a class. These types of classes is called nested classes
        // Scope of nested class is bounded to its enclosing class.
        // There are 02 types of inner nested classes.

        // 1. STATIC NESTED CLASS
        // it is seldom used because we have to make an object of outer class to access things.
        // it used word static before class name to make a class static

        // 2. NON-STATIC NESTED CLASS
        // it can directly use outer class members. And can declare its own also.
        // but the outer class cannot access things from its inner class directly.


    }

    static void greeting(){
        System.out.println("hello, Good Morning");
    }
}
