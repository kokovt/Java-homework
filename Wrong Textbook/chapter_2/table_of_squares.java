//? Onyx, 2026.
//? https://github.com/kokovt

//* Question 2.31

/* 

2.30 (Separating the Digits in an Integer) Write an application that inputs
one number consisting of five digits from the user, separates the number
into its individual digits and prints the digits separated from one another
by three spaces each. For example, if the user types in the number 42339,
the program should print
4 2 3 3 9
Assume that the user enters the correct number of digits. What happens
when you enter a number with more than five digits? What happens when
you enter a number with fewer than five digits? [Hint: It’s possible to do
this exercise with the techniques you learned in this chapter. You’ll need to
use both division and remainder operations to “pick off ” each digit.]

*/

//! I really hated doing this without a for loop
public class table_of_squares {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s%-15s%n", "number", "square", "cube");
        var x = 0;
        System.out.printf("%-15d%-15d%-15d%n", x, x * x, x * x * x);
        x++;
        System.out.printf("%-15d%-15d%-15d%n", x, x * x, x * x * x);
        x++;
        System.out.printf("%-15d%-15d%-15d%n", x, x * x, x * x * x);
        x++;
        System.out.printf("%-15d%-15d%-15d%n", x, x * x, x * x * x);
        x++;
        System.out.printf("%-15d%-15d%-15d%n", x, x * x, x * x * x);
        x++;
        System.out.printf("%-15d%-15d%-15d%n", x, x * x, x * x * x);
        x++;
        System.out.printf("%-15d%-15d%-15d%n", x, x * x, x * x * x);
        x++;
        System.out.printf("%-15d%-15d%-15d%n", x, x * x, x * x * x);
        x++;
        System.out.printf("%-15d%-15d%-15d%n", x, x * x, x * x * x);
        x++;
        System.out.printf("%-15d%-15d%-15d%n", x, x * x, x * x * x);
        x++;
        System.out.printf("%-15d%-15d%-15d%n", x, x * x, x * x * x);

        System.out.printf("%n%n%nAlso, done with a loop:%n");
        System.out.printf("%-15s%-15s%-15s%n", "number", "square", "cube");

        for (double j = 0; j <= 10; j++) {
            System.out.printf("%-15.0f%-15.0f%-15.0f%n", j, Math.pow(j,2), Math.pow(j,3));
        }

    }
}
