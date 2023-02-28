package oop_homework.inheritance.exercise1and2;

public class Childe extends Parent {

    private String massege = "Hello SubClass class";

    public String getMassege() {
        return massege;
    }

    public void setMassege(String massege) {
        this.massege = massege;
    }


    /**
     * Exercise 1
     * This method is used for print
     * massege from SuperClass and SubClass.
     */
    @Override
    void showMassage() {
        super.showMassege();
        System.out.println("Hello Child class");
    }

    /**
     * Exercise 2
     * This method used for print the massege variable
     * from SuperClass and SubClass.
     */
    void massageCall() {
        String massage1 = this.massege;
        System.out.println(super.getMassege());
        System.out.println(massage1);
    }
}
