package oop_homework.inheritance.exercise1and2;

import oop_homework.inheritance.exercise3.Lecturer;
import oop_homework.inheritance.exercise3.Student;

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
