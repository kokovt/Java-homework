//? Onyx, 2026.
//? https://github.com/kokovt

//* Question 2.33

/* 

Making a Difference
1. 2.33 (Body Mass Index Calculator) We introduced the body mass index
(BMI) calculator in Exercise 1.10 . The formulas for calculating BMI are
(weightInPounds x 703)/heightInInches^2
or
weightInKilograms/heightInMeters^2
Create a BMI calculator that reads the user’s weight in pounds and height
in inches (or, if you prefer, the user’s weight in kilograms and height in
meters), then calculates and displays the user’s body mass index. Also,
display the BMI categories and their values from the National Heart Lung
and Blood Institute

https://www.nhlbi.nih.gov/calculate-your-bmi
*/

import java.util.Scanner;

public class BMI_calculator {
    public static void main(String[] args) {
        // ? If this was a project I *really* cared about, I would give the option for
        // metric or imperial units

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your weight in pounds.");
        double weightInPounds = scanner.nextDouble();

        System.out.println("Please enter your height in inches.");
        double heightInInches = scanner.nextDouble();


        double BMI = (weightInPounds*703f)/Math.pow(heightInInches,2);

        String outcome = "";

        if(BMI < 18.5) outcome = "underweight";
        if(BMI >= 18.5 && BMI < 25.0) outcome = "Healthy";
        if(BMI >= 25.0 && BMI < 30.0) outcome = "Overweight";
        if(BMI >= 30.0) outcome = "Obesity";

        System.out.printf("Your BMI is %.1f which puts you in the %s category.%n", BMI, outcome);
        System.out.printf("Underweight: Below 18.5%nHealthy: 18.5 - 24.9%nOverweight: 25.0 - 29.9, Obesity: 30.0 or above.%n");

        scanner.close();
    }
}
