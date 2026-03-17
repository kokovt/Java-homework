//? DateTest.java

//? Onyx, 2026.
//? https://github.com/kokovt

//? Question 3.14

/*
    3.14 (Date Class) Create a class called Date that includes three instance
variables—a month (type int), a day (type int) and a year (type int).
Provide a constructor that initializes the three instance variables and
assumes that the values provided are correct. Provide a set and a get
method for each instance variable. Provide a method displayDate that
displays the month, day and year separated by forward slashes (/). Write a
test app named DateTest that demonstrates class Date’s capabilities.
*/

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        System.out.println("Starting with preset-test dates: Christmas, 2026");
        System.out.println("Expecting:");
        System.out.println("The day set was 31");
        System.out.println("The month set was 12");
        System.out.println("The year set was 2026");
        System.out.println("Formatted date: 12/31/2026");
        System.out.println("--------------------------");
        System.out.println("The output was:");
        Date testDate = new Date(12, 31, 2026);
        System.out.printf("The day set was %d%n", testDate.getDay());
        System.out.printf("The month set was %d%n", testDate.getMonth());
        System.out.printf("The year set was %d%n", testDate.getYear());
        System.out.printf("Formatted date: %s%n", testDate.displayDate());

        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("Testing Day setting....");
        System.out.print("Input an integer to set the day:   ");
        int day = scanner.nextInt();
        testDate.setDay(day);

        System.out.printf("The day set was %d%n", testDate.getDay());
        System.out.printf("The month set was %d%n", testDate.getMonth());
        System.out.printf("The year set was %d%n", testDate.getYear());
        System.out.printf("Formatted date: %s%n", testDate.displayDate());
        System.out.println("--------------------------");
        System.out.println("Testing Month setting....");
        System.out.print("Input an integer to set the month:   ");
        int month = scanner.nextInt();
        testDate.setMonth(month);
        System.out.printf("The day set was %d%n", testDate.getDay());
        System.out.printf("The month set was %d%n", testDate.getMonth());
        System.out.printf("The year set was %d%n", testDate.getYear());
        System.out.printf("Formatted date: %s%n", testDate.displayDate());
        System.out.println("--------------------------");
        System.out.println("Testing Year setting....");
        System.out.print("Input an integer to set the Year:  ");
        int year = scanner.nextInt();
        testDate.setYear(year);
        System.out.printf("The day set was %d%n", testDate.getDay());
        System.out.printf("The month set was %d%n", testDate.getMonth());
        System.out.printf("The year set was %d%n", testDate.getYear());
        System.out.printf("Formatted date: %s%n", testDate.displayDate());
        System.out.println("--------------------------");
        System.out.println("Testing complete!");

        scanner.close();
    }
}
