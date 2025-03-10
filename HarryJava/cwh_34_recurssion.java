package HarryJava;

public class cwh_34_recurssion {

    static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    static int factorial_iterative(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }

    }

    public static void main(String[] args) {

        System.out.println("The factorial of the number by recursive method is " + factorial(5));
        System.out.println("The factorial of the number by iterative method is " + factorial_iterative(5));

    }

}
