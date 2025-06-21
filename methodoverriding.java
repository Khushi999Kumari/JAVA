class Vehicle {
    void run() {
        System.out.println(x:"the Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println(x:"the bike is running");
    }
}

class Main {
public static void main(String args[]) {
        Vehicle obj = new Bike(); // upcasting
        obj.run(); // runs the method in Bike class

public static void main(String[] args) {
