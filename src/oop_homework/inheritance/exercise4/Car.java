package oop_homework.inheritance.exercise4;

public class Car {
    private int passengerCount;
    private char engineType;

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount >= 2) {
            this.passengerCount = passengerCount;
        } else this.passengerCount = 2;
    }

    public char getEngineType() {
        return engineType;
    }

    public void setEngineType(char engineType) {
        if (Character.isLetter(engineType)) {
            this.engineType = engineType;
        }
    }
}
