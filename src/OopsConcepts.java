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


        // VARARGS & VARIABLE ARITY METHODS
        // In java it is possible to pass variable number of arguments to method it is called varargs.
        // And this method which accept variable number of arguments is known as variable arity method.
        // A variable length arguments is represented by 03 dots ...
        length(3,4,5,6,7); // here we passed 5 arguments
        length(1,2,3); // here we passed 03.
        // These two are correct and possible due to varargs.
        // we can also pass normal parameters to the method with varargs like // length(num1,num2m,... array)
        // Methods with varargs can also be loaded by is type of varargs and by passing normal paremeters

        // var type interference
        // As we previous know that var is used to initialize a variable who's type is auto taken by it declaration.
        // As in primitive type, we can also used it in reference type means object class.
        // As --->  var newclass1 = new MyClass{}      here is var auto take the Myclass as type.
        // It is use while when full class name writting is long enough the


    }

    static void length(int... aray){ // In method aray is simply works as an Array.
        System.out.println("THE LENGTH OF THE ARRAY IS : " + aray.length);
    }

    static void greeting(){
        System.out.println("hello, Good Morning");
    }
}
