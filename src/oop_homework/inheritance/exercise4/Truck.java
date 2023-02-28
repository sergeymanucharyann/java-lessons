package oop_homework.inheritance.exercise4;

public class Truck extends Car {

    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Truck() {
        super();
        this.getCapacity();
    }

}
