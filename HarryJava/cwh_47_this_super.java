package HarryJava;

class EkClass {
    int a;

    public int getA() {
        return a;
    }

    EkClass(int a) {
        this.a = a;
    }

}

class DoClass extends EkClass {

    DoClass(int c) {
        super(c);
        System.out.println("I am a constructor");
    }
}

public class cwh_47_this_super {

    public static void main(String[] args) {

        EkClass e = new EkClass(69);
        System.out.println(e.getA());

        // DoClass d = new DoClass(61);

    }
}
