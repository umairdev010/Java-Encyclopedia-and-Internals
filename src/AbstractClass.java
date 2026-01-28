public class AbstractClass {
    static void main(String[] args) {

        // ABSTRACT CLASS
        // It is a class in java which cannot be initiated. Means we cannot make its objects.
        // But we used it as a blueprint / template for building other classes.
        // we use abstract class when we need to implement some method its subclasses made by it.
        // we initiate method but not gives it complete body.
        // the subclass is to define the complete method.


        // FINAL KEYWORD
        // There is 03 uses of final keyword.
        // 1. As we see previous we use final keyword with variables to make them constant (value cannot change once assigned)
        // 2. We can also use it to prevent methods from override.
        // 3. We can also use the final keyword in front of class. To prevent class from being inherited.

    }
}


abstract class Shapes {
    abstract void shape(); //As we make this method absract every subclass of shapes must implement the area method
    final void intro(){
        System.out.println("this method is for Shapes only");
    }
}

class Rectangle extends Shapes{
    int len;
    int width;

    Rectangle(int l,int w){
        len = l;
        width = w;
    }

    // void intro(){} we cannot override it.

    @Override
    void shape() { // it is important for us to design this method otherwise give error.
        System.out.println("THE AREA OF RECTANGLE IS " + len*width);
    }
}
