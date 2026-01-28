public class AbstractClass {
    static void main(String[] args) {

        // ABSTRACT CLASS
        // It is a class in java which cannot be initiated. Means we cannot make its objects.
        // But we used it as a blueprint / template for building other classes.
        // we use abstract class when we need to implement some method its subclasses made by it.
        // we initiate method but not gives it complete body.
        // the subclass is to define the complete method.


        // FINAL KEYWORD
        //

    }
}


abstract class Shapes {
    abstract void shape(); //As we make this method absract every subclass of shapes must implement the area method
}

class Rectangle extends Shapes{
    int len;
    int width;

    Rectangle(int l,int w){
        len = l;
        width = w;
    }

    @Override
    void shape() { // it is important for us to design this method otherwise give error.
        System.out.println("THE AREA OF RECTANGLE IS " + len*width);
    }
}
