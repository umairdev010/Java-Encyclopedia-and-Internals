public class Overloading {
    static void main(String[] args) {

        // METHOD OVERLOADING
        // In java class we can define same functions/methods with the same name as long as their parameters are different. this is called overloading.
        // And the process is called method overloading
        // method overloading is one of the way that tells that java supports polymorphism.
        // In method overloading, method must have different parameters type.
        // If different return type, it is not alone.

        Square newSquare = new Square(6);
        newSquare.area();   // its name is area
        newSquare.area(3); // its name is also area.
        // but we can call both one without arguments. And one with arguments


        // CONSTRUCTOR OVERLOADING
        // we can also overload constructor method

        Square newSquare1 = new Square(); // here we make object of Square without passing any length to constructor

        // call by value : when primitives type is passed to method its copy is created. then if we making a change in value. but original remain the same

        // call by reference : when an object is passed to a method then it change the original object its copy is not created in argument like other types

        // we can also return an object of type its class by making a method of it.

    }
}
 class Square{
    int length;

    Square(){
        System.out.println("NEW SQUARE CREATED WITHOUT PARAMENTERS");
    }

    Square(int length){
        this.length = length;
    }

    void area(){
        System.out.println("Area of the square is " + length*length);
    }

    void area(int length){
        System.out.println("Area of the square is " + length*length);
    }

 }