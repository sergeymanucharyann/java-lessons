package oop_homework.inheritance.exercise1and2;

public abstract class Parent {
    private String massege = "Hello SuperClass class";

    public String getMassege() {
        return massege;
    }

    public void setMassege(String massege) {
        this.massege = massege;
    }


    void showMassege() {
        System.out.println("Hello Parent class");
    }

    abstract void showMassage();
}
