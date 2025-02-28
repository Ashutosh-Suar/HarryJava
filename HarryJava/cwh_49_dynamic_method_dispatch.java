package HarryJava;

class Phone {

    public void showTime() {
        System.out.println("Time is 8 am.");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {

    public void music() {
        System.out.println("Playing Music...");
    }

    public void on() {
        System.out.println("Turning on Smartphone...");
    }
}

public class cwh_49_dynamic_method_dispatch {

    public static void main(String[] args) {

        // Phone obj = new Phone();
        // obj.name();
        // obj.greet();

        // System.out.println();

        // Smartphone obj1 = new Smartphone();
        // obj1.name();
        // obj1.swagat();

        Phone obj = new SmartPhone();
        obj.showTime();
        obj.on();
        

    }
}
