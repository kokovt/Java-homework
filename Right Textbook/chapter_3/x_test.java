// ? Onyx, 2026.
// ? https://github.com/kokovt

// ? Question 3.35

/*
    (Write a java statement) What will be the value of x after executing the following java statement? Assume that value of x is 5 before the execution.
    x += x++ - 5; 
 */

public class x_test {
    public static void main(String[] args) {
        int x = 5;
        x += x++ -5;
        System.out.printf("%d",x);
    }
}