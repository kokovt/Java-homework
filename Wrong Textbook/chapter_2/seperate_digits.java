//? Onyx, 2026.
//? https://github.com/kokovt

//* Question 2.30

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
import java.util.Scanner;
public class seperate_digits {
    public static void main(String[] args) {
                //? Create scanner object.
        Scanner scanner = new Scanner(System.in);

        //? Prompt te user for the radius.
        System.out.println("Please enter a 5 digit number.");
        
        //? Read the user input.
        float number = scanner.nextInt();

        //? Math.floor is easier.
        System.out.printf("%d %d %d %d %d",
            (int)Math.floor(number/10000), 
            (int)Math.floor(number/1000)%10, 
            (int)Math.floor(number/100)%10,
            (int)Math.floor(number/10)%10,
            (int)number%10);

    
        //? Close the scanner.
        scanner.close();
    }
}
