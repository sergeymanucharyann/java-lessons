package enum_second_homework.exercise3;

public enum Planet {
    MARS("6.39 × 10^23 kg"),
    EARTH("5.972 * 10^24 kg"),
    JUPITER("1.898 × 10^27 kg"),
    VENERA("3.285 × 10^23 kg");

    String str;

    Planet(String mass) {
        str = mass;
    }
}
