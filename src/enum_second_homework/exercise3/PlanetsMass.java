package enum_second_homework.exercise3;

public class PlanetsMass {
    void planetsNameAndMass() {
        for (int i = 0; i < planets.length; i++) {
            System.out.println(planets[i].name() + ": " + planets[i].str);
        }
    }

    Planet[] planets = new Planet[]{Planet.JUPITER, Planet.EARTH, Planet.VENERA, Planet.MARS};
}
