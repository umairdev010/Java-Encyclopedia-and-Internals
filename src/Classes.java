public class Classes {
    static void main(String[] args) {

        // Class is a template and object is its instance. so,we see that object and instance used interchangeably
        // Class is made by the word class.
        // All variables define in a class is known as instance variables.
        // All things defined in a class is called class members
        Box myBox = new Box();  // here we make a object of class Box.
        // Each object have its own instance variables changing one object doesn't effect any other
        myBox.width = 5; // assigning the value of width to 5
        myBox.height = 23; // assigning the value of height to 23
        myBox.area(); // calling the method area of object myBox

        // By making class we are actually making a new data type.
        // And we simply used it like making variable of type that class we make
        // like Box myBox;    there is type Box and identifier myBox which point to reference of object which created in heap when we declare it using new operator
        // new operator dynamically make a object and return its reference to variable
        // the parenthesis () after Box usually calls it constructor.
        // Constructor define occurs when the object is created. Most of the classes defines it constructor explicitly.
        // if we don't specify a constructor then java make it automatically
        // new keyword allocate memory for object creation at run time.
        Box youBox = myBox; // here object copy is not created but both point to the same object.
        youBox.height = 5; // here change in youBox make changes.
        myBox.area(); // here object is one both points to the same. so, values changed

        myBox = null; // but if we make one object null. other will still points to the same reference.
        youBox.area();

        // area is a method in the class Box.
        // the general structure of method is as

        // type nameOfMethod(parameters){
        //      body
        // }
        // type is the simply type the method return. it will be simply a new Box object also.
        // if it doesn't return any thing then it will be void type. As our main method are.




    }
}

class Box{
    int width;
    int height;

    // Constructor
    // constructor initializes an object immediately upon its creation
    // it is same name of the class in which it is residing and looking like a method.
    // it has not any return type and not even void. because its return type is the class itself
    // the job of a constructor is to initialize the internal state of object upon creation. so we get a usable object.
    // so understand the Box() after new is actually calling the constructor



    void area(){
        System.out.println("THE AREA IS " + height * width);
    }

} // Here we create a class box with two instance variables width and height.

