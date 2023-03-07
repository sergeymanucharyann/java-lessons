package enum_second_homework.rewrith.exercise1;

public class ChangeLight extends ChangeState {
    LightStage lightStage = LightStage.RED;

    @Override
    public void changeState() throws InterruptedException {
        switch (lightStage) {
            case RED -> {
                System.out.println(LightStage.RED.name());
                Thread.sleep(5000);
            }
            case YELLOW -> {
                System.out.println(LightStage.YELLOW.name());
                Thread.sleep(5000);
            }
            case GREEN -> {
                System.out.println(LightStage.GREEN.name());
                Thread.sleep(5000);
            }
        }
    }
}
