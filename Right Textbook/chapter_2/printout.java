//? Onyx, 2026.
//? https://github.com/kokovt

//* Question 2.14

/*
2.14

Write an application that displays the numbers 1 to 4 on the same line, with each pair of adjacent numbers separated by one space. Use the following techniques:

a) Use one System.out.println statement.

b) Use four System.out.print statements.

c) Use one System.out.printf statement. 

*/

public class printout {
    public static void main(String[] args) {
        System.out.println("1 2 3 4");
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4\n");
        System.out.printf("%d %d %d %d%n",1,2,3,4);
    }
}
