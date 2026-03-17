
//? Onyx, 2026.
//? https://github.com/kokovt

import java.util.Scanner;

public class primePrinter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number: ");
        long inputNumber = input.nextLong();

        if (inputNumber <= 1L) {
            System.out.printf("There is no prime numbers prior to %d.", inputNumber);
            input.close();
            return;
        }

        if (inputNumber == 2L) {
            System.out.printf("2 is the only prime number in this set.", inputNumber);
            input.close();
            return;
        }

        System.out.printf("Primes up to %d:%n", inputNumber);

        System.out.print("2");

        for(long i = 3L; i <= inputNumber; i++) {
            if(primePrinter.primeTest(i)) System.out.printf(",%d", i);
        }


        input.close();
        return;

    }

    // ? Just taken from the isPrime file.
    public static boolean primeTest(long inputNumber) {
        if (inputNumber <= 1L)
            return false;
        if (inputNumber == 2L)
            return true;
        if (inputNumber % 2 == 0)
            return false;

        long limit = (long) Math.ceil(Math.sqrt(inputNumber));

        for (long i = 2; i < limit; i++) {
            if (inputNumber % i == 0)
                return false;
        }

        return true;
    }
}
