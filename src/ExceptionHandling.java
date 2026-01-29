public class ExceptionHandling {
    static void main(String[] args) {
        // EXCEPTIONS
        // Exception is an abnormal condition occurs in the sequence of code at run time.
        // Exception is an object in the java.
        // It is created when any abnormal condition in the code occurred.
        // When abnormality occurred, object is created and thrown in the method create it.
        // then method choose to handle it and pass.


        // In java exceptions are handle by 05 keywords
        // 1. try 2. catch 3. throw 4. throws 5. finally

        // 1. try
        // the code which we want to monitor is placed in try block
        // if this code throws a exception

        // 2. catch
        // if code in block of try throw a exception we caught it by keyword catch

        // 3. finally
        // block which is confirmed run after the try block.

        // 4. throw
        // if we custom want to throw a error we used this keyword

        // 5. throws
        // a exception which throws out of the method means (throw by method) is specified by throws


        //        try {
        //            // code
        //        } catch (RuntimeException e) {
        //            throw new RuntimeException(e);
        //        } catch (Exception e) {
        //            throw new RuntimeException(e);
        //        } finally {
        //            System.out.println("At the last execute.");
        //        }

        //  All exception types are the subclasses of Exception class.
        // And at the last the Exception class itself is subclassed of throwable
        try {

            divide();
        } catch (RuntimeException e) {
            System.out.println(e);
        }



        // JAVA'S BUILT IN EXCEPTIONS
        // In java standard java package java.lang, java created different exceptional class already called built in exceptions
        // There are two types of built-in exceptions
        // 1. Unchecked Exceptions
        // 2. Checked Exceptions


    }

    static void divide() throws RuntimeException {
        System.out.println("hello before error");
        throw new RuntimeException("error");

    }

}
