//? Onyx, 2026.
//? https://github.com/kokovt


import java.util.Arrays;

import java.util.Scanner;

class simple_array_operations {
    public static void main(String[] args) {
        System.out.println("Question 6.8:");
        System.out.println("b)");
        System.out.println("(I am creating an array first.. so I can print the element for question a)");
        int[] p = fill_6_digit_array();
        System.out.println(Arrays.toString(p));

        System.out.println("a)");
        System.out.println(p[3]);

        System.out.println("c)");
        float[] array = generate_random_array(100);
        System.out.println(Arrays.toString(array));
        System.out.println(get_largest_value(array));

        System.out.println("d)");
        int[] int_array = generate_random_int_array(100);
        int[] reversed = reverse_array(int_array);
        System.out.println(Arrays.toString(int_array));
        System.out.println(Arrays.toString(reversed));

        //? If you want to see this, uncomment it. It was *not* a question I was supposed to do.
        // float[][] array_2d = generate_random_2d_array(10, 2);
        // print_2d_array(array_2d);


        
        System.out.println("e)");
        System.out.println(get_product_of_elements(generate_random_array(10)));

        System.out.println("Question 6.11");
        System.out.println("a)");
        int[] array_to_set_to_zero = generate_random_int_array(30);
        System.out.println(Arrays.toString(set_elements_to_zero(array_to_set_to_zero)));

        System.out.println("b)");
        int[] bonus = generate_random_int_array(20);
        System.out.println(Arrays.toString(bonus));
        System.out.println(Arrays.toString(multiply_elements_by_2(bonus)));

        System.out.println("c)");
        print_array(generate_and_sort_array(10));


        System.out.println("6.12)");

        Scanner input = new Scanner(System.in);
        int[] numbers = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        for(int i = 0; i < 10; i++) {
            System.out.print("Please enter a number: ");
            int number = input.nextInt();
            if(number < 10 || number > 100) {
                continue;
            }
            numbers[i] = number;
        }

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == -1) {
                continue;
            }
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    numbers[j] = -1;
                }
            }
        }

        System.out.println("The numbers are: ");

        System.out.print("[");
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] != -1) {
                System.out.printf("%d,", numbers[i]);
            }
        }
        System.out.printf("]%n");

        input.close();

    }

    public static float[] generate_random_array(int length) {
        float[] c = new float[length];
        for (int i = 0; i < c.length; i++) {
            c[i] = (float) Math.random() * 100;
        }
        return c;
    }

    public static int[] generate_random_int_array(int length) {
        int[] c = new int[length];
        for (int i = 0; i < c.length; i++) {
            c[i] = (int) (Math.random() * 100);
        }
        return c;
    }

    public static float[][] generate_random_2d_array(int rows, int columns) {
        float[][] c = new float[rows][columns];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = (float) Math.random() * 100;
            }
        }
        return c;
    }

    public static int[] fill_6_digit_array() {
        int[] p = new int[6]; // Or { -1, -1, -1, -1, -1, -1 }
        Arrays.fill(p, -1);
        return p;
    }

    public static float get_largest_value(float[] c) {
        float largest = c[0];
        for (int i = 1; i < c.length; i++) {
            if (c[i] > largest) {
                largest = c[i];
            }
        }
        return largest;
    }


    public static int[] reverse_array(int[] c) {
        int[] b = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            b[i] = c[c.length - i - 1];
        }
        return b;
    }

    //...
    //? This was the wrong question.
    //? This was 6.7 e) not 6.8 e)
    public static void print_2d_array(float[][] c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static float get_product_of_elements(float[] w) {
        float product = 0;

        for (int i = 2; i < 10; i++) {
            if(i == 2) {
                product = w[i];
                continue;
            }

            product *= w[i];
        }

        return product;
    }


    public static int[] set_elements_to_zero(int[] array) {
        for(int i = 10; i <= 20; i++) {
            array[i] = 0;
        }

        return array;
    }

    public static int[] multiply_elements_by_2(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }

        return array;
    }

    public static int[] generate_and_sort_array(int length) {
        int[] array = generate_random_int_array(length);
        Arrays.sort(array);
        return reverse_array(array);
    }


    public static void print_array(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.printf("%d: %d%n", i + 1, array[i]);
        }
    }

}
