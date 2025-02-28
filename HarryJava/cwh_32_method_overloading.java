package HarryJava;

public class cwh_32_method_overloading {

    static void foo() {
        System.out.println("Good morning bro!");
    }

    static void foo(int a) {
        System.out.println("Good morning "+a+" bro!");
    }

    static void foo(int a , int b) {
        System.out.println("Good morning "+a+" bro!");
        System.out.println("Good morning "+b+" bro!");
    }

    public static void tellJoke() {
        System.out.println("I invented a new word plagiarism");
    }

    public static void change2(int arr[]) {
        arr[0] = 98;
    }

    public static void main(String[] args) {

        // tellJoke();
        int marks[] = { 52, 73, 77, 89, 98, 94 };

        change2(marks);
        System.out.println("After running the " + marks[0]);

        // Method overloading

        foo();
        foo(1000);
        // Arguments are actual.
        foo(5000,9000);
    }
}
