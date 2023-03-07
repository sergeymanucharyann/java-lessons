package enum_second_homework.exercise1;

public class LightState extends States {
    /**
     * Ex.1
     *
     * @param trys int
     */
    @Override
    void changeState(int trys) {
        for (int j = 0; j < trys; j++) {

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i].name());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    TrafficLights[] array = new TrafficLights[]{TrafficLights.RED, TrafficLights.YELLOW, TrafficLights.GREEN};

}
