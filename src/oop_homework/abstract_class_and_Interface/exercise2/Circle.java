package oop_homework.abstract_class_and_Interface.exercise2;

public class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("For drawing circle we need callipers");
    }

    @Override
    void erase() {
        System.out.println("For drawing circle we need rubber");
    }
}
