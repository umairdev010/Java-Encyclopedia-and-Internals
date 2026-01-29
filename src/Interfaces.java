public class Interfaces {
    static void main(String[] args) {

        // INTERFACE
        // Interface is just like a abstract class but we can implements only methods in it.
        // And a class can implements more then one interface at a time.

        Students umair = new Umair(); // here we gives type as Student
        umair.intro(); // it is method which is implemented
        umair.madeon(); // it is method which is overridden
        Students.usedInterface(); // here we call static method og interface by its name
        // interface can be extended by adding word like extends same like inheritance of classes
        // a class can implements multiple interface but for class(abstract/normal) it will be one only


    }
}

interface Students {
    void intro();  // by implicit java adds public abstract
    static void usedInterface(){
        System.out.println("it is interface of Students");
    }
    int date = 12122026; // by implicit public static final (constant)
    default void madeon(){
        System.out.println("Made on date " + date);
    }
}

class Umair implements Students {

    @Override
    public void intro() {
        System.out.println("My name is umair");
    }
//    int newdate = date;   here we can also access interface variables
    @Override
    public void madeon() {
        Students.super.madeon(); // here call again parents means student method by super
    }
}
