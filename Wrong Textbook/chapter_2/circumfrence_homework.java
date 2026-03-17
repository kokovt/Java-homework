//? Onyx, 2026.
//? https://github.com/kokovt

//* Question 2.28

/* 
 2.28 (Diameter, Circumference and Area of a Circle) Here’s a peek
 ahead. In this chapter, you learned about integers and the type int. Java
 can also represent floating-point numbers that contain decimal points, such
 as 3.14159. Write an application that inputs from the user the radius of a
 circle as an integer and prints the circle’s diameter, circumference and area
 using the floating-point value 3.14159 for π. Use the techniques shown in
 Fig. 2.7 . [Note: You may also use the predefined constant Math.PI for
 the value of π. This constant is more precise than the value 3.14159. Class
 Math is defined in package java.lang. Classes in that package are
 imported automatically, so you do not need to import class Math to use
 it.] Use the following formulas (r is the radius):
 Do not store the results of each calculation in a variable. Rather, specify
 each calculation as the value that will be output in a
 System.out.printf statement. The values produced by the
 circumference and area calculations are floating-point numbers. Such
 values can be output with the format specifier %f in a
 System.out.printf statement. You’ll learn more about floating-
 point numbers in Chapter 3 .
*/

//! Simplified -> Write a program that inputs radius, and returns diameter, area, and circumference.

//? I still hate this main function.
//? JS is better somehow.
//? Import the scanner class.
import java.util.Scanner;

public class circumfrence_homework {
    public static void main(String[] args) {
        // ? Create scanner object.
        Scanner scanner = new Scanner(System.in);

        // ? Prompt te user for the radius.
        System.out.println("What is the radius of your circle?");

        // ? Read the user input.
        float radius = scanner.nextFloat();

        // ? I have it rounding to 2 decimal places.
        System.out.printf("The diameter of the Circle is: %.2f.\n", radius * 2);
        System.out.printf("The circumfrence of the Circle is: %.2f.\n", radius * 2 * Math.PI);
        System.out.printf("The area of the circle is %.2f.\n", Math.PI * Math.pow(radius, 2));
        // ? Close the scanner.
        scanner.close();
    }
}