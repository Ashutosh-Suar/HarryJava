package HarryJava;

public class cwh_33_varargs {

    // Varargs
    static int sum(int... arr) {

        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;

    }

    static int sum1(int x, int... arr) {

        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result;

    }

    public static void main(String[] args) {

        System.out.println("The sum of the numbers are " + sum(2, 3, 5, 7, 3));
        System.out.println("The sum is " + sum1(2));
    }
}
