public class IterationStatements {
    static void main(String[] args) {

        // ITERATION STATEMENTS
        // Iteration is executing specific block of code repetitively until the condition became false
        // There are four types of iteration methods unknown as loops
        // 1. For loop
        // 2. While loop
        // 3. Do while loop
        // 4. For each loop


        // 1. FOR LOOP
        // we generally use for loop when we know exact repetition of task and working with arrays , list etc

        // for (initialization ; condition ; update){
        //      body
        // }
        for (int i = 0; i < 5; i++) {
            System.out.println("hello umair " + i);
        }
        // initialization , condition , update these three parameters are optional not necessary
        // initialization in loop runs only once
        // we use for loop for performance

        // 2. WHILE LOOP
        // we used while loop when we don't know exact number of iterations.

        // initialization
        // while (condition){
        //      body
        //      update
        // }

        int i = 0;
        while (i < 5){
            System.out.println("ali " + i);
            i++;
        }
        // while loop don't have built in update. so Don't forget to update it.
        // in while loop update statement not always run like in for. if we use continue statement before update then it skip later part of code
        // it hard to optimize for jvm.


        // 3. DO WHILE LOOP
        // we used do while loop when we have to execute code block / task at least once.

        // do {
        //      body
        //      update
        // } while(condition)

        int j = 0;
        do {
            System.out.println("hello umair from do while");
            j++;
        } while (j < 5);

        // semi colon is required after while
        // it used where at least one user interaction is required
        // in it first code run then condition checked
        // update it in the body






    }
}
