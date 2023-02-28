package oop_homework.abstract_class_and_Interface.exercise2;

public class Triangle extends Shape{
    @Override
    void draw() {
        System.out.println("For drawing circle we need triangle rule");
    }

    @Override
    void erase() {
        System.out.println("For drawing circle we need triangle rubber");
    }
}

