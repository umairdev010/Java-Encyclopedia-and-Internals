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

        // 1.   switch (expression) {
        //          case value1:
        //              statement1;
        //              break;
        //          case value2:
        //              statement2;
        //              break;
        //
        //          default : last statement is no case execute
        //  }

        int marks = 80;

        switch (marks){
            case  80 :
                System.out.println("VERY GOOD");
                break;
            case 70 :
                System.out.println("GOOD");
                break;
            default:
                System.out.println("Student don't fall in these criteria");
        }

        // DATA Types Allowed in Switch
        // int,byte,shot,char
        // String also allowed Java 7+

        // 2. we can assign switch to a variable. In this no break is used we return the values

        String day = "MONDAY";

        String message = switch (day){
            case "MONDAY" -> "TODAY IS MONDAY";
            case "FRIDAY" -> "TODAY IS FRIDAY";
            case "SUNDAY" -> "TODAY IS SUNDAY";  // WE CANNOT USE SAME CASE TWICE MEANS ONE CASE AT A TIME NO DUPLICATE
            default -> "DAY NOT FOUND";
        };

        System.out.println(message);

        // IMPORTANT POINT
        // 1. we must pass boolean and expression return boolean. because if only accept boolean and java not auto covert number to boolean
        // 2. else block is always binds to the nearest if called Dangling else problem
        // 3. switch statement checks equality not conditions. we can't write conditions in case also.
        // 4. switch convert string to hashcode then compare by .equals for equality.
        // 5. break is necessary in cases otherwise control fall through and execution of switch continue.
        // 6. default in switch appears anywhere.
        // 7. we can't compare null in switch. it gives exception error if we try.

        //------------------------------------------------THE END-----------------------------------------------//
    }
}
