package HarryJava;

public class cwh_35_praticeSetOnMethods {

    // problem 1
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d \n", n, i, n * i);
        }
    }

    // problem 2
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    // problem 3
    static int sumRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRecursion(n - 1);
        }
    }

    // problem 4
    static void pattern2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    // problem 5
    // Fibonacci series : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    static int fibonacci(int n) {
        // if (n == 1) {
        // return 0;
        // }
        // else if (n == 2) {
        // return 1;
        // }

        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // problem 6
    static double average(double... numbers) {

        if (numbers.length == 0) {
            return 0;
        }

        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    // problem 8
    static void pattern1_recursive(int n) {

        if (n > 0) {
            pattern1_recursive(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    // problem 9
    static double temperature(double celsius) {

        return ((celsius * 9) / 5) + 32;
    }

    public static void main(String[] args) {

        // problem 1
        int x = 7;
        multiplication(x);
        System.out.println();

        // problem 2
        pattern1(5);
        System.out.println();

        // problem 3
        System.out.println("The sum of numbers is " + sumRecursion(100));
        System.out.println();

        // problem 4
        pattern2(4);
        System.out.println();

        // problem 5
        int result = 5;
        System.out.println(fibonacci(result));
        System.out.println();

        // problem 6
        System.out.println("The average of the numbers is " + average(89, 55, 100, 50, 74, 69, 61, 99, 95, 65, 92, 140));
        System.out.println();

        // problem 8
        pattern1_recursive(9);
        System.out.println();

        // problem 9
        double fahrenheit = 100;
        System.out.println("The temperature in fahrenheit is " + temperature(fahrenheit) + "°F");

    }
}
