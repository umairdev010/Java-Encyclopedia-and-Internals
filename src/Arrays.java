import java.util.Arrays;

class Array {
    static void main(String[] args) {
        // what is an array?
        // Array is a collection of likely typed variables which is referred by a common name.

        // One Dimensional Array
        // To create array first we have to create a variable for that array with its type like

        int varName[] ;

        // To use array first we have to declare array with the keyword new following by type and size of array

        int marks[] = new int[5]; // Array is created for 5 integers and their values are set to zero initially by new keyword to zero.
        // new keyword set int values to zero, boolean to false and reference type to null
        // =>  there int defines the type marks is identifier and new keyword allocate the memory at last we tell how much size we required

        // now we can assign values to each position like
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        marks[3] = 4;
        marks[4] = 5;

        // we can access any value from the array by arrayName[itsIndex]

        System.out.println(marks[4]);

        // dont try to access values by index greater then array size which give arrayoutofindex error

        // you can directly assign the array with out using new new as

        String[] nameOfMonths = {"january","february","march","april","june"};

        System.out.println(nameOfMonths[3]);

        // Multi Dimensional Array
        // Multi dimensional array is an array of arrays. it is initialize  two square brackets as

        int[][] studentsRollNo ;
        studentsRollNo = new int[2][2];
        // and it is assign same like single but give no of row and no of column position

        studentsRollNo[0][0] = 5;
        studentsRollNo[0][1] = 6;
        studentsRollNo[1][0] = 7;
        studentsRollNo[1][1] = 8;

        // there is first bracket shows number of row and second shoes number of columns

        // Array useful methods
        // 1. arr.lenght
        System.out.println(nameOfMonths.length); // .length is called on array without parenthesis but in String we have to use it
        // 2. arr.sort
        Arrays.sort(marks);
        // 3. arr.tostring
        System.out.println(Arrays.toString(marks));

    }
}
