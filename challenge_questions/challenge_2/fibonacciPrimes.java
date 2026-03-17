//? Onyx, 2026.
//? https://github.com/kokovt

public class fibonacciPrimes {
    public static void main(String[] args) {
        // ? I really need to start remembering numbers can be written with
        // underscores...
        // ? Makes reading the code so much easier...
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            fibonacciPrimes.checkIfFibonacciAndPrime(i);
        }
        long elapsedTimeMillis = System.currentTimeMillis() - start;

        System.out.printf("%n%d Milliseconds elapsed.", elapsedTimeMillis);
    }

    public static void checkIfFibonacciAndPrime(int number) {
        if (number < 0) {
            System.out.println("There is no fibonacci numbers beneath 0.");
            return;
        }

        if (number == 0) {
            System.out.print("0");
            return;
        }

        double highTestNumber = Math.sqrt(5d * Math.pow(number, 2) + 4);
        double lowTestNumber = Math.sqrt(5d * Math.pow(number, 2) - 4);

        if (Math.floor(highTestNumber) == highTestNumber || Math.floor(lowTestNumber) == lowTestNumber) {
            if (fibonacciPrimes.primeTest(number)) {
                System.out.printf(",%d", number);
            }
        }

    }

    // ? Continuing the highway robbery of my own code.
    // ? When will the code stop being stolen from myself???
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
