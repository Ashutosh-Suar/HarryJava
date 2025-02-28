package HarryJava;

// Problem 1
class Employee1 {

    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

// Problem 2
class Cellphone {

    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void callFriend() {
        System.out.println("Calling a friend...");
    }
}

// Problem 3
class Square {

    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

// Problem 4
class Rectangle {

    int length;
    int breadth;

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }
}

// Problem 5
class TommyVecetti {

    public void hit() {
        System.out.println("Hitting the enemy.");
    }

    public void run() {
        System.out.println("Running from the enemy");
    }

    public void fire() {
        System.out.println("Firing on the enemey.");
    }
}

// Problem 6
class Circle {

    double radius;

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

public class cwh_39_ch8_ps {
    public static void main(String[] args) {

        // Problem 1
        Employee1 harry = new Employee1();
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println();

        // Problem 2
        Cellphone samsung = new Cellphone();
        samsung.ring();
        samsung.vibrate();
        samsung.callFriend();
        System.out.println();

        // Problem 3
        Square sq = new Square();
        sq.side = 5;
        System.out.println("The area of square is " + sq.area());
        System.out.println("The perimeter of square is " + sq.perimeter());
        System.out.println();

        // Problem 4
        Rectangle rect = new Rectangle();
        rect.length = 5;
        rect.breadth = 10;
        System.out.println("The area of rectangle is " + rect.area());
        System.out.println("The perimeter of rectangle is " + rect.perimeter());
        System.out.println();

        // Problem 5
        TommyVecetti player = new TommyVecetti();
        player.hit();
        player.run();
        player.fire();
        System.out.println();

        // Problem 6
        Circle cir = new Circle();
        cir.radius = 5;
        System.out.println(cir.area()); // 78.53
        System.out.println(cir.circumference()); // 31.415

    }
}
