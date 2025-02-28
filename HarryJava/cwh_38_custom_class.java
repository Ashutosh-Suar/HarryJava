package HarryJava;

class Employee {

    int id;
    String name;
    int salary;

    public void printDetails() {

        System.out.print("My id is " + id);
        System.out.print(". My name is " + name);
        System.out.println(" and my salary is " + salary + ".");
    }

    // public int getSalary() {

    //     return getSalary();
    // }

}

public class cwh_38_custom_class {
    public static void main(String[] args) {

        System.out.println("This is our custom class");

        Employee harry = new Employee();
        Employee john = new Employee();

        // Setting Attributes
        harry.id = 12;
        harry.name = "Code with Harry";
        harry.salary = 50000;

        john.id = 69;
        john.name = "John Abhram";
        john.salary = 30000;

        // Printing the Attributes
        // System.out.println(harry.id);
        // System.out.println(harry.name);

        harry.printDetails();
        john.printDetails();

    }
}
