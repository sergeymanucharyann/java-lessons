package oop_homework.inheritance;

public class Student extends Human {

    @Override
    int multiple(int x, int y) {
        return x + y;
    }

    int multiple(int x, int y, int z) {
        return x + y + z;
    }

    int multiple(int x, int y, int z, int c) {
        return x + y + z + c;
    }

}
