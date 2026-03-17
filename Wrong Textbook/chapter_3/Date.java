//? Date.java

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

//? Question 3.16
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


This file remains unchanged for this update; just to show its included in this question.
*/

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        // ? Really. You should not "assume" any given information is correct.
        // ? This is how we get error prone code. But Ill play ball, it saves me time
        // doing it correctly anyways.

        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return this.month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return this.day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public String displayDate() {
        return String.format("%d/%d/%d", this.month, this.day, this.year);
    }
}
