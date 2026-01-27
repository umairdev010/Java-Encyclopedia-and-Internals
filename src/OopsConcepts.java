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


    }

    static void greeting(){
        System.out.println("hello, Good Morning");
    }
}
