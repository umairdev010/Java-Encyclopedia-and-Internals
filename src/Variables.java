public class Variables {
    static void main(String[] args) {
        // what is variable
        // A variable is a named memory location used to store data every variable has a statically typed means has fixed type known at compile time
        // Variable declaration and initialization

        // type identifier = value ;   <== template to assign variables

        int a ;  // this is called variable initialization
        a = 10; // this is code variable declaration
        int b = 23; // both initialization and declaration at a time

        // java has eight primitives type of data which is divided into 4 groups
        // 1. Integers (int , byte , long , short)
        // 2. Floating-point numbers (float , double)
        // 3. Boolean
        // 4. Character

        // Integers =>
        // java support all signed numbers positive plus negative but not unsigned.

        long l = 2345632334567L; // long occupy 64 bits means 8 Bytes of memory
        int f = 12 ; // int occupy 32 bits means 4 Bytes of memory
        short s = 23 ; // short occupy 16 bits means 2 Bytes of memory
        byte b1 = 3;  // byte occupy 8 bits means 1 Bytes of memory

        // Floating-Point numbers is also called Real Numbers. they are used when evaluating fractions
        // Java implements the standard IEEE-754
        // IEEE-754 is the international standard for representing decimal point numbers
        // As computer understand only binary so, decimal stored as | sign | Exponent | Mantissa |

        float dp = 1.22F; // float occupy 32 bits and structure as  | sign(1) | Exponent(8) | Mantissa(23) |
        double pointno = 12.34D; //double occupy 64 bits and structure as | sign(1) | Exponent(11) | Mantissa(52) |

        // character in java represent by char and java use unicodes to represent it.
        // unicode is international character set which includes all character in human language
        char e =  'V'; // use single quotes and it occupies 16 bits means 2 Bytes of memory
        //  In the formal specification for Java, char is referred to as an integral type

        // Boolean is used as logic values. it will be only true and false

        boolean logic = true;


        //Default Values Of All Primitive types
        // long  0L
        // int 0
        // short 0
        // byte 0
        // float 0.0f
        // double 0.0d
        // char /u0000
        // boolean false


        // Scope Of Variable
        // There are 4 types of scope for the variables

        // instance variable which is related to object created by th class.
        // static variable which is related to class and class property
        // local which is temporary storage defined between brackets { }
        // parameters when we pass arguments to function and method it become a new copy to pass which used in function


        // Type Conversion And Typed Casting




    }
}
