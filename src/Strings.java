public class Strings {
    static void main(String[] args) {
        // what is string?
        // string in java is an object which represent the sequence of characters
        // it is define as simple as other variables like boolean,int, and float

        String message = "Wellcome to the code";

        // string is immutable as it can not be changed after creation

        String name = "umair";
        String mainMessage = message + name; // In this mainMessage is a new string made

        // string is saved in special memory in the heap called string pool

        // if two string variable have same value then it point to the same address
        String a ="hello";
        String b ="hello";
        // As we created two strings but it is one created in string pool and both points to the same.

        // As in primitive types == is used to check equality but
        // In java .equals method is used to check. because identifier contains reference of object not the main value
        String c = new String("hello");
        String d = new String("hello");

        System.out.println(c==d);
        System.out.println(c.equals(d));

        // String is a final class to prevent changing
        // We also use string buffer and string builder to create string
        // string buffer is used in multi-thread its is slower and mutable
        // string builder is fast , mutable but not thread safe.

        StringBuilder greeting = new StringBuilder("hello");
        greeting.append(" ");
        greeting.append("umair");
        greeting.append(" ");
        greeting.append("how are you?");
        System.out.println(greeting);

        //String is a class and having objects. so it has many useful methods like
        // 1.lenght()
        System.out.println(greeting.length());
        // 2.charAt
        System.out.println(greeting.charAt(3));
        // 3.equals we already checked
        // 4.toUpperCase
        System.out.println(name.toLowerCase());
        // 5.trim
        System.out.println(name.trim());
        // 6.isEmpty used to check string is empty or not


    }
}
