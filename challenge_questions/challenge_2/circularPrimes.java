//? Onyx, 2026.
//? https://github.com/kokovt

public class circularPrimes {

    static int[] powers = { 1, 10, 100, 1000, 10000, 100000, 1000000 };

    // ? Going through the effort to figure out how to remove string operations,
    // 27ms -> 17ms
    public static void main(String[] args) {
        // ? I am going to make this faster by just logging once.
        StringBuilder outputString = new StringBuilder("2");

        long start = System.currentTimeMillis();

        boolean[] isPrime = sieve(1_000_000);
        for (int i = 3; i <= 1_000_000; i+=2) {
            //? Slower but more scalable
            // int digitCount = (i == 0) ? 1 : (int) Math.log10(i) + 1;

            //? Faster, but less scalable. But Im just trying to push this as far as I can get right now.
            //? I use these all the time in js, I dont know the name but its basically an inline if statement.
            //? Using this instead of log, it brings me down to 9 milliseconds.
            int digitCount = (i < 10) ? 1 : (i < 100) ? 2 : (i < 1000) ? 3 : (i < 10000) ? 4 : (i < 100000) ? 5 : 6;

            if (i == 2) {
                continue;
            }

            boolean isCircularPrime = true;
            int number = i;

            for (int j = 0; j < digitCount; j++) {
                if (!isPrime[number]) {
                    isCircularPrime = false;
                    break;
                }

                number = rotateNumber(number, digitCount);
            }

            if (isCircularPrime) {
                outputString.append(", ").append(i);
            }
        }

        System.out.println(outputString);
        long elapsedTimeMillis = System.currentTimeMillis() - start;
        System.out.printf("%n%d Milliseconds elapsed.", elapsedTimeMillis);
    }

    // ? Deciding not to be lazy and just doing the math is so much faster
    // ? That change made the program 592% faster.
    public static int rotateNumber(int number, int digitCount) {
        return (number % 10) * powers[digitCount - 1] + (number / 10);
    }

    // ? Continuing the highway robbery of my own code.
    // ? When will the code stop being stolen from myself???
    // ? ... Long time no see, mr primetest.

    // ! This code was bugged,,,
    // ! It didnt have <= limit, so it was thinking some non-prime numbers were
    // prime, such as 9.
    public static boolean primeTest(long inputNumber) {
        if (inputNumber <= 1L)
            return false;
        if (inputNumber == 2L)
            return true;
        if (inputNumber % 2 == 0)
            return false;

        long limit = (long) Math.ceil(Math.sqrt(inputNumber));

        for (long i = 2; i <= limit; i++) {
            if (inputNumber % i == 0)
                return false;
        }

        return true;
    }

    public static boolean[] sieve(int max) {
        boolean[] isPrime = new boolean[max + 1];

        java.util.Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i)
                    isPrime[j] = false;
            }
        }

        return isPrime;
    }
}


