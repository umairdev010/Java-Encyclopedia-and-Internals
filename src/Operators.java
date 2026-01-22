public class Operators {
    static void main(String[] args) {
        // what is operators?
        // operators are special symbols in java which tells which operation is to performs on values /variables to get result
        // there are 08 operators used in java
        // 1. Arithmetic Operators (used for math calculations)
        // 2. Relational Operators (used to relate values)
        // 3. Logic Operators (used to combine logics together)
        // 4. Assignment Operators (used to assign values)
        // 5. Unary Operators (use for single operand operations)
        // 6. Bit-wise Operators (used for bit-level operations)
        // 7. Ternary operators (used for short conditions check)
        // 8. Shift operators (used to shift bits left/right)


        //  1. ARITHMETIC OPERATORS
        // Arithmetic operators are used to perform mathematical operations on primitive numeric types like int ,short, byte, and double
        // Addition +
        int sum = 4 + 9 ;
        System.out.println(sum);
        // Subtraction -
        int difference = 5 - 1;
        System.out.println(difference);
        // Multiplication
        int product = 5 * 4;
        System.out.println(product);
        // Division
        int dividend = 8/2;
        System.out.println(dividend);
        // Modulus
        int reminder = 9%2;
        System.out.println(reminder);


        // 2. RELATIONAL OPERATORS
        // Relational operators compare two values and return the boolean result

        // Equal too ==
        System.out.println(5==5);
        // Not equal too !=
        System.out.println(5!=6);
        // Greater then >
        System.out.println(5>7);
        // Less then <
        System.out.println(7<4);
        // Greater then and equal too >=
        System.out.println(7>=7);
        // Less then and equal too
        System.out.println(5<=7);

        // Always return the boolean value true/false
        // Relational Operators also work for characters because they at the end store unicode values as int
        // In objects we use == to compare reference but in objects we not used > , < .


        // 3. LOGIC OPERATORS
        //  Logic operators are used to join multiple boolean values/expressions and return a boolean result

        // Logic And - Short Circuit && return only true when both side are true
        // if left condition is false then its not evaluate right
        System.out.println(true && false);
        // Logic Or || return false only when both conditions are false if one is true then return true
        // First evaluate left condition
        System.out.println(true || false);
        //Logical Xor ^ return true if both operands are different
        // true ^ true --> false
        // true ^ false --> true
        System.out.println(true ^ false);
        // Logical Not ! make true --> false and false --> true
        System.out.println(!true);
        // Logical And & same like && but in it if first side is false then it not evaluate second condition. But in & both conditions are evaluated
        // Logical Or | in this case in || if first condition is true then second is not evaluated but in | if first is true it not skip 2nd.
        // Summary & and | evaluate both side conditions


        // 4. ASSIGNMENT OPERATORS
        // Assignment operators are used to store values in variables.
        // = is the assignment operator but we can combine used it with other operations like
        int a = 10; // = is assignment operator
        System.out.println(a);
        // Combined used with other operators
        // With + --> +=
        a += 5; // it is equal to a = a + 5;
        System.out.println(a);
        // With - --> -=
        a -= 5; // it is equal to a = a -5;
        System.out.println(a);
        // With * --> *=
        a *= 5; // it is equal to a = a * 5;
        System.out.println(a);
        // With / --> /=
        a /= 5; // it is equal to a = a/5;
        System.out.println(a);

        // It can also be used with other operators like Logic Operators &= ,|=  and ^=
        // = assign values and if we pass to condition it evaluate to true. like a = 4 --> true


        // 5. UNARY OPERATORS
        // Unary operators used to a single operand to perform operations

        // Unary plus + (used to indicate positive value)
        // Unary negative - (used to indicated negative value)
        // Increment ++ (used to increased the value by 1)
        // Decrement -- (used to decrease the value by 1)
        // Logical Not is also Unary Operator
        // Bitwise complement ~ used to flip all values means 0110 --> 1001

        // if ++a it is pre-increment and if a++ it is post-increment
        // same like for decrement
        // pre means increment first then use
        // post means use first then increment


        // 6. BIT-WISE OPERATORS
        // Bit-wise operators used to manipulate individual bits, gives low level control, performance and efficiency

        // Bit-wise And & --> give result 1 only if both values are one

        // Bit-wise OR | --> give result 0 only if both values are zero

        // Bit-wise XOR ~ --> if both bits same give zero and both bits different give 1

        // Bit-wise Not ! --> flip the all given bits

        // Left shift << --> moves the bits to left side add zero on right
        int g = 5; // 00000101
        System.out.println(g << 1); // now 00001010 = 10
        // no * (2 power n)

        // Right shift (signed) >> --> moves the bits to right by 0 if positive number and by 1 if negative numbers
        int f = 10; // 00001010
        System.out.println(f >> 1); // 00000101 = 5
        // no / (2 power n)

        // Right shift(Unsigned) >>>  ---> always the bit by to right by 0. no matter positive and negative number
        // means if number if -1. its has 1 in its first signed bit. means

        byte t = -1 ; // 11111111
        System.out.println(t >>> 1); // make it 01111111 = 128 but as it important to know that
        // java convert it to int first which is 32 bit. so it is now not byte its int and it is = 01111111 11111111 11111111 11111111 which is equal to 2147483647 which is largest number of int

        // one more concept about left shift << if the value if 1 means 00000001 and we shift it to 31 bit like
        System.out.println(1 << 31); // it became the smallest number of int. because now 1 reached the first bit which is sign bit and we make it 1 and 1 is for negative




            }
}
