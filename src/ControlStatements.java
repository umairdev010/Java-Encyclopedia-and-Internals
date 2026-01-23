public class ControlStatements {
    static void main(String[] args) {

        // CONTROL STATEMENTS
        // Languages used control statements to control the flow and execution of code on statement of code.

        // Selection Statements
        // There are two selection statements in java if/else and switch statement use to execute specific block of code upon condition which is known only at runtime

        // the statement "if" branch the code in two different blocks on the base of condition

        // if(condition) {
        //      statement1
        //  }
        // there is condition will be any thing which return boolean value

        // else we used to execute code when the "if" block not execute due to condition
        // complete statement is as
        int a = 4;
        int b = 7;

        if (a > b){
            System.out.println("a is larger"); // if condition is true this code execute
        } else {
            System.out.println("b is larger"); // if condition is false this code execute
        }
        // "else if" if we want to check multiple condition then we make a if else if ladder as

        if (a > b){
            System.out.println("a is greater");
        } else if (a < b) {
            System.out.println("a is smaller ");
        } else {
            System.out.println("a and b is equal");
        }

        // it is not necessary to used comparison operation. we can also use variables which store boolean and functions which return boolean values
        // whenever the condition becomes true then the next conditions bypass

        // SWITCH STATEMENT
        // it is java's Multiway branch statement. it is an easy way to dispatch execution to different part of code.

        // there are two ways to write switch statement

    }
}
