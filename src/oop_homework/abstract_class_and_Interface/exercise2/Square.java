package oop_homework.abstract_class_and_Interface.exercise2;

public class Square extends Shape {

    @Override
    void draw() {
        System.out.println("For drawing circle we need rule");
    }

    @Override
    void erase() {
        System.out.println("For drawing circle we need big rubber");
    }
}
