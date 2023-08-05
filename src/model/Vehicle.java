package model;

public interface Vehicle {
    void start();

    default void honk() {
        System.out.println("Honking the horn!");
    }
}
