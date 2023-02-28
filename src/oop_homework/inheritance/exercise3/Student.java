package oop_homework.inheritance.exercise3;

public class Student extends Human {

    @Override
    int multiple(int x, int y) {
        return x + y;
    }

    public int multiple(int x, int y, int z) {
        return x + y + z;
    }

    int multiple(int x, int y, int z, int c) {
        return x + y + z + c;
    }

}
