package HarryJava;

// Problem 1
class Cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Problem 2
    public double surfaceArea() {
        return 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Problem 3
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

}

// Problem 4
class MyRectangle {
    private int length;
    private int breadth;

    public MyRectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public MyRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

// Problem 5
class Sphere {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double volume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }
}

public class cwh_44_ch9_PS {

    public static void main(String[] args) {

        // Problem 1 and Problem 3
        Cylinder cy = new Cylinder(6, 5);
        // cy.setRadius(5);
        // cy.setHeight(9);
        System.out.println("The radius of the cylinder is " + cy.getRadius());
        System.out.println("The height of the cylinder is " + cy.getHeight());
        System.out.println();

        // Problem 2
        System.out.println("The surface area of the cylinder is " + cy.surfaceArea());
        System.out.println("The volume of the cylinder is " + cy.volume());
        System.out.println();

        // Problem 4
        MyRectangle rect = new MyRectangle(12, 56);
        System.out.println("The lenght of rectangle is " + rect.getLength());
        System.out.println("The breadth of rectangle is " + rect.getBreadth());
        System.out.println();

        // Problem 5
        Sphere sph = new Sphere();
        sph.setRadius(5);
        System.out.println("The surface area of the cylinder is " + sph.surfaceArea());
        System.out.println("The volume of the cylinder is " + sph.volume());

    }
}
