//? target_heart_rate_calculator.java

//? Onyx, 2026.
//? https://github.com/kokovt

/*
3.16 (Target-Heart-Rate Calculator) While exercising, you can use a
heart-rate monitor to see that your heart rate stays within a safe range
suggested by your trainers and doctors. According to the American Heart
Association (AHA) (http://bit.ly/TargetHeartRates), the
formula for calculating your maximum heart rate in beats per minute is
220 minus your age in years. Your target heart rate is a range that’s 50–
85% of your maximum heart rate. [Note: These formulas are estimates
provided by the AHA. Maximum and target heart rates may vary based on
the health, fitness and gender of the individual. Always consult a
physician or qualified health-care professional before beginning or
modifying an exercise program.] Create a class called HeartRates.
The class attributes should include the person’s first name, last name and
date of birth (consisting of separate attributes for the month, day and year
of birth). Your class should have a constructor that receives this data as
parameters. For each attribute provide set and get methods. The class also
should include a method that calculates and returns the person’s age (in
years), a method that calculates and returns the person’s maximum heart
rate and a method that calculates and returns the person’s target heart rate.

Write a Java app that prompts for the person’s information, instantiates an
object of class HeartRates and prints the information from that object
—including the person’s first name, last name and date of birth—then
calculates and prints the person’s age in (years), maximum heart rate and
target-heart-rate range

*/
import java.util.Scanner;
public class target_heart_rate_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please input your first name: ");
        String firstName = input.next();

        System.out.print("Please input your last name: ");
        String lastName = input.next();

        System.out.print("Please input what Day of month you were born (I.E: May 30th -> 30): ");
        int birthDay = input.nextInt();

        System.out.print("Please input what Month you were born (as an integer, I.E: May -> 5): ");
        int birthMonth = input.nextInt();

        System.out.print("Please input what year you were born: ");
        int birthYear = input.nextInt();


        HeartRates userHeartRates = new HeartRates(firstName, lastName, birthDay, birthMonth, birthYear);

        System.out.printf("First name: %s,%nLast name: %s,%nDate of birth: %s,%nCurrent Age: %d,%nMaximum Heart rate: %d,%nEstimated heart rate range: %d - %d",
            userHeartRates.getFirstName(),
            userHeartRates.getLastName(),
            userHeartRates.getDisplayBirthdate(),
            userHeartRates.getAge(),
            userHeartRates.maxHeartRate(),
            userHeartRates.minHeartRateRange(),
            userHeartRates.maxHeartRateRange()
        );

        input.close();
    }
}
