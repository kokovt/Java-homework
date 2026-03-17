//? HeartRates.java

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
The class attributes should include 
the person’s first name, 
last name and
date of birth (consisting of separate attributes for the month, day and year
of birth). 

Your class should have a constructor that receives this data as
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

import java.time.LocalDate;

public class HeartRates {
    private String firstName;
    private String lastName;

    // ? Why not reuse what we have?
    private Date birthdate;

    public HeartRates(String firstName, String lastName, int birthDay, int birthMonth, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = new Date(birthMonth, birthDay, birthYear);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }


    public void setBirthDay(int day) {
        this.birthdate.setDay(day);
    }

    public int getBirthDay() {
        return this.birthdate.getDay();
    }

    public void setBirthMonth(int month) {
        this.birthdate.setMonth(month);
    }

    public int getBirthMonth() {
        return this.birthdate.getMonth();
    }

    public void setBirthYear(int year) {
        this.birthdate.setYear(year);
    }

    public int getBirthYear() {
        return this.birthdate.getYear();
    }

    public String getDisplayBirthdate() {
        return this.birthdate.displayDate();
    }

    public int getAge() {
        LocalDate today = LocalDate.now();

        int Age = today.getYear() - this.birthdate.getYear();

        //? This is checking if the month of the year is earlier; if so, they are 1 year younger than calculated.
        if(today.getMonthValue() < this.birthdate.getMonth()) {
            Age -= 1;
        } else if(today.getDayOfMonth() < this.birthdate.getDay() && today.getMonthValue() == this.birthdate.getMonth()) {
            //? Same as above, but only check if the month today is the same as the month the person was born.
            //? If it is not done this way, it will miscalculate through going off of the day only, not taking into account if the month is past. We dont need to check if it is prior, because thats what the if statement before this does.
            //? If it is a month before, this code will be skipped.
            Age -= 1;
        }

        return Age;
    }

    public int maxHeartRate() {
        return 220 - this.getAge();
    }

    public int minHeartRateRange() {
        return (int)((220-this.getAge())*0.5);
    }

    public int maxHeartRateRange() {
        return (int)((220-this.getAge())*0.85);
    }

}
