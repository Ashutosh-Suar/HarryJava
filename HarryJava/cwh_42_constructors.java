package HarryJava;

class MyMainEmployee {

    private int id;
    private String name;

    public MyMainEmployee() {
        id = 45;
        name = "Your-Name-Here";
    }

    public MyMainEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public MyMainEmployee(String myName) {
        id = 1;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

}

public class cwh_42_constructors {

    public static void main(String[] args) {

        // MyMainEmployee harry = new MyMainEmployee("Programming With Harry", 69);
        // MyMainEmployee harry = new MyMainEmployee();
        MyMainEmployee harry = new MyMainEmployee("Ash Anna");
        // harry.setName("Code With Harry");
        // harry.setId(69);
        // System.out.println(harry.getName());
        // System.out.println(harry.getId());

        System.out.println(harry.getId());
        System.out.println(harry.getName());

    }
}
