package HarryJava;

// Problem 1 and  Problem 3
class Circle1 {
    public int radius;

    Circle1(int r) {
        System.out.println("I am a Circle1 parameterised constructor.");
        this.radius = r;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Cylinder1 extends Circle1 {
    public int height;

    Cylinder1(int r, int h) {
        super(r);
        System.out.println("I am a Cylinder1 parameterised constructor.");
        this.height = h;
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

}

// Problem 2 and Problem 4
class Rectangle1 {
    public int length;
    public int breadth;

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

}

class Cuboid extends Rectangle1 {
    public int height;

    public int volume() {
        return length * breadth * height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}

public class cwh_52_ch10ps {

    public static void main(String[] args) {

        // Problem 1 and Problem 3
        // Circle1 objC = new Circle1(5);
        Cylinder1 obj = new Cylinder1(12, 4);
        System.out.println("The area of the circle is " + obj.area());
        System.out.println();

        // Problem 2 and Problem 4
        Cuboid cub = new Cuboid();
        cub.setLength(5);
        cub.setBreadth(6);
        cub.setHeight(9);
        System.out.println("The volume of the cuboid is " + cub.volume());
        System.out.println("The area of the rectangle is " + cub.area());
        System.out.println("The perimeter of the rectangle is " + cub.perimeter());

    }
}
