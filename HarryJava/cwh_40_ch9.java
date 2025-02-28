package HarryJava;

class MyEmployee {

    private int id;
    private String name;

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

public class cwh_40_ch9 {
    public static void main(String[] args) {

        MyEmployee harry = new MyEmployee();

        // harry.id = 45;
        // harry.name = "Code With Harry"; Throws an error due to private access
        // modifier

        harry.setName("Code With Harry");
        System.out.println(harry.getName());
        harry.setId(69);
        System.out.println(harry.getId());

    }
}
