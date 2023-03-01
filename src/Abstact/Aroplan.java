package Abstact;

public class Aroplan extends Veh{
    @Override
    public void walk() {
        System.out.println("Aroplan Is Flying");
    }

    public static void main(String[] args) {
        Aroplan garuda = new Aroplan();
        garuda.func();
        garuda.fuel();
        garuda.walk();
    }
}
