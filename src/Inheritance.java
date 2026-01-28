public class Inheritance {
    static void main(String[] args) {

        // INHERITANCE
        // it is common in oops. in this we create a parent class which have some common traits(methods) which is then inherited by its child classes.
        // parent classes is known as superclasses and child classes is called subclasses.
        // to use inheritance it is very simple. we use simply write a class then keyword extend and the name of its parent class.

        Student umair = new Student("umair");
        umair.printName(); // we have not define printname function in student class but still we access it from the parent class
        // Anything in the superclass is accessible by its subclass except its private members.
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
        super(name);
    }

    void intro(){
        System.out.println("I AM A STUDENT.");
    }
}


