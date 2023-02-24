package oop_homework.inheritance;

public class Main {
    public static void main(String[] args) {
        Childe childe = new Childe();
        childe.showMassage();
        System.out.println();

        childe.massageCall();

        Student stu = new Student();
        stu.multiple(5, 6, 7);

        Lecturer lecturer = new Lecturer();
        lecturer.setDocentDegree(true);

    }


}
