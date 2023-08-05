package model;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Sebuah metode untuk mencetak detail karyawan.
    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}