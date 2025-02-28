package HarryJava;

interface Bicycle {
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements Bicycle{
    void blowHorn() {
        System.out.println("Pee Pee Poo Poo...");
    }
    
    public void applyBrake(int decrement) {
        System.out.println("Applying brake");
    }

    public void speedUp(int increment) {
        System.out.println("Applying speed up");
    }

}

public class cwh_54_interfaces {
    
    public static void main(String[] args) {
        
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);

    }
}
