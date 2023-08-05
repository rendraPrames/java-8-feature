package model;

// Kelas Car mengimplementasikan antarmuka Vehicle, namun tidak perlu mengimplementasikan metode honk().
public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starting...");
    }
}
