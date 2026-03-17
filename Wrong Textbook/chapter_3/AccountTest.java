//? AccountTest.java

//? Onyx, 2026.
//? https://github.com/kokovt

//? Question 3.11
/*
    3.11 (Modified Account Class) Modify class Account (Fig. 3.8 ) to
provide a method called withdraw that withdraws money from an
Account. Ensure that the withdrawal amount does not exceed the
Account’s balance. If it does, the balance should be left unchanged and
the method should print a message indicating "Withdrawal amount
exceeded account balance." Modify class AccountTest
(Fig. 3.9 ) to test method withdraw
*/

//? Question 3.15
/*
3.15 (Removing Duplicated Code in Method main) In the
AccountTest class of Fig. 3.9 , method main contains six statements
(lines 11–12, 13–14, 26–27, 28–29, 38–39 and 40–41) that each display an
Account object’s name and balance. Study these statements and
you’ll notice that they differ only in the Account object being
manipulated—account1 or account2. In this exercise, you’ll define a
new displayAccount method that contains one copy of that output
statement. The method’s parameter will be an Account object and the
method will output the object’s name and balance. You’ll then replace
the six duplicated statements in main with calls to displayAccount,
passing as an argument the specific Account object to output.
Modify class AccountTest of Fig. 3.9 to declare method
displayAccount (Fig. 3.20 ) after the closing right brace of main and
before the closing right brace of class AccountTest. Replace the
comment in the method’s body with a statement that displays
accountToDisplay’s name and balance

*/
// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        displayBalance(account1, account2);

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        depositBalance(input, account1);

        displayBalance(account1, account2);

        depositBalance(input, account2);

        displayBalance(account1, account2);

        withdrawBalance(input, account1);

        withdrawBalance(input, account2);

        displayBalance(account1, account2);

        input.close();
    }

    // Display balance function
    public static void displayBalance(Account account1, Account account2) {
        // display balances
        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());
    }

    public static void depositBalance(Scanner input, Account account) {
        System.out.printf("Enter deposit amount for %s: ", account.getName()); // prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to %s's balance%n%n",
                depositAmount, account.getName());

        account.deposit(depositAmount); // add to account1’s balance
    }

    public static void withdrawBalance(Scanner input, Account account) {
        System.out.printf("Enter withdraw amount for %s: ", account.getName()); // prompt
        double withdrawAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nsubtracting %.2f from %s's balance%n%n",
                withdrawAmount, account.getName());

        account.withdraw(withdrawAmount); // add to account1’s balance
    }
}