package oop_homework.abstract_class_and_Interface.exercise4;

public class Arithmetic implements Test {
    @Override
    public double square(int x) {
        return Math.pow(x, 2);
    }
}

