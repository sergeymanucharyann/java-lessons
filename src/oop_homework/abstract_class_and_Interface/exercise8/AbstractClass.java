package oop_homework.abstract_class_and_Interface.exercise8;

public abstract class AbstractClass {
    AbstractClass(){
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();

    void non_abstract(){
        System.out.println("This is a normal method of abstract class");
    }
}
