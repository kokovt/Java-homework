
//? Onyx, 2026.
//? https://github.com/kokovt
//? Regularize Lambda functions ;-;

import java.util.Scanner;

public class numberOrganizer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a 4 digit number: ");
        int number = input.nextInt();

        if (number > 9999) {
            System.out.println("Invalid Number: Too long");
            input.close();
            return;
        }

        int first_digit = number % 10;
        int second_digit = (int) (Math.floor(number / 10)) % 10;
        int third_digit = (int) (Math.floor(number / 100)) % 10;
        int fourth_digit = (int) (Math.floor(number / 1000)) % 10;

        if (first_digit == second_digit && second_digit == third_digit && third_digit == fourth_digit) {
            System.out.println("Invalid number: Cannot have 4 repeated places.");
            input.close();
            return;
        }

        int[] digits = { first_digit, second_digit, third_digit, fourth_digit };

        // ? Less to greater filter
        conditional ltg_filter = (int[] array, int i) -> array[i] > array[i + 1];
        int[] ltg_sorted = numberOrganizer.sort(digits.clone(), ltg_filter);

        conditional gtl_filter = (int[] array, int i) -> array[i] < array[i + 1];
        int[] gtl_sorted = numberOrganizer.sort(digits.clone(), gtl_filter);

        System.out.printf("The inputted numbers sorted least to greatest is %d.%n",
                numberOrganizer.array_to_int(ltg_sorted));
        System.out.printf("The inputted numbers sorted greatest to least is %d.",
                numberOrganizer.array_to_int(gtl_sorted));

        input.close();

    }

    public static int[] sort(int[] array, conditional condition) {
        boolean sorted = false;
        int i = 0;
        boolean swapped_this_loop = false;

        while (sorted == false) {
            if (condition.condition(array, i)) {
                int intermediary = array[i];
                array[i] = array[i + 1];
                array[i + 1] = intermediary;
                swapped_this_loop = true;
            }

            i++;

            if (i == array.length - 1) {
                if (swapped_this_loop == false)
                    break;
                i = 0;
                swapped_this_loop = false;
            }
        }

        return array;
    }

    public static int array_to_int(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 || array[i] > 9) {
                return -1;
            }

            result = result * 10 + array[i];
        }

        return result;
    }
}

@FunctionalInterface
interface conditional {
    boolean condition(int[] array, int i);
}