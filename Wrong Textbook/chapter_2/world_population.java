//? Onyx, 2026.
//? https://github.com/kokovt

//* Question 2.34

/*
2.34 (World Population Growth Calculator) Search the Internet to
determine the current world population and the annual world population
growth rate. Write an application that inputs these values, then displays the
estimated world population after one, two, three, four and five years.
*/

import java.util.Scanner;
public class world_population {
    public static void main(String[] args) {
        //? This number is bigger than an int. I need a long.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter current population.");
        long current_population = scanner.nextLong();

        System.out.println("Please enter the growth rate (Convert percentage to decimal, IE: 1.0085 for .85%).");
        double growth_rate = scanner.nextDouble();

        System.out.printf("Population next year: %d%n", (long)(current_population*growth_rate));
        System.out.printf("Population in 2 years: %d%n", (long)(current_population*Math.pow(growth_rate,2d)));
        System.out.printf("Population in 3 years: %d%n", (long)(current_population*Math.pow(growth_rate,3d)));
        System.out.printf("Population in 4 years: %d%n", (long)(current_population*Math.pow(growth_rate,4d)));
        System.out.printf("Population in 5 years: %d%n", (long)(current_population*Math.pow(growth_rate,5d)));

        scanner.close();

    }
}
