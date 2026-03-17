//? Onyx, 2026.
//? https://github.com/kokovt

public class amicableNumbers {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        amicableNumbers.findAmicablePairs(10_000);
        long elapsedTimeMillis = System.currentTimeMillis() - start;
        System.out.printf("%n%d Milliseconds elapsed.", elapsedTimeMillis);
    }

    public static long sumFactors(long number) {
        if (number < 1)
            return 0;
        if (number == 1)
            return 1;

        long total_sum = 1;

        // ? awwwwwww ** doesn't work in java.
        for (int i = 2; i <= Math.ceil(Math.sqrt(number)); i++) {
            if (number % i == 0) {
                total_sum += i;

                if (Math.floorDiv(number, i) != i) {
                    total_sum += Math.floorDiv(number, i);
                }
            }
        }
        return total_sum;
    }

    public static void findAmicablePairs(int limit) {
        for (int i = 2; i <= limit; i++) {
            long divisor_sum = amicableNumbers.sumFactors(i);

            if (divisor_sum > i && amicableNumbers.sumFactors(divisor_sum) == i) {
                System.out.printf("%d,%d%n", i, divisor_sum);
            }
        }
    }
}
