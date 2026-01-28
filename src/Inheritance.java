public class Inheritance {
    static void main(String[] args) {

        // INHERITANCE
        // it is common in oops. in this we create a parent class which have some common traits(methods) which is then inherited by its child classes.
        // parent classes is known as superclasses and child classes is called subclasses.
        // to use inheritance it is very simple. we use simply write a class then keyword extend and the name of its parent class.

        Student umair = new Student("umair");
        umair.printName(); // we have not define printname function in student class but still we access it from the parent class
        // Anything in the superclass is accessible by its subclass except its private members.


        // METHOD OVERRIDING
        // if we make a method with same name which is already exists in superclass. then the method is said to be override.
        // we used overriding if we don't want to used parents method and want to create class own.
        // if we override the method but we want to use parents method then we use super with it
        // method override only if they have both name and parameters type same. No difference.
        // if there is any difference then it is known as method overloading


        // DYNAMIC METHOD DISPATCH
        // It is possible that we can define an object but gives it a type of its super class like
        Human ali = new Student("ali");  // it is possible to create an object like that.
        // in this case if both super class and the sub class have a same method.
        // and we call this method on created object whose type is of super class and object created by subclass.
        // so, it is decided at run time and to decided which class is being referred not the type of reference variable.
        // so in this case the method of subclass will be executed.
        // Overridden method allow java to perform run time polymorphism
        //



    }


}

class Human { // it is parent class known as super class
    final String name;

    Human(String name){
        this.name = name;
    }

    void printName(){
        System.out.println("My name is " + name);
    }

}

class Student extends Human{

    Student(String name) {
        super(name); // super is used to call parent constructor. if it has no parameters there is no need to define but if it as parameters then we have to define
    }
    // we can directly use parents variables and methods in subclass without any super.
    // we have to use super only if we have multi level inheritance and one of the parent define the same name method and variable.

    void intro(){
        System.out.println("I AM A STUDENT.");
    }
}


