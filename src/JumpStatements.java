public class JumpStatements {
    static void main(String[] args) {

        // JUMP STATEMENTS
        // it is used to transfer control to another part of program
        // There are 03 types of these statement
        // 1. Break
        // 2. Continue
        // 3. Return

        // 1. BREAK
        // it is used to terminate the nearest loop immediately.

        int i = 0;
        while (true) {
            if (i == 3) break;
            System.out.println(i);
            i++;
        }
        // we see the condition is always tru but we break the loop and its not infinite
        // break is used only in switch statement and loops
        // we can also label it to break loop
        // we use label to exit more then one and we want to break which loop

        outerloop:
        for (int j = 0; true; ) {
            while (true) {
                if (j == 5) break outerloop;  // here we break outer loop
                System.out.println("from inner loop " + j);
                j++;
            }
        }


        // 2. CONTINUE
        // we used continue when we have to skip some specific iteration

        for (int k = 0; k < 8; k++) {
            if (k == 5) continue;      // here we skip the iteration for 5
            System.out.println("i am print " + k);
        }

        // 3. RETURN
        // it is used to send some value back to method
        // exit the method immediately

//        int sum(int a, int b){
//            return a + b;
//        }
        // define a function in other function is not allowed


        // we used return when we have to return value and return is mandatory in functions / methods which is not void.


        //-----------------------------------------------------THE END----------------------------------------------------------//


    }
}
