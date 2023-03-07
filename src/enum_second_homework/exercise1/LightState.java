package enum_second_homework.exercise1;

public class LightState extends States {
    /**
     * Ex.1
     *
     * @param trys int
     */
    @Override
    void changeState(int trys) throws InterruptedException {
        for (int j = 0; j < trys; j++) {

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i].name());

                if (array[i].name() == TrafficLights.RED.name()) {
                    Thread.sleep(30000);
                } else if (array[i].name() == TrafficLights.GREEN.name()) {
                    Thread.sleep(30000);
                } else Thread.sleep(5000);

//                    try {
//                        Thread.sleep(5000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
            }
        }
    }

    TrafficLights[] array = new TrafficLights[]{TrafficLights.RED, TrafficLights.YELLOW, TrafficLights.GREEN};

}
