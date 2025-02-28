package HarryJava;

class Base {
    public int x;

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting x now");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a constructor");
    }

}

class Derived extends Base {
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

// Quick Quiz
class Animal {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Dog extends Animal {
    public int weight;
    public String sex;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}

public class cwh_45_inheritance {

    public static void main(String[] args) {

        // Creating an object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
        System.out.println();

        // Quick Quiz

        // Creating an object of Animal class
        Animal ani = new Animal();
        ani.setAge(13);
        ani.setName("Scooby");
        System.out.println(ani.getAge() + " yrs");
        System.out.println(ani.getName());
        System.out.println();

        // Creating an object of Dog class
        Dog dog = new Dog();
        dog.setWeight(25);
        dog.setSex("Male");
        System.out.println(dog.getWeight() + " Kg");
        System.out.println(dog.getSex());

    }
}
