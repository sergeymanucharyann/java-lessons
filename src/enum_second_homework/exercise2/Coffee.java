package enum_second_homework.exercise2;

public class Coffee {

    void callCoffeeSize() {
        for (int i = 0; i < coffeeSize.length; i++) {
            System.out.println(coffeeSize[i].name() + " " + coffeeSize[i].ordinal());
        }
    }

    CoffeeSize[] coffeeSize = new CoffeeSize[]{CoffeeSize.SMALL, CoffeeSize.MEDIUM, CoffeeSize.LARGE};
}
