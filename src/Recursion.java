public class Recursion {
    static void main(String[] args) {

        // RECURSION
        // Java supports recursion. Recursion is basically defining something in terms of itself.
        // Recursion is as

        System.out.println("the factorial of 9 is : " + factorial(9));


    }

    // you must have if condition for something to return the function other it never ends.
    static int factorial(int numb){
        if (numb == 1) return 1;
        return factorial(numb-1) * numb;
    }

}
