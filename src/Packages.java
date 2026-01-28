

public class Packages {
    static void main(String[] args) {

        // PACKAGES IN JAVA
        // Packages are basically containers for classes.
        // it is a way of keeping different classes in a unique bundle type container form.
        // By this we can make a class with a same name in one package and then also in a second/different package.

        pk.projects.Introduction.intro(); // this class is in package of projects
        com.practice.Introduction.intro(); // this file is in package of practice

        // Both have same names and method but we can used them because of their different packages

        // ACCESS CONTROL
        // As we already now about modifiers like public, private, protected, and default

        //                                               public                 protected            default              private
        // Access in same class                           yes                     yes                  yes                   yes
        // Access in different class of same package      yes                     yes                  yes                   no
        // Access in different class of different pkg     yes                     only if child        no                    no


        // IMPORTING A PACKAGE AND CLASS
        // we can in import a full package and its specific class to use as we import // pk.projects.Introduction class
        // we can also import it using import pk.projects and it imports full package.



    }
}
