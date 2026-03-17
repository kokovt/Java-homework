
//? Onyx, 2026.
//? https://github.com/kokovt

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number to check: ");
        long inputNumber = input.nextLong();
        long start = System.currentTimeMillis();
        boolean prime = isPrime.primeTest(inputNumber);
        long elapsedTimeMillis = System.currentTimeMillis()-start;

        System.out.printf("The function took %d milliseconds.%n",elapsedTimeMillis);

        if (prime) {
            System.out.printf("The number %d is prime.", inputNumber);
            input.close();
            return;
        }
        System.out.printf("The number %d is not prime.", inputNumber);
        input.close();
        return;
    }

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
