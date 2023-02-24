package oop_homework.inheritance;

public class Parent {
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
}
