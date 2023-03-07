package enum_second_homework.exercise1;

import enum_second_homework.rewrith.exercise1.ChangeLight;
import enum_second_homework.rewrith.exercise1.ChangeState;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        LightState lightState = new LightState();
//        lightState.changeState(2);
        ChangeLight  changeLight = new ChangeLight();
        changeLight.changeState();
    }
}
